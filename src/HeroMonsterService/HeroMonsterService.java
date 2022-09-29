package HeroMonsterService;


import ObjectClasses.Source.GeneratorAttack;
import Repository.HeroRepository;
import Repository.MonsterRepository;

public class HeroMonsterService  implements HeroAndMostersImpl{
    private HeroRepository heroService;
    private MonsterRepository monsterService;
    private GeneratorAttack attack;

    public HeroMonsterService(HeroRepository heroRep, MonsterRepository monsterRap) {
        this.heroService = heroRep;
        this.monsterService = monsterRap;
        this.attack = new GeneratorAttack();
    }


    @Override
    public void heroAttack(String  hero, String monster) {
        System.out.printf("Hero have %d HP, Moster have %d HP", heroService.findHero(hero).getHealth(),
                monsterService.findMonster(monster).getHealth() );
        System.out.print("\nHero attack");

        int totalHealth = monsterService.findMonster(monster).getHealth() - attack.getHeals();
        monsterService.findMonster(monster).setHealth(totalHealth);

        if(totalHealth>1) {
            System.out.printf("\nMonster have %d HP\n", totalHealth);

        }
        else {
            System.out.println("\nMonster is dead\n");
            System.out.println("\nYou WIN\n");

        }
    }
    @Override
    public void mostrAttack(String  monster, String hero) {
        System.out.printf("Moster have %d HP, Hero have %d HP",monsterService.findMonster(monster).getHealth(),
                heroService.findHero(hero).getHealth());
        System.out.print("\nMonstr attack");

        int totalHealth = heroService.findHero(hero).getHealth() - attack.getHeals();
        heroService.findHero(hero).setHealth(totalHealth);

        if(totalHealth>1) {
            System.out.printf("\nHero have %d HP\n", totalHealth);
        }
        else {
            System.out.println("\nHero is dead\n");
            System.out.println("\nYou Lose\n");

        }
    }
}











// остановился тут посмотреть как лучше сделать, отдельные hero репу и передавать
// потом сервис в общий сервис а не репозиториии
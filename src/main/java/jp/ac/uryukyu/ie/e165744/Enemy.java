package jp.ac.uryukyu.ie.e165744;

public class Enemy extends LivingThing{

    public Enemy (String name, int maximumHP, int attack) {
        super(name ,maximumHP ,attack);
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
    @Override
    public void wounded(int damage){
        setHitPoint(getHitPoint()-damage);
        if( getHitPoint() < 0 ) {
            setIsDead(true);
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }
}
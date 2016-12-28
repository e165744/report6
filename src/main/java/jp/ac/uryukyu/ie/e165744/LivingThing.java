package jp.ac.uryukyu.ie.e165744;

/**
 * Created by e165744 on 2016/12/26.
 */
public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing(String name, int hitPoint, int attack) {
        this.name = name;
        this.attack = attack;
        this.hitPoint = hitPoint;
    }

    public boolean getIsDead() {
        return dead;
    }

    public void setIsDead(boolean dead) {
        this.dead = dead;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(LivingThing opponent) {
        int damage = (int) (Math.random() * attack);
        if (hitPoint >= 0) {
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        } else {
        }
        opponent.wounded(damage);
    }
    public void setAttack(LivingThing opponent) {
        this.attack = attack;
    }

    public int getHitPoint(){
        return hitPoint;
    }

    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }


    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
        }
    }
}

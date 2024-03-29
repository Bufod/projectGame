package com.company;

public class Boss {
    private float hp, damage;
    private int lvl, vAtt;
    private String name;
    Boss(String name, float hp, float damage, int lvl, int vAtt){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.lvl = lvl;
        this.vAtt = vAtt;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public String getName() {
        return name;
    }

    void skill(Person pr){
        System.out.println("Ход босса");
        float res_dmg = (damage*lvl)+vAtt;
        pr.checkDmg(res_dmg);
    }
    void checkDmg(float inDamage){
        this.hp -= inDamage;
        System.out.println("\tОсталось здоровья босса: " + hp);
    }

    public float getHp() {
        return hp;
    }
}

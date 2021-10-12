package com.github.npu4.character;

public abstract class Character {
    private int position;
    private int health;
    private String name;
    private String type;

    Character() {
    }

    Character(int position, String name, String type, int health) {
        this.position = position;
        this.health = health;
        this.name = name;
        this.type = type;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract void attack(Character[] battlers, int damage);


    public boolean isDead() {
        return getHealth() <= 0;
    }

    public abstract Character clone();


    @Override
    public String toString() {
        return "Character{" +
                "position=" + position +
                ", health=" + health +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

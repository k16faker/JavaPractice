package com.myproject.practice;

public class Monsters {

	String name;
	int level;
	int hp;
	int atk;
	int def;
	boolean alive;

	Monsters(String name, int level, int hp, int atk, int def, boolean alive) {
		this.name = name;
		this.level = level;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.alive = alive;
	}

	void info() {
		System.out.printf(" name : %s\n level : %d\n hp : %d\n atk : %d\n def : %d\n\n", name, level, hp, atk, def);
	}


	void setHp(int hp) {
		this.hp = hp;
	}

	void attacked(int heroAtk) {
		setHp(this.hp - heroAtk);
	}

	void setDeadOrAlive() {
		if (this.hp < 0) {
			this.alive = false;
		}
	}


}

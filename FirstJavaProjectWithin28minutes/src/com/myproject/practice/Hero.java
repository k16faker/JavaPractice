package com.myproject.practice;

public class Hero {

	String job;
	int hp;
	int mp;
	int atk;
	int def;

	Hero(String job, int hp, int mp, int atk, int def) {
		this.job = job;
		this.hp = hp;
		this.mp = mp;
		this.atk = atk;
		this.def = def;
	}

	void info() {
		System.out.printf(" job : %s\n hp : %d\n mp : %d\n atk : %d\n def : %d\n\n", job, hp, mp, atk, def);
	}

	void setHp(int hp) {
		this.hp = hp;
	}

	void forCountHp(int enemyAtk) {
		setHp(this.hp - enemyAtk);
	}

	int attack() {
		return atk;
	}
}

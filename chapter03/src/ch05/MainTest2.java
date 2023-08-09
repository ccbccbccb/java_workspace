package ch05;

import starcraft.Marine;
import starcraft.Unit;
import starcraft.Zealot;
import starcraft.Zergling;

public class MainTest2 {

	public static void main(String[] args) {
		// Unit 이라는 배열에 저글링, 질럿, 마린을 담아 보세요.
		// 실행도 시켜봅시다.
		Unit zealot1 = new Zealot("질럿1");
		Unit zealot2 = new Zealot("질럿2");
		Unit zealot3 = new Zealot("질럿3");
		Unit marine1 = new Marine("마린1");
		Unit marine2 = new Marine("마린2");
		Unit marine3 = new Marine("마린3");
		Unit zergling1 = new Zergling("저글링1");
		Unit zergling2 = new Zergling("저글링2");
		Unit zergling3 = new Zergling("저글링3");

		Unit[] arrUnit = new Unit[10];

		arrUnit[0] = zealot1;
		arrUnit[1] = zealot2;
		arrUnit[2] = zealot3;
		arrUnit[3] = marine1;
		arrUnit[4] = marine2;
		arrUnit[5] = marine3;
		arrUnit[6] = zergling1;
		arrUnit[7] = zergling2;
		arrUnit[8] = zergling3;

		arrUnit[0].attack(arrUnit[1]);
		arrUnit[1].attack(arrUnit[2]);
		arrUnit[2].attack(arrUnit[3]);
		arrUnit[3].attack(arrUnit[4]);
		arrUnit[4].attack(arrUnit[5]);
		arrUnit[5].attack(arrUnit[6]);
		arrUnit[6].attack(arrUnit[7]);
		arrUnit[7].attack(arrUnit[8]);
		arrUnit[8].attack(arrUnit[0]);
		
		for (int i = 0; i < 9; i++ ) {
			arrUnit[i].showInfo();
		}

	} // end of main

} // end of class

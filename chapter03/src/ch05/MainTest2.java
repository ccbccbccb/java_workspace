package ch05;

import starcraft.Marine;
import starcraft.Unit;
import starcraft.Zealot;
import starcraft.Zergling;

public class MainTest2 {

	public static void main(String[] args) {
		// Unit �̶�� �迭�� ���۸�, ����, ������ ��� ������.
		// ���൵ ���Ѻ��ô�.
		Unit zealot1 = new Zealot("����1");
		Unit zealot2 = new Zealot("����2");
		Unit zealot3 = new Zealot("����3");
		Unit marine1 = new Marine("����1");
		Unit marine2 = new Marine("����2");
		Unit marine3 = new Marine("����3");
		Unit zergling1 = new Zergling("���۸�1");
		Unit zergling2 = new Zergling("���۸�2");
		Unit zergling3 = new Zergling("���۸�3");

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

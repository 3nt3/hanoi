package xyz.ente.towerOfHanoi;

import java.util.ArrayList;

import basis.*;

public class TowerOfHanoiWindow extends Fenster implements KnopfLauscher{
	
	private ArrayList<Integer> tower1;
	private ArrayList<Integer> tower2;
	private ArrayList<Integer> tower3; 
	
	private Knopf[] buttons;
	
	private void initGUI() {
		this.setzeSichtbar(true);
		
		tower1 = new ArrayList<Integer>();
		tower1.add(4);
		tower1.add(3);
		tower1.add(2);
		tower1.add(1);
		
		buttons = new Knopf[4];
		
		for (int i = 0; i < 4; i++) {
			Knopf button = new Knopf("", 50, 400-(i*50), 100, 40);
			buttons[i] = button;
		}
		
		this.view();
	}
	
	// updates the view (sets button positions)
	private void view() {
		for (int i = 0; i < 4; i++) {
			buttons[i].gibFrei();
		}
		
		for (int i = 0; i < tower1.size(); i++) {
			if (tower1.get(i) <= 0) {
				continue;
			}
		
			
		}
	}

	public TowerOfHanoiWindow() {
		this.initGUI();
	}
	
	@Override
	public void bearbeiteKnopfDruck(Knopf arg0) {
		// TODO Auto-generated method stub
		
	}

}

package button.specialButton;

import processing.core.*;
import screen.*;
import java.util.*;

public class AnsButton extends SpecialButton{
	
	public AnsButton(PApplet papplet, float positionX, float positionY, float sizeX, float sizeY, int r, int g, int b) {
		super(papplet, "Ans", positionX, positionY, sizeX, sizeY, r, g, b);
	}

	@Override
	public boolean isAvailable(Screen screen, Queue<String> history) {
		if(history.size() == 0) {
			return false;
		}
		return true;
	}
	
	@Override
	public void function(Screen screen, Queue<String> history) {
		if(this.isAvailable(new Screen(this.papplet), history)) {
			screen.addShow(history.remove());
		}
	}
	
}
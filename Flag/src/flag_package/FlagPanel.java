package flag_package;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class FlagPanel extends JPanel implements KeyListener {
	private int x, y, x1, y1;
	private boolean b, flag1;
	private static final long serialVersionUID = 1L;

	public FlagPanel() {
		addKeyListener(this);
		setFocusable(true);
		x = 20;
		y = 400;
		x1 = 740;
		y1 = 400;
		b = false;
	}

	/*
	 * Make a capture the flag game...
	 */

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.BLUE);
		g.setColor(new Color(179, 77, 170));

		g.fillOval(x, y, 30, 30);
		g.setColor(Color.YELLOW);
		g.fillOval(x1, y1, 30, 30);
		g.setColor(Color.CYAN);
		g.fillRect(390, 0, 30, 800);
		g.setColor(Color.RED);
		g.fillOval(0, 400, 30, 30);
		g.fillOval(750, 400, 30, 30);
	}

	public void keyPressed(KeyEvent k) {
		int key = k.getKeyCode();
		if (key == KeyEvent.VK_UP) {
			y1 = y1 - 9;
			// System.ut.println("UP");
		} else if (key == KeyEvent.VK_DOWN) {
			y1 = y1 + 9;
			// System.out.println("DOWN");
		} else if (key == KeyEvent.VK_RIGHT) {
			x1 = x1 + 10;
		} else if (key == KeyEvent.VK_LEFT) {
			x1 = x1 - 9;
		} else if (key == KeyEvent.VK_ENTER && b == false) {
			x1 = 0;
			y1 = 400;
			b = true;
		} else if (key == KeyEvent.VK_ENTER && b == true) {
			x1 = 20;
			y1 = 20;
			b = false;

		}
		if (y1 < 407 && y1 > 398 && x1 < 7 && x1 > -2) {
			flag1 = true;
			System.out.println("flag1");
		}

		repaint();
	}

	public void keyTyped(KeyEvent e) {
		char key = e.getKeyChar();

		if (key == 'w') {
			y = y - 9;
		} else if (key == 's') {
			y = y + 9;
		} else if (key == 'd') {
			x = x + 9;
		} else if (key == 'a') {
			x = x - 9;
		}
	}

	public void keyReleased(KeyEvent e) {

	}

}
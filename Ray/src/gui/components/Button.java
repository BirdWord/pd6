package gui.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Button extends TextLabel implements Clickable{
	private Color color;
	private Action action;
	public Button(int x, int y, int w, int h, String text, Color color, Action action) {
		super(x, y, w, h, text);
		this.color = color;
		this.action = action;
		update();
	}
	@Override
	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setColor(color);
		g.fillRoundRect(0, 0, getWidth(), getHeight(), 35, 35);
		g.setColor(Color.PINK);
		g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 35, 35);
		g.setColor(Color.WHITE);
		g.setFont(new Font(this.getFont(), Font.PLAIN, this.getSize()));
		if(this.getText() != null) g.drawString(this.getText(), 4, getHeight()-5);
	}
	@Override
	public boolean isHovered(int x, int y) {
		return x >= getX() && x <= getX()+getWidth() && y >= getY() && y <= getY()+getHeight();
	}
	@Override
	public void act() {
		action.act();
	}
	/*For a challenge, try to center the text in the rectangular block. This is optional, but looks way better. It is challenging, so you can also come back to it later. To center text, you will need the following:
	You will need to measure the pixel width of individual words to see how many words you can String together to make a whole line that does not exceed the width. This can be done using a class called FontMetrics, (imported from java.awt)which can be obtained accordingly:
	FontMetrics fm = g.getFontMetrics();
	It is helpful if you can take the text argument and split it into individual words. This can be done using the line:
	String[] words = getText().split(" ");//splits word at every space
	The following methods from FontMetrics are especially useful:
	fm.getHeight() returns the pixel height of the font. This includes ascenders, but not descenders (e.g. The height of CAPITAL letters.)
	fm.getAscent() returns the pixel height of ascenders (extra height of letters like d,t,h,l,k,b, etc)
	fm.getDescent() returns the pixel height of descenders (extra height of letters like j,g,p,q, etc)
	fm.stringWidth(String s) returns the pixel width of the String s, in the current font.
	 */
}

package org.example;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import org.example.Element;
import org.example.Position;

public class Wall extends Element {
    public Wall(int x, int y) {
        super(x, y);
    }
    public Position getPosition() {
        return position;
    }
    public void setPosition(Position position) {
        this.position = position;
    }
    public void draw(TextGraphics graphics) {
        graphics.setBackgroundColor(TextColor.Factory.fromString("#000000"));
        graphics.putString(new TerminalPosition(position.getX(), position.getY()), " ");
    }
}

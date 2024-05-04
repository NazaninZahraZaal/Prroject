package swing_javalike;

import javax.swing.*;
import java.awt.*;

public class CirclePanel extends JPanel {
    private Color[] colors = {Color.GREEN, Color.BLACK, Color.RED, Color.BLUE, Color.WHITE};

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int diameter = Math.min(getWidth(), getHeight()) / colors.length; // قطر هر دایره
        int x = 0; // موقعیت افقی ابتدای دایره‌ها
        int y = (getHeight() - diameter) / 2; // موقعیت عمودی ابتدای دایره‌ها

        for (Color color : colors) {
            g.setColor(color); // تنظیم رنگ دایره
            g.fillOval(x, y, diameter, diameter); // رسم دایره
            x += diameter; // افزایش موقعیت افقی برای دایره بعدی
        }
    }


}

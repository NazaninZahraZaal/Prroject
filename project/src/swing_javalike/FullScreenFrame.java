package swing_javalike;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class FullScreenFrame extends JFrame {
    private final int rows = 0;
    private final int cols = 5;
    private final int coinSize = 50; // اندازه سکه‌ها
    private final int margin = 10; // فاصله بین سکه‌ها
    private final Color[] colors = {Color.RED, Color.BLACK, Color.WHITE, Color.BLUE, Color.GREEN};

    private List<Point> coinPositions;

    public FullScreenFrame() {

        // دریافت ابعاد صفحه
        coinPositions = new ArrayList<>();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();

        // کاهش ارتفاع صفحه
        int newScreenHeight = screenHeight - 50; // 100 پیکسل از ارتفاع کم شود

        // تنظیم ابعاد فریم
        setSize(screenWidth, newScreenHeight);

        // ایجاد یک پنل برای قرار دادن دکمه‌ها
        JPanel panel = new JPanel(new GridLayout(1, 3));
        // ایجاد یک JPanel سفارشی برای رسم سکه‌ها به عنوان پس‌زمینه
        // ایجاد یک JPanel سفارشی برای رسم سکه‌ها به عنوان پس‌زمینه
        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Random random = new Random();
                for (int i = 0; i < cols; i++) {
                    int x = i * (coinSize + margin) + margin;
                    int y = margin; // تنظیم مختصات Y به بالای صفحه
                    g.setColor(colors[i % colors.length]); // انتخاب رنگ به صورت چرخشی از آرایه
                    g.fillOval(x, y, coinSize, coinSize);
                    boolean black = colors[i % colors.length].equals(Color.BLACK);
                    boolean red = colors[i % colors.length].equals(Color.RED);
                    boolean blue = colors[i % colors.length].equals(Color.BLUE);
                    boolean green = colors[i % colors.length].equals(Color.GREEN);
                    boolean white = colors[i % colors.length].equals(Color.WHITE);
                    if(black){
                        String numberText = Integer.toString(Player.coin[4]);
                        g.setColor(Color.WHITE);
                        FontMetrics metrics = g.getFontMetrics();
                        int xText = x + (coinSize - metrics.stringWidth(numberText)) / 2;
                        int yText = y + ((coinSize - metrics.getHeight()) / 2) + metrics.getAscent(); // تنظیم مختصات Y برای قرار دادن متن در وسط سکه
                        g.drawString(numberText, xText, yText); // نمایش متن در وسط سکه
                        coinPositions.add(new Point(x, y));
                    }
                    if(blue){
                        String numberText = Integer.toString(Coin.blue);
                        g.setColor(Color.BLACK);
                        FontMetrics metrics = g.getFontMetrics();
                        int xText = x + (coinSize - metrics.stringWidth(numberText)) / 2;
                        int yText = y + ((coinSize - metrics.getHeight()) / 2) + metrics.getAscent(); // تنظیم مختصات Y برای قرار دادن متن در وسط سکه
                        g.drawString(numberText, xText, yText); // نمایش متن در وسط سکه
                        coinPositions.add(new Point(x, y));
                    }
                    if(red){
                        String numberText = Integer.toString(Coin.red);
                        g.setColor(Color.BLACK);
                        FontMetrics metrics = g.getFontMetrics();
                        int xText = x + (coinSize - metrics.stringWidth(numberText)) / 2;
                        int yText = y + ((coinSize - metrics.getHeight()) / 2) + metrics.getAscent(); // تنظیم مختصات Y برای قرار دادن متن در وسط سکه
                        g.drawString(numberText, xText, yText); // نمایش متن در وسط سکه
                        coinPositions.add(new Point(x, y));
                    }
                    if(green){
                        String numberText = Integer.toString(Coin.green);
                        g.setColor(Color.BLACK);
                        FontMetrics metrics = g.getFontMetrics();
                        int xText = x + (coinSize - metrics.stringWidth(numberText)) / 2;
                        int yText = y + ((coinSize - metrics.getHeight()) / 2) + metrics.getAscent(); // تنظیم مختصات Y برای قرار دادن متن در وسط سکه
                        g.drawString(numberText, xText, yText); // نمایش متن در وسط سکه
                        coinPositions.add(new Point(x, y));
                    }
                    if(white){
                        String numberText = Integer.toString(Coin.white);
                        g.setColor(Color.BLACK);
                        FontMetrics metrics = g.getFontMetrics();
                        int xText = x + (coinSize - metrics.stringWidth(numberText)) / 2;
                        int yText = y + ((coinSize - metrics.getHeight()) / 2) + metrics.getAscent(); // تنظیم مختصات Y برای قرار دادن متن در وسط سکه
                        g.drawString(numberText, xText, yText); // نمایش متن در وسط سکه
                        coinPositions.add(new Point(x, y));
                    }                     // تبدیل عدد تصادفی به متن

                    g.setFont(new Font("Arial", Font.BOLD, 20));

                     // تنظیم مختصات X برای قرار دادن متن در وسط سکه

                }

                // ایجاد سکه طلایی
                int goldCoinX = cols * (coinSize + margin) + margin; // مختصات X برای سکه طلایی
                int goldCoinY = margin; // مختصات Y برای سکه طلایی
                g.setColor(Color.YELLOW); // رنگ طلایی
                g.fillOval(goldCoinX, goldCoinY, coinSize, coinSize);
                coinPositions.add(new Point(goldCoinX, goldCoinY));
            }
        };

        add(backgroundPanel, BorderLayout.CENTER);

        // ایجاد یک JPanel سفارشی برای رسم دایره به عنوان پس‌زمینه
        JPanel backgroundPanel1 = new JPanel(new GridLayout(2, 1));

        /*JPanel circlePanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int centerXR = getWidth() / 20; // مرکز دایره در محور X
                int centerYR = margin;; // مرکز دایره در محور Y
                int radiusR = Math.min(getWidth(), getHeight()) / 25; // شعاع دایره (ربع از اندازه کمتر از عرض و ارتفاع)

                g.setColor(Color.RED); // رنگ دایره
                g.fillOval(centerXR - radiusR, centerYR - radiusR, 2 * radiusR, 2 * radiusR); // کشیدن دایره
                g.setColor(Color.WHITE);
                g.setFont(new Font("Arial", Font.BOLD, 20));

                // متنی که می‌خواهید در دایره نمایش دهید
                String numberR = "5"; // مثال: نمایش عدد 5
                FontMetrics metricsR = g.getFontMetrics();
                int xR = centerXR - metricsR.stringWidth(numberR) / 2; // محور X برای متن
                int yR = centerYR + metricsR.getHeight() / 4; // محور Y برای متن
                g.drawString(numberR, xR, yR);
            }
        };*/

        // اضافه کردن دایره به پس‌زمینه
       // backgroundPanel.add(circlePanel1);

        add(panel, BorderLayout.SOUTH);
        // اضافه کردن پنل دایره به پس‌زمینه
        add(backgroundPanel);

        // ایجاد سه دکمه
        JButton button1 = new JButton("Buy a card");
        JButton button2 = new JButton("Reserve a card");
        JButton button3 = new JButton("Slot machine");

        // تنظیم اندازه دکمه‌ها
        Dimension buttonSize = new Dimension(150, 50);
        button1.setPreferredSize(buttonSize);
        button2.setPreferredSize(buttonSize);
        button3.setPreferredSize(buttonSize);

        // تنظیم رنگ پس زمینه و فونت برای هر دکمه
        button1.setBackground(Color.PINK);
        button1.setForeground(Color.WHITE);
        button1.setFont(new Font("Arial", Font.BOLD, 18));

        button2.setBackground(Color.PINK);
        button2.setForeground(Color.WHITE);
        button2.setFont(new Font("Arial", Font.BOLD, 18));

        button3.setBackground(Color.PINK);
        button3.setForeground(Color.WHITE);
        button3.setFont(new Font("Arial", Font.BOLD, 18));

        // اضافه کردن ActionListener برای هر دکمه
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showOptionDialog(
                        FullScreenFrame.this, // تغییر این بخش
                        "Do you want to perform a special action?",
                        "Special Action",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        new Object[]{"Special Button", "Cancel"},
                        "Special Button");
                //Game.playerAction();

                // بررسی نتیجه دیالوگ
                if (result == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(FullScreenFrame.this, "Special action performed!"); // و این بخش
                }
                // کد ایجاد و نمایش دیالوگ
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(FullScreenFrame.this, "Button 2 Clicked!");
                //Game.playerAction();
            }
        });
        JPanel leftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label = new JLabel("Player 1");
        label.setFont(new Font("Arial", Font.BOLD, 24)); // تنظیم فونت و اندازه متن
        label.setForeground(Color.BLACK); // تنظیم رنگ متن
        leftPanel.add(label); // اضافه کردن label به پنل سمت چپ
        add(leftPanel, BorderLayout.WEST); // اضافه کردن پنل سمت چپ به فریم


        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ایجاد دکمه‌های مورد نظر
                JButton RedButton = new JButton("Red Coin");
                JButton GreenButton = new JButton("Green Coin");
                JButton BlueButton = new JButton("Blue Coin");
                JButton WhiteButton = new JButton("White Coin");
                JButton BlackButton = new JButton("Black Coin");

                RedButton.setBackground(Color.RED);
                GreenButton.setBackground(Color.GREEN);
                BlueButton.setBackground(Color.BLUE);
                WhiteButton.setBackground(Color.WHITE);
                BlackButton.setBackground(Color.BLACK);

                RedButton.setForeground(Color.WHITE);
                GreenButton.setForeground(Color.WHITE);
                BlueButton.setForeground(Color.WHITE);
                WhiteButton.setForeground(Color.BLACK);
                BlackButton.setForeground(Color.WHITE);


                RedButton.setBorderPainted(false);
                GreenButton.setBorderPainted(false);
                BlueButton.setBorderPainted(false);
                WhiteButton.setBorderPainted(false);
                BlackButton.setBorderPainted(false);

                RedButton.setFocusPainted(false);
                GreenButton.setFocusPainted(false);
                BlueButton.setFocusPainted(false);
                WhiteButton.setFocusPainted(false);
                BlackButton.setFocusPainted(false);

                Font buttonFont = new Font("Tahoma", Font.BOLD, 18);
                RedButton.setFont(buttonFont);
                GreenButton.setFont(buttonFont);
                BlueButton.setFont(buttonFont);
                WhiteButton.setFont(buttonFont);
                BlackButton.setFont(buttonFont);


                // تغییر اندازه دکمه‌ها
                Dimension buttonSize = new Dimension(200, 50);
                RedButton.setPreferredSize(buttonSize);
                GreenButton.setPreferredSize(buttonSize);
                BlueButton.setPreferredSize(buttonSize);
                WhiteButton.setPreferredSize(buttonSize);
                BlackButton.setPreferredSize(buttonSize);

                // ایجاد یک پنل جدید برای قرار دادن دکمه‌ها
                JPanel dialogPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
                dialogPanel.add(RedButton);
                dialogPanel.add(GreenButton);
                dialogPanel.add(BlueButton);
                dialogPanel.add(WhiteButton);
                dialogPanel.add(BlackButton);

                RedButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton R1Button = new JButton("1 Coin");
                        JButton R2Button = new JButton("2 Coin");

                        // تنظیم ابعاد دکمه‌ها
                        Dimension buttonSize = new Dimension(200, 50);
                        R1Button.setPreferredSize(buttonSize);
                        R2Button.setPreferredSize(buttonSize);

                        // ایجاد پنل برای نمایش دکمه‌ها
                        JPanel dialogPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
                        dialogPanel.add(R1Button);
                        dialogPanel.add(R2Button);

                        // ایجاد دیالوگ
                        JOptionPane optionPane = new JOptionPane(dialogPanel, JOptionPane.PLAIN_MESSAGE, JOptionPane.DEFAULT_OPTION, null, null, null);
                        JDialog dialog = optionPane.createDialog(null, "Buy Coin");

                        // تعریف ActionListener برای دکمه Red Coin
                        R1Button.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                //slotMachine.slotMachineRed(1);
                                //if (slotMachine.SW == 1) {
                                JOptionPane.showMessageDialog(null, "Error!");
                                //} else
                                //  JOptionPane.showMessageDialog(null, "Done!");

                                // انجام کار خاص برای دکمه Red Coin
                                // برای مثال، نمایش پیام
                            }
                        });

                        // تعریف ActionListener برای دکمه Another Button 1
                        R2Button.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                //slotMachine.slotMachineRed(2);

                                // انجام کار خاص برای دکمه Another Button 1
                                // برای مثال، نمایش پیام
                                JOptionPane.showMessageDialog(null, "Done!");
                            }
                        });
                        // نمایش دیالوگ
                        dialog.setVisible(true);
                    }
                });

                // ایجاد دیالوگ با استفاده از پنل جدید
                int result = JOptionPane.showOptionDialog(
                        null,
                        dialogPanel,
                        "Slot machine",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.DEFAULT_OPTION,
                        null,
                        new Object[]{},
                        RedButton); // دکمه پیش‌فرض

                // بررسی نتیجه دیالوگ
                if (result == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Special action performed!");
                }
                //Game.playerAction();
            }
        });

        // اضافه کردن دکمه‌ها به پنل
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        // اضافه کردن پنل به فریم
        add(panel, BorderLayout.SOUTH);

        // تنظیم ویژگی‌های دیگر فریم
        setTitle("Full Screen Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // قرارگیری در وسط صفحه

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FullScreenFrame frame = new FullScreenFrame();
            frame.setVisible(true);
        });
    }
}

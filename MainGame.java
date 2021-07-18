import javax.swing.*;
class frame
{
    frame()
    {
        JFrame f1 = new JFrame("Tic Tac Toe");
        f1.setBounds(150, 50, 500, 500);
        f1.setVisible(true);
    }
    public static void main(String[] args)
    {
        frame obj = new frame();
    }
}

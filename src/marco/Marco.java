/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marco;

import javax.swing.JFrame;
import lamina.Lamina;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 22/06/2021
 *
 */
public class Marco extends JFrame {

    public Marco() {
        setVisible(true);
        setLocation(400, 150);
        setSize(500, 500);
        setTitle("Word Letter");
        Lamina lamina = new Lamina();
        add(lamina);
    }

}

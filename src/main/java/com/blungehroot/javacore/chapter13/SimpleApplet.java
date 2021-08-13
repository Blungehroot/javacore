package com.blungehroot.javacore.chapter13;

import java.applet.Applet;
import java.awt.*;
/*
<applet code="SimpleApplet" width=200 height=бO>
</applet>
 */
public class SimpleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Simple applet", 20, 20);
    }
}
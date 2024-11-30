package com.example.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PanelService {
    private final Panel panel;

    @Autowired
    public PanelService(Panel panel) {
        this.panel = panel;
    }

    public void addCircle(double x, double y, double radius) {
        panel.addElement(new Circle(x, y, radius));
    }

    public void addRectangle(double x, double y, double width, double height) {
        panel.addElement(new Rectangle(x, y, width, height));
    }

    public void scalePanel(double scaleFactor) {
        panel.scale(scaleFactor);
    }

    public List<Object> getElements() {
        return panel.getElements();
    }
}

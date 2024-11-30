package com.example.exam;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Panel {
    private List<Object> elements = new ArrayList<>();
    private double scaleFactor = 1.0;

    public void addElement(Object element) {
        elements.add(element);
    }

    public void removeElement(Object element) {
        elements.remove(element);
    }

    public void scale(double newScaleFactor) {
        double scaleRatio = newScaleFactor / scaleFactor;
        for (Object element : elements) {
            if (element instanceof Circle) {
                ((Circle) element).scale(scaleRatio);
            } else if (element instanceof Rectangle) {
                ((Rectangle) element).scale(scaleRatio);
            }
        }
        scaleFactor = newScaleFactor;
    }

    public List<Object> getElements() {
        return elements;
    }
}

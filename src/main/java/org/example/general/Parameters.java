package org.example.general;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Parameters {
    private int x;
    private int y;
    private int length;
    private boolean horizontal;

    @Override
    public String toString() {
        return "Parameters{" +
                "x=" + x +
                ", y=" + y +
                ", length=" + length +
                ", horizontal=" + horizontal +
                '}';
    }
}

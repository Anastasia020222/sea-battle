package org.example.general;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Coordinates {

    A(0),
    B(1),
    C(2),
    D(3),
    E(4),
    F(5),
    G(6),
    H(7),
    I(8),
    J(9);

    private final int number;

    @Override
    public String toString() {
        return "Coordinates{" +
                "number=" + number + " : " + name() +
                '}';
    }
}

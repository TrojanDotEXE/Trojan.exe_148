package org.firstinspires.ftc.teamcode.hardware.utils;

public enum Timing {
    T1(400),
    T2(600),
    T3(1000);

    public int time;
    Timing(int time) {
        this.time = time;
    }
}

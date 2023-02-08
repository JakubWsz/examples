package org.example.intrefaces;

public interface Animal {
    void getVoice();

    default int xyz() {
        return 0;
    }
}

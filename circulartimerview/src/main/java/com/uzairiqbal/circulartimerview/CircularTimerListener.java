package com.uzairiqbal.circulartimerview;

public interface CircularTimerListener {
    String updateDataOnTick(long remainingTimeInMs);
    void onTimerFinished();
}

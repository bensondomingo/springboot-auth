package com.example.timestamp;

import java.time.Instant;

public class Timestamp {
    private long timestamp;

    public Timestamp() {
        Instant instant = Instant.now();
        timestamp = instant.toEpochMilli();
    }

    public long getTimestamp() {
        return this.timestamp;
    }
}

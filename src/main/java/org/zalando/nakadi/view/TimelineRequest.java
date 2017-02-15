package org.zalando.nakadi.view;

public class TimelineRequest {

    private String eventType;
    private String storageId;

    public String getEventType() {
        return eventType;
    }

    public void setEventType(final String eventType) {
        this.eventType = eventType;
    }

    public String getStorageId() {
        return storageId;
    }

    public void setStorageId(final String storageId) {
        this.storageId = storageId;
    }
}

package com.hiczp.bilibili.api.live.socket.event;

import com.hiczp.bilibili.api.live.socket.entity.GuardBuyEntity;

public class GuardBuyPackageEvent extends ReceiveDataPackageEvent<GuardBuyEntity> {
    public GuardBuyPackageEvent(Object source, GuardBuyEntity entity) {
        super(source, entity);
    }
}

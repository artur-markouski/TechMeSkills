package com.tms.robot.module;

import com.tms.robot.module.constats.Prices;
import com.tms.robot.module.foot.IFoot;
import com.tms.robot.module.hand.IHand;
import com.tms.robot.module.head.IHead;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Robot implements IHead, IHand, IFoot {
    private int id;
    private int price;

    public Robot(int id) {
        this.id = id;
        this.price = 0;
    }

    @Override
    public void onContinental() {
        System.out.println("Модуль установлен");
        this.price += Prices.CONTINENTAL.getPrice();
    }

    @Override
    public void offContinental() {
        System.out.println("Модуль удален");
        this.price -= Prices.CONTINENTAL.getPrice();
    }

    @Override
    public void go() {
        System.out.println("Обычный шаг");

    }

    @Override
    public void run() {
        System.out.println("Бегии!!!");
    }

    @Override
    public void stop() {
        System.out.println("СТОП");
    }

    @Override
    public void takeOn() {
        System.out.println("Взять предмет");
    }

    @Override
    public void takeOff() {
        System.out.println("Положить предмет");
    }

    @Override
    public void sonyOn() {
        System.out.println("Модуль установлен");
        this.price += Prices.SONY.getPrice();
    }

    @Override
    public void sonyOff() {
        System.out.println("Модуль удален");
        this.price -= Prices.SONY.getPrice();
    }

    @Override
    public void headOn() {
        System.out.println("Голова включена");
    }

    @Override
    public void headOff() {
        System.out.println("Голова выключена");
    }

    @Override
    public void onProcess() {
        System.out.println("Модуль установлен");
        this.price += Prices.INTEL.getPrice();
    }

    @Override
    public void offProcess() {
        System.out.println("Модуль удален");
        this.price -= Prices.INTEL.getPrice();
    }

    @Override
    public void speakOn() {
        System.out.println("Модуль установлен");
        this.price += Prices.JBL.getPrice();
    }

    @Override
    public void speakOff() {
        System.out.println("Модуль удален");
        this.price -= Prices.JBL.getPrice();
    }

    @Override
    public void listenOn() {
        System.out.println("Модуль установлен");
        this.price += Prices.PHILIPS.getPrice();
    }

    @Override
    public void listenOff() {
        System.out.println("Модуль удален");
        this.price -= Prices.PHILIPS.getPrice();
    }

    @Override
    public void seeOn() {
        System.out.println("Модуль установлен");
        this.price += Prices.SAMSUNG.getPrice();
    }

    @Override
    public void seeOff() {
        System.out.println("Модуль установлен");
        this.price += Prices.SAMSUNG.getPrice();
    }
}

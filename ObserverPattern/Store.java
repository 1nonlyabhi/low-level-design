package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.MobileAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    
    public static void main(String[] args) {
        
        StocksObservable iphoneStocksObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer01 = new MobileAlertObserverImpl("username01", iphoneStocksObservable);
        NotificationAlertObserver observer02 = new EmailAlertObserverImpl("email@xyz.xom", iphoneStocksObservable);
        NotificationAlertObserver observer03 = new MobileAlertObserverImpl("username02", iphoneStocksObservable);

        iphoneStocksObservable.add(observer01);
        iphoneStocksObservable.add(observer02);
        iphoneStocksObservable.add(observer03);

        iphoneStocksObservable.setStockCount(20);
        iphoneStocksObservable.setStockCount(-20);
        iphoneStocksObservable.setStockCount(20);
    }
}

package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

/**
 * StocksObservable
 */
public interface StocksObservable {

    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifyObservers();

    public void setStockCount(final int newStockAdded);

    public int getStockCount();
}
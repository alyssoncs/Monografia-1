Subscriber = SubscriberFactory.createSubscriber();
subscriber.addConnection(connection); //connection with mqtt broker
subscriber.subscribeServiceByName("Temperature");

subscriber.setSubscriberListener(new ISubscriberListener() {
	@Override
	public void onMessageArrived(Message message) {
		if (message instanceof ObjectFoundMessage) {
			/* do something */
		} else if (message instanceof ObjectConnectedMessage) {
			/* do somethinge else */
		}
	}
});

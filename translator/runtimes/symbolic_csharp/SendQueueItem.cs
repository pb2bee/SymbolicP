class SendQueueItem {
	/* I felt a bit overengineered if we use private fields and create getters for each */
	public PMachine target;
	public PInteger e;
	public IPType payload;

	public SendQueueItem(PMachine target, PInteger e, IPType payload) {
		this.target = target;
		this.e = e;
		this.payload = payload;
	}
}
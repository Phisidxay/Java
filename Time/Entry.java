class Entry {
	public static void main(String[] args) {
		Time t = new Time(1, 1, 1);
		t.display();
		t.setTime(23, 59, 59);
		t.display();
		t.nextSecond();
		t.display();
    	t.nextSecond();
		t.display();
        t.nextSecond();
		t.display();
        t.nextSecond();
		t.display();
    	t.nextSecond();
		t.display();
        t.nextSecond();
		t.display();
		t.setTime(12, 59, 59);
		t.display();
		t.previousSecond();
		t.display();
	}
}
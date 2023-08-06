package OOP;

public class Time {
	private int second, minutem, hour;

	public Time(int second, int minutem, int hour) {
		this.second = second;
		this.minutem = minutem;
		this.hour = hour;
	}
	public Time() {
		this.second = 0;
		this.minutem = 0;
		this.hour = 0;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int getMinutem() {
		return minutem;
	}

	public void setMinutem(int minutem) {
		this.minutem = minutem;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}


	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minutem, second);
	}

	public void setTime(int second, int minute, int hour) {
		this.second = second;
		this.minutem = minute;
		this.hour = hour;

	}

	public Time nextSeTime() {
		++second;
		if (second >= 60) {
			second = 0;

			++minutem;
			if (minutem >= 60) {
				minutem = 0;

				++hour;
				if (hour >= 24) {
					hour = 0;
				}

			}
		}
		return this;

	}

}

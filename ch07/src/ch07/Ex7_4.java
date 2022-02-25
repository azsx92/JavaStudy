package ch07;

class MyTv {
	boolean power; // 전원상태(on/off)
	int channel; // 채널

	void power() {
		power = !power;
	};

	void channelUp() {
		++channel;
	};

	void channelDown() {
		--channel;
	};

}

class VCR {
	boolean power; // 전원상태(on/off)
	int counter = 0;

	void power() {
		power = !power;
	};

	void play() {
		/**/};

	void stop() {
		/**/};

	void rew() {
		/**/};

	void ff() {
		/**/};

}

public class Ex7_4 extends MyTv {
	VCR vcr = new VCR();
	int counter = vcr.counter;

	void play() {
		vcr.play();
	}

	void stop() {
		vcr.stop();
	};

	void rew() {
		vcr.rew();
	};

	void ff() {
		vcr.ff();
	};
}

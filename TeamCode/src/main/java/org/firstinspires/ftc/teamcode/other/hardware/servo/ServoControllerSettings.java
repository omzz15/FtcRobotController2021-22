package org.firstinspires.ftc.teamcode.other.hardware.servo;

import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.other.EndPoints;

//TODO fix default values
public class ServoControllerSettings extends  ServoSettings{
	public int maxSpeed;
	public EndPoints positionEnds;
	public EndPoints angleEnds;
	public RunMode runMode;

	public ServoControllerSettings(Number number) {
		super(number);
		maxSpeed = 100;
		positionEnds = new EndPoints(0, 1);
		angleEnds = new EndPoints(0,180);
		runMode = RunMode.RUN_AT_MAX;
	}

	public ServoControllerSettings(Number number, Servo.Direction direction, int maxSpeed) {
		super(number, direction);
		this.maxSpeed = maxSpeed;
		positionEnds = new EndPoints(0, 1);
		angleEnds = new EndPoints(0,180);
		runMode = RunMode.RUN_AT_MAX;
	}

	public ServoControllerSettings(Number number, Servo.Direction direction, Double targetPos, EndPoints positionEnds, EndPoints angleEnds, int maxSpeed, RunMode runMode) {
		super(number, direction, targetPos);
		this.maxSpeed = maxSpeed;
		this.runMode = runMode;
		this.positionEnds = positionEnds;
		this.angleEnds = angleEnds;
	}

	public enum RunMode{
		RUN_AT_MAX,
		RUN_AT_RATE,
		RUN_AT_RATE_WITH_CORRECTION,
		RUN_WITH_TIME
	}
}
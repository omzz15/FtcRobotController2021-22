package org.firstinspires.ftc.teamcode.parts.drive;

import org.firstinspires.ftc.teamcode.base.Robot;
import org.firstinspires.ftc.teamcode.base.part.base.RobotPartSettings;
import org.firstinspires.ftc.teamcode.other.Utils;
import org.firstinspires.ftc.teamcode.other.input.InputSupplier;

public class DriveSettings extends RobotPartSettings {
    ////////////
    //settings//
    ////////////
    //drive teleop settings
    public DriveMode driveMode = DriveMode.MECANUM;
    boolean useSmoothing = false;
    double[] smoothingValues = new double[]{.1,.1,.1};
    public double speedMultiplier = 1;

    //teleop input settings
    Utils.GamepadNum gamepadNum = Utils.GamepadNum.ONE;
    InputSupplier driveXSupplier = new InputSupplier(gamepad -> (gamepad.left_stick_x), gamepadNum);
    InputSupplier driveYSupplier = new InputSupplier(gamepad -> (-gamepad.left_stick_y), gamepadNum);
    InputSupplier driveRSupplier = new InputSupplier(gamepad -> (gamepad.right_stick_x), gamepadNum);
    InputSupplier driveStopSupplier = new InputSupplier(gamepad -> (gamepad.x), gamepadNum);

    @Override
    public void onInit(Robot robot) {
        driveXSupplier.init(robot);
        driveYSupplier.init(robot);
        driveRSupplier.init(robot);
        driveStopSupplier.init(robot);
    }

    public enum DriveMode{
        TANK,
        MECANUM,
        OMNI
    }
}
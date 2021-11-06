package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.base.Robot;
import org.firstinspires.ftc.teamcode.parts.drive.Drive;

@TeleOp(name = "test", group = "Test")
public class Driver extends LinearOpMode {
    @Override
    public void runOpMode(){
        Robot robot = new Robot(this);
        new Drive(robot);

        robot.init();

        waitForStart();

        robot.start();

        while(opModeIsActive()){
            robot.runParts();
            robot.addAllTelemetry();
            robot.sendTelemetry();
        }
    }
}
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.IMU;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class Arm extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        DcMotor centerMotor = hardwareMap.dcMotor.get("centerMotor");
        DcMotor armSlideMotor = hardwareMap.dcMotor.get("armSlideMotor");
        Servo sampleGrabberServo = hardwareMap.servo.get("sampleGrabberServo");
        Servo intakeServo = hardwareMap.servo.get("intakeServo");

    }
}

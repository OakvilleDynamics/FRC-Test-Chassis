// RobotBuilder Version: 3.1
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.revrobotics.*;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.SparkMaxAlternateEncoder.Type;

public class Drivetrain extends SubsystemBase {

  // Inits motors
  private final CANSparkMax leftRear;
  private final CANSparkMax leftFront;
  private final CANSparkMax rightFront;
  private final CANSparkMax rightRear;

  // Inits encoders
  public RelativeEncoder leftFrontEncoder;
  public RelativeEncoder leftRearEncoder;
  public RelativeEncoder rightFrontEncoder;
  public RelativeEncoder rightRearEncoder;

  private final MecanumDrive drive;

  public Drivetrain() {

    // Assigns motors
    leftFront = new CANSparkMax(Constants.canID[0], MotorType.kBrushed);
    leftFront.setInverted(false);

    leftRear = new CANSparkMax(Constants.canID[1], MotorType.kBrushed);
    leftRear.setInverted(true);

    rightFront = new CANSparkMax(Constants.canID[2], MotorType.kBrushed);
    rightFront.setInverted(true);

    rightRear = new CANSparkMax(Constants.canID[3], MotorType.kBrushed);
    rightRear.setInverted(false);

    drive = new MecanumDrive(leftFront, leftRear, rightFront, rightRear);
    addChild("Drive", drive);
    //drive.setSafetyEnabled(true);
    drive.setExpiration(0.1);

    // Encoders
    leftFrontEncoder = leftFront.getAlternateEncoder(Type.kQuadrature, 8192);
    leftRearEncoder = leftRear.getAlternateEncoder(Type.kQuadrature, 8192);
    rightFrontEncoder = rightFront.getAlternateEncoder(Type.kQuadrature, 8192);
    rightRearEncoder = rightRear.getAlternateEncoder(Type.kQuadrature, 8192);
    
    //DRIVE_ENCODERS = new MedianPIDSource(LEFT_FRONT_DRIVE_ENCODER, LEFT_BACK_DRIVE_ENCODER, RIGHT_FRONT_DRIVE_ENCODER, RIGHT_BACK_DRIVE_ENCODER);

    // To change the max power, you need to change it in the Constants.java file
    // if (partyMode) {
    //   drive.setMaxOutput(Constants.partyModeLimit);
    // } else {
    //   drive.setMaxOutput(Constants.powerLimit);
    // }
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run

  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run when in simulation

  }

  // Drive method for driving
  public void drive(double mainx, double mainy, double rotate, double speed) {
    if (mainx < 0.3 && mainx > -0.3) {
      mainx = 0;
    } else if (mainy < 0.3 && mainy > -0.3) {
      mainy = 0;
    }
    mainx *= -1;
    rotate *= -1;
    drive.driveCartesian(mainy, mainx, rotate);
    double maxSpeed = ((speed * -1) + 1) / 2;
    drive.setMaxOutput(maxSpeed);
    SmartDashboard.putNumber("Max Speed", maxSpeed);
  }

  public void getEncoderRate() {
    // This is how we get the velocity from the motors. For future use!
    leftFrontEncoder.getVelocity();
    leftRearEncoder.getVelocity();
    rightFrontEncoder.getVelocity();
    rightRearEncoder.getVelocity();
  }

  public void getMotorVoltage() {
    // This is how we get power draw from the motors I assume
    leftFront.getBusVoltage();
  }

  public void encoderTest() {}

  public double Test(double test) {
    return 0;
  }
}

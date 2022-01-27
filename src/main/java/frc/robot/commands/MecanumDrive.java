// RobotBuilder Version: 3.1
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.simulation.JoystickSim;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.Drivetrain;

public class MecanumDrive extends CommandBase {

  private final Drivetrain m_drivetrain;

  private final Joystick driverController2 =
      new Joystick(Constants.driverControllerPort);

  private final XboxController driverController =
      new XboxController(Constants.driverControllerPort);

  // Creates a new TankDrive
  public MecanumDrive(Drivetrain subsystem) {
    m_drivetrain = subsystem;
    addRequirements(m_drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}
  ;

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // Runs a drive command on the driverController
    
    // Xbox Controller
    m_drivetrain.drive(driverController.getX(Hand.kLeft), driverController.getY(Hand.kLeft), driverController.getY(Hand.kRight));
    

    // Flight Stick
   // m_drivetrain.drive(driverController2.getX(), driverController2.getY(), driverController2.getZ());



    //   if (driverController.getBumper(Hand.kRight)) {
    //     m_drivetrain.setPartyMode(!m_drivetrain.getPartyMode());
    //     System.out.println(
    //         m_drivetrain.getPartyMode() ? "PARTY MODE IS ENABLED" : "PARTY MODE IS DISABLED");
    //   }

    //   if (driverController.getAButton()) {
    //     if (m_drivetrain.getPartyMode()) {
    //       m_drivetrain.drive(Constants.partyModeLimit, Constants.partyModeLimit);
    //     } else {
    //       System.err.println("PARTY MODE IS NOT ACTIVATED, PRESS THE RIGHT BUMPER TO ACTIVATE");
    //     }
    //   }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    // m_drivetrain.drive(0.0, 0.0);
    System.out.println("TankDrive interrupted");
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }

  @Override
  public boolean runsWhenDisabled() {
    return false;
  }
}

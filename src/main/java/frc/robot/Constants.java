// RobotBuilder Version: 3.1
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public class Constants {

  // IDS TO REFER TO CAN-CONNECTED DEVICES
  // Each device has a specific device ID, visible through the Phoenix Tuner utility.
  // LF, LR, RF, RR, Shooter, Left Winch, Left Tilt, Intake, Clock
  public static final int[] canID = {10, 1, 2, 3, 4, 5, 6, 7, 8};
  public static final int pdpCID = 11;

  // POWER LIMITER (0.0 - 1.0)
  public static final double powerLimit = 0.3;
  public static final double combineLimit = -0.45;
  public static final double slowSpeed = 0.3;
  public static final double fastSpeed = 0.4;
  public static final double partyModeLimit = 1.0;

  // CONTROLLER PORTS
  public static final int driverControllerPort = 0;
  public static final int auxControllerPort = 1;

  // CONTROLLER TYPE
  public static boolean usingXboxController = false;

  // SENSOR PORTS
  
}

// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Solenoids;


public class ExtendESolenoids extends CommandBase {
 
 private Solenoids s_extend;

  /** Creates a new ExtendSolenoids. */

  public ExtendESolenoids(Solenoids s) {
    // Use addRequirements() here to declare subsystem dependencies.
      s_extend = s;
      addRequirements(s_extend);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    s_extend.extendSideAESolenoids();
    s_extend.extendSideBESolenoids();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.PneumaticsControlModule;
import edu.wpi.first.wpilibj.PneumaticsModuleType;

public class Solenoids extends SubsystemBase {

  public Solenoid eSolenoid;
  public Compressor pcmCompressor;
  DigitalInput Hall1 = new DigitalInput(Constants.SensorConstants.ID_Hall1);
  DigitalInput Hall2 = new DigitalInput(Constants.SensorConstants.ID_Hall2);
  boolean lastState1;
  boolean lastState2;

  /** Creates a new ElectricSolenoids. */
  public Solenoids() {

    eSolenoid = new Solenoid(PneumaticsModuleType.CTREPCM, Constants.SolenoidsConstants.ID_eSolenoid);
    pcmCompressor = new Compressor(Constants.SolenoidsConstants.ID_pcmCompressor, PneumaticsModuleType.CTREPCM);
    }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    if (Hall1.get() != lastState1){
      System.out.println(Hall1);
    }
    if (Hall2.get() != lastState2){
      System.out.println(Hall2);
    }
  }

  public void extendESolenoid() {
    eSolenoid.set(true);
  }

  public void retractESolenoid() {
    eSolenoid.set(false);
  }

  public boolean eSolenoidIsExtended() {
    return (eSolenoid.get());
  }
}

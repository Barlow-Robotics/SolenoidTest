// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.PneumaticsControlModule;
import edu.wpi.first.wpilibj.PneumaticsModuleType;


public class Solenoids extends SubsystemBase {

  public Solenoid eSolenoidA1;
  public Solenoid eSolenoidA2;
  public Solenoid eSolenoidB1;
  public Solenoid eSolenoidB2;
  public Solenoid pSolenoid;

  public PneumaticsControlModule pcm;


  /** Creates a new ElectricSolenoids. */
  public Solenoids() {

  eSolenoidA1 = new Solenoid(PneumaticsModuleType.CTREPCM, Constants.SolenoidsConstants.ID_eSolenoidA1);
  eSolenoidA2 = new Solenoid(PneumaticsModuleType.CTREPCM, Constants.SolenoidsConstants.ID_eSolenoidA2);
  eSolenoidB1 = new Solenoid(PneumaticsModuleType.CTREPCM, Constants.SolenoidsConstants.ID_eSolenoidB1);
  eSolenoidB2 = new Solenoid(PneumaticsModuleType.CTREPCM, Constants.SolenoidsConstants.ID_eSolenoidB2);
  pSolenoid = new Solenoid(PneumaticsModuleType.CTREPCM, Constants.SolenoidsConstants.ID_pSolenoid);

  pcm = new PneumaticsControlModule(Constants.SolenoidsConstants.ID_pcm);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void extendSideAESolenoids() {
    eSolenoidA1.set(true);
    eSolenoidA2.set(true);
  }

  public void retractSideAESolenoids() {
    eSolenoidA1.set(false);
    eSolenoidA2.set(false);
  }

  public void extendSideBESolenoids() {
    eSolenoidB1.set(true);
    eSolenoidB2.set(true);
  }

  public void retractSideBESolenoids() {
    eSolenoidB1.set(false);
    eSolenoidB2.set(false);
  }

  public void extendPSolenoid() {
    pSolenoid.set(true);
  }

  public void retractPSolenoid() {
    pSolenoid.set(false);
  }

  public boolean sideAESolenoidsAreExtended() {
    return(eSolenoidA1.get() && eSolenoidA2.get());
  }

  public boolean sideBESolenoidsAreExtended() {
    return(eSolenoidB1.get() && eSolenoidB2.get());
  }

  public boolean pSolenoidIsExtended() {
    return(pSolenoid.get());
  }
}

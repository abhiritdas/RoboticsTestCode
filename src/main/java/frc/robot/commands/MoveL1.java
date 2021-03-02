package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Robot;
import frc.robot.subsystems.DriveTrain;

public class MoveL1 extends CommandGroup {
    
    double m_time, m_speed;

    public MoveL1(double time, double speed){
        m_time = time;
        m_speed = speed;
        requires(Robot.driveTrain);
      }
}

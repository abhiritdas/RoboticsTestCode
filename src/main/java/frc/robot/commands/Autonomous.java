package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Robot;
import frc.robot.subsystems.DriveTrain;
//import frc.robot.commands.Move;
import frc.robot.commands.MoveL1;

public class Autonomous extends CommandGroup{
    double m_time, m_speed;
    
    public Autonomous(double time, double speed) {
        m_time = time;
        m_speed = speed;
        System.out.println("SSSSSSSSSSSSSSSSSS");
        addSequential(new MoveL1(time, speed));
    }

    private void addSequential(Object setLeft1Motor) {
    }

    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return false;
    }
    
    
}

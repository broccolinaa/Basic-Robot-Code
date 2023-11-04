package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.CommandBase;
public class TestArmCommand extends CommandBase{
    private int ticks;
    private ArmSubSystem subsystem = new ArmSubSystem();
    @Override
    public void initialize (){
        System.out.println("Begin test arm command:");
        ticks = 0;
    }

    @Override
    public void execute(){
        ticks++;
        subsystem.bothmotorspeed(Math.sin(ticks), Math.cos(ticks));
    
    }

    @Override
    public void end(boolean interrupted) {
        subsystem.stopAllMotorSpeed();
    }
    @Override
    public boolean isFinished(){
       
        return(ticks>600);
    
    }

}

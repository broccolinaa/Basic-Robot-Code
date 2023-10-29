package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.PortConstants;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
public class ArmSubSystem extends SubsystemBase{
    private final CANSparkMax motor1;
    private final CANSparkMax  motor2;
    private ArmSubSystem() {
        this.motor1 = new CANSparkMax(PortConstants.PORT_1, MotorType.kBrushless);
        this.motor2 = new CANSparkMax(PortConstants.PORT_2, MotorType.kBrushless);

    }
    public void motor1_speed(double speed){
        this.motor1.set(speed);
    }
    public void motor2_speed(double speed){
        this.motor2.set(speed);
    }
    public void bothmotorspeed(double speed1, double speed2){
        this.motor1.set(speed1);
        this.motor2.set(speed2);

    }
}

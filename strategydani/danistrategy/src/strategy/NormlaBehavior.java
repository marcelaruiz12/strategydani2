package strategy;

public class NormlaBehavior implements RobotBehavior {

@Override
public int moveCommand() {
return 0;
}

@Override
public String toString() {
return "Nornal Behavior:"+ " if find another robot ignore it";
}

}



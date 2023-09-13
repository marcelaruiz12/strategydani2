package strategy;

public class AgressiveBehavior implements RobotBehavior {

@Override
public int moveCommand() {

return 1;
}
@Override
public String toString() {
return "Agressive si encuentra otro robor ataquelo ";

}

}

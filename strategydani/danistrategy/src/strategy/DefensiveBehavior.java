
package strategy;

public class DefensiveBehavior implements RobotBehavior {

@Override
public int moveCommand() {

return -1;
}
@Override
public String toString() {
return "Defensive Behavior : " +"if find another robot run from it";
}

}

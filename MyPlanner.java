import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Set;

class MyState {
    public double cost;
    MyState parent;
    State state;

    MyState(double cost, MyState par) {

    }

    public State getState() {
        return this.state;
    }

    public State 
}

class MyPlanner {

    private void transition(MyState lowestCostState, MyState a) {
    }

    private void actionCost() {
    }


    private MyState uniformCostSearch(MyState startState, MyState goalState) {
        StateComparator comp = new StateComparator();
        PriorityQueue frontier = new PriorityQueue<MyState>(comp);
        Set beenthere = new Set();

        startState.cost = 0.0;
        startState.parent = null;
        beenthere.add(startState);
        frontier.add(startState);

        while(frontier.size() > 0) {
            MyState lowestCostState = frontier.poll(); 

            if(lowestCostState.state.isEqual(goalState.state)) {
                return lowestCostState;
            }
            for each action, a {
                child = transition(lowestCostState, a); // compute the next state
                acost = action_cost(lowestCostState, a); // compute the cost of the action
                if(child is in beenthere) {
                    oldchild = beenthere.find(child)
                    if(lowestCostState.cost + acost < oldchild.cost) {
                        oldchild.cost = lowestCostState.cost + acost;
                        oldchild.parent = lowestCostState;
                    }
                }
                else {
                    child.cost = s.cost + acost;
                    child.parent = s;
                    frontier.add(child);
                    beenthere.add(child);
                }
            }
        }

        throw new RuntimeException("There is no path to the goal");
  }
}
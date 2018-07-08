package net.nsreverse.objective2_advanced_java_class_design.d_enums;

import net.nsreverse.utils.Log;

public class Example1 {
    public enum BasicDirection {
        NORTH,
        EAST,
        SOUTH,
        WEST
    }

    public enum Direction {
        NORTH(0), EAST(90), SOUTH(180), WEST(270);

        private int angle;

        // Private scope constructor, also cannot invoke a super constructor.
        // If no constructor is defined, an implicit one is.
        Direction(int angle) {
            this.angle = angle;
        }

        public void printAngle() {
            Log.d("           This direction is at " + angle + " degrees.");
        }

        public void printEnumInformation() {
            Log.d("   Name            : " + name());
            Log.d("   To String       : " + toString());
            Log.d("   Ordinal         : " + ordinal());
            Log.d("   Declaring Class : " + getDeclaringClass());

        }
    }

    public void executeExample() {
        Log.d("==============ENUM INFORMATION==============");
        for (int i = 0; i < Example1.Direction.values().length; i++) {
            Example1.Direction.values()[i].printEnumInformation();
        }
        Log.d("==============ENUM INFORMATION==============");

        Log.d("================ENUM VALUES=================");
        Log.d("   Possible Values : - " + Example1.Direction.values()[0]);
        Example1.Direction.values()[0].printAngle();

        for (int i = 1; i < Example1.Direction.values().length; i++) {
            Log.d("                     - " + Example1.Direction.values()[i]);
            Example1.Direction.values()[i].printAngle();
        }
        Log.d("================ENUM VALUES=================");
    }
}

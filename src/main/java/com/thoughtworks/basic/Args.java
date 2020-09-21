package com.thoughtworks.basic;

import java.util.ArrayList;
import java.util.List;

public class Args {
    private String Args;
    private Arg SingleArg;

    List<Arg> arg = new ArrayList<Arg>();

    public Args(String Args) {
        this.Args = Args;
    }

    public boolean checkInputFlagNOBlankSpace() {
        String[] argList = Args.split("-");
        for (String argItem :
                argList) {
            if (argItem.endsWith(" ")) {
                return true;
            }
        }
        return false;
    }

    public boolean checkInputFlagRepeat() {
        int repeatNum = 0;
        String[] argList = Args.split("-");
        for (String argItem :
                argList) {
            if (argItem.startsWith("l")) {
                repeatNum++;
            }
        }
        if (repeatNum > 1) {
            return false;
        }
        return true;

    }

    public String getValueOf() {
        String[] argList = Args.split("-");
        String output="";
        Arg SingleArg = new Arg();
        for (String argItem :
                argList) {
            if (!"".equals(argItem)) {
                argItem.trim();
                if("l".equals(argItem)){
                    SingleArg.setFlag(argItem);
                    SingleArg.setValue("true");
                } else if("p".equals(argItem)){
                    SingleArg.setFlag(argItem);
                    SingleArg.setValue("0");
                } else if("d".equals(argItem)){
                    SingleArg.setFlag(argItem);
                    SingleArg.setValue(" ");
                } else {
                    String[] argItemList = argItem.split(" ");
                    SingleArg.setFlag(argItemList[0]);
                    SingleArg.setValue(argItemList[1]);
                }
//                arg.add(SingleArg);
                output += SingleArg.toString();
            }

        }

//        for (Arg argItem :
//                arg) {
//            return argItem.toString();
//        }
        return output;
    }
}

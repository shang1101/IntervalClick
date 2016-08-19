package com.shang;

import java.util.List;

public class OnceMethod {

    private final int time;
    private int id;
    private String methodName;
    private List<String> methodParameters;

    OnceMethod(int time,int id, String methodName, List<String> methodParameters) {
        this.id = id;
        this.time = time;
        this.methodName = methodName;
        this.methodParameters = methodParameters;
    }

    int getMethodParametersSize() {
        return methodParameters == null ? 0 : methodParameters.size();
    }

    int getId() {
        return id;
    }
    int getTime(){
        return time;
    }
    String getMethodName() {
        return methodName;
    }

    List<String> getMethodParameters() {
        return methodParameters;
    }

}

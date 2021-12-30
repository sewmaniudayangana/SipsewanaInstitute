package dto;

import entity.Register;

import java.util.ArrayList;
import java.util.List;

public class Cousedto {
    private String programId;
    private String program;
    private String duration;
    private double fee;


    private List<Register> registerList = new ArrayList<>();

    public Cousedto() {
    }

    public Cousedto(String programId, String program, String duration, double fee) {
        this.setProgramId(programId);
        this.setProgram(program);
        this.setDuration(duration);
        this.setFee(fee);
    }

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public List<Register> getRegisterList() {
        return registerList;
    }

    public void setRegisterList(List<Register> registerList) {
        this.registerList = registerList;
    }

    @Override
    public String toString() {
        return "Cousedto{" +
                "programId='" + programId + '\'' +
                ", program='" + program + '\'' +
                ", duration='" + duration + '\'' +
                ", fee=" + fee +
                ", registerList=" + registerList +
                '}';
    }
}

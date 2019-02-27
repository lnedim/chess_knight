package com.company;

public class Position {

    public static final int BOARD_HEIGHT = 8;
    public static final int BOARD_WIDTH = 8;

    public int XAxis;
    public int YAxis;

    public Position(int XAxis, int YAxis) {
        this.XAxis = XAxis;
        this.YAxis = YAxis;
    }

    public int getXAxis() { return XAxis; }

    public void setXAxis(int XAxis) { this.XAxis = XAxis; }

    public int getYAxis() { return YAxis; }

    public void setYAxis(int YAxis) { this.YAxis = YAxis; }

//    public Position (string position){

//    string xAxisString = position.Substring(0, 1);
//    string yAxisString = position.Substring(1, 1);
//    int xAxis = 0;
//            switch (xAxisString){
//        case "A":
//            xAxis = 0;
//            break;
//        case "B":
//            xAxis = 1;
//            break;
//        case "C":
//            xAxis = 2;
//            break;
//        case "D":
//            xAxis = 3;
//            break;
//        case "E":
//            xAxis = 4;
//            break;
//        case "F":
//            xAxis = 5;
//            break;
//        case "G":
//            xAxis = 6;
//            break;
//        case "H":
//            xAxis = 7;
//            break;
//
//        default:
//            xAxis = 0;
//            break;
//    }
//    }
//    public bool IsValid(){
//    if ((this.XAxis >= 0 && this.XAxis < BoardHeight) && (this.YAxis >= 0 && this.YAxis < BoardWidth)){
//        return true;
//    }
//    return false;


}




}

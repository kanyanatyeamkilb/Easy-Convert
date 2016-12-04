package rtc.kanyanat.chetsada.easyconvert;

/**
 * Created by masterUNG on 12/4/2016 AD.
 */

public class MyConstant {

    private String[] titleStrings, lengthStrings, tempStrings,
            areaStrings, volumeStrings, weightStrings, timeStrings;

    private double[] lengthDoubles, tempDoubles,
            areaDoubles, volumeDoubles, weightDoubles, timeDoubles;

    public String[] getTitleStrings() {

        //show text
        titleStrings = new String[6];
        titleStrings[0] = "Length";
        titleStrings[1] = "Temp";
        titleStrings[2] = "Area";
        titleStrings[3] = "Volume";
        titleStrings[4] = "Weight";
        titleStrings[5] = "Time";

        return titleStrings;
    }

    public String[] getLengthStrings() {

        lengthStrings = new String[6];
        lengthStrings[0] = "มม.";
        lengthStrings[1] = "ซม.";
        lengthStrings[2] = "ม.";
        lengthStrings[3] = "กม.";
        lengthStrings[4] = "นิ้ว";
        lengthStrings[5] = "หลา";

        return lengthStrings;
    }

    public double[] getLengthDoubles() {

        lengthDoubles = new double[6];
        lengthDoubles[0] = 1000;
        lengthDoubles[1] = 100;
        lengthDoubles[2] = 1;
        lengthDoubles[3] = 0.001;
        lengthDoubles[4] = 39.3433;
        lengthDoubles[5] = 1.0936;


        return lengthDoubles;
    }

    public String[] getTempStrings() {

        tempStrings = new String[3];
        tempStrings[0] = "องศา C";
        tempStrings[1] = "องศา F";
        tempStrings[2] = "องศา K";

        return tempStrings;
    }

    public double[] getTempDoubles() {

        tempDoubles = new double[3];
        tempDoubles[0] = 1;
        tempDoubles[1] = 33.8;
        tempDoubles[2] = 274.15;

        return tempDoubles;
    }

    public String[] getAreaStrings() {

        areaStrings = new String[7];
        areaStrings[0] = "ตร.ม.";
        areaStrings[1] = "ตร.กม.";
        areaStrings[2] = "ตร.ซม.";
        areaStrings[3] = "ตร.มม.";
        areaStrings[4] = "ตร.ไมล์";
        areaStrings[5] = "ตร.ฟุต";
        areaStrings[6] = "ตร.นิ้ว";

        return areaStrings;
    }

    public double[] getAreaDoubles() {

        areaDoubles = new double[7];
        areaDoubles[0] = 1;
        areaDoubles[1] = 0.000001000000;
        areaDoubles[2] = 10000.00;
        areaDoubles[3] = 1000000;
        areaDoubles[4] = 3.861022;
        areaDoubles[5] = 10.76391;
        areaDoubles[6] = 1550;

        return areaDoubles;
    }

    public String[] getVolumeStrings() {

        volumeStrings = new String[6];
        volumeStrings[0] = "ลบ.ม.";
        volumeStrings[1] = "ลบ.กม.";
        volumeStrings[2] = "ลบ.ซล.";
        volumeStrings[3] = "ลบ.มม.";
        volumeStrings[4] = "ล.";
        volumeStrings[5] = "มล.";

        return volumeStrings;
    }

    public double[] getVolumeDoubles() {

        volumeDoubles = new double[6];
        volumeDoubles[0] = 1;
        volumeDoubles[1] = 1.000000;
        volumeDoubles[2] = 100000.0;
        volumeDoubles[3] = 1.000000;
        volumeDoubles[4] = 1000.000;
        volumeDoubles[5] = 100000;

        return volumeDoubles;
    }

    public String[] getWeightStrings() {

        weightStrings = new String[6];
        weightStrings[0] = "กก.";
        weightStrings[1] = "ก.";
        weightStrings[2] = "มก.";
        weightStrings[3] = "ตัน";
        weightStrings[4] = "ปอนด์";
        weightStrings[5] = "ออนซ์";

        return weightStrings;
    }

    public double[] getWeightDoubles() {

        weightDoubles = new double[6];
        weightDoubles[0] = 1;
        weightDoubles[1] = 1000.000;
        weightDoubles[2] = 1000000;
        weightDoubles[3] = 0.00110231131;
        weightDoubles[4] = 2.20462262;
        weightDoubles[5] = 35.27396;

        return weightDoubles;
    }

    public String[] getTimeStrings() {

        timeStrings = new String[7];
        timeStrings[0] = "วินาที";
        timeStrings[1] = "นาที";
        timeStrings[2] = "ชั่วโมง";
        timeStrings[3] = "วัน";
        timeStrings[4] = "สัปดาห์";
        timeStrings[5] = "เดือน";
        timeStrings[6] = "ปี";

        return timeStrings;
    }

    public double[] getTimeDoubles() {
        timeDoubles = new double[7];
        timeDoubles[0] = 86400.00;
        timeDoubles[1] = 1440;
        timeDoubles[2] = 24;
        timeDoubles[3] = 1;
        timeDoubles[4] = 0.142857143;
        timeDoubles[5] = 0.0328549112;
        timeDoubles[6] = 0.00273790926;

        return timeDoubles;
    }
}   // Class

package rtc.kanyanat.chetsada.easyconvert;

/**
 * Created by masterUNG on 12/4/2016 AD.
 */

public class MyConstant {

    private String[] titleStrings, lengthStrings, tempStrings,
            areaStrings, volumeStrings, weightStrings, timeStrings;

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

    public String[] getTempStrings() {

        tempStrings = new String[3];
        tempStrings[0] = "องศา C";
        tempStrings[1] = "องศา F";
        tempStrings[2] = "องศา K";

        return tempStrings;
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

    public String[] getVolumeStrings() {

        volumeStrings = new String[6];
        volumeStrings[0] = "ลบ.ม.";
        volumeStrings[1] = "ลบ.กม.";
        volumeStrings[2] = "ลบ.ซม.";
        volumeStrings[3] = "ลบ.มม.";
        volumeStrings[4] = "ล.";
        volumeStrings[5] = "มล.";

        return volumeStrings;
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
}   // Class

package uci.suriavisor.presentation.util;

/**
 * Created by Orlando on 4/26/2016.
 */
public class TimeUtil {

    /**
     * format seconds to HH:mm:ss String
     *
     * @param seconds seconds
     * @return String of formatted in HH:mm:ss
     */
    public static String seconds2HH_mm_ss(long seconds) {

        long h = 0;
        long m = 0;
        long s = 0;
        long temp = seconds % 3600;

        if (seconds > 3600) {
            h = seconds / 3600;
            if (temp != 0) {
                if (temp > 60) {
                    m = temp / 60;
                    if (temp % 60 != 0) {
                        s = temp % 60;
                    }
                } else {
                    s = temp;
                }
            }
        } else {
            m = seconds / 60;
            if (seconds % 60 != 0) {
                s = seconds % 60;
            }
        }

        String dh = h < 10 ? "0" + h : h + "";
        String dm = m < 10 ? "0" + m : m + "";
        String ds = s < 10 ? "0" + s : s + "";

        return dh + ":" + dm + ":" + ds;
    }
}


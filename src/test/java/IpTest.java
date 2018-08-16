import com.qianfeng.etl.util.IPParserUtil;
import com.qianfeng.etl.util.ip.IPSeeker;

import java.util.List;

public class IpTest {
    public static void main(String[] args) {
        System.out.println(new IPParserUtil().parserIp("221.11.112.123"));
        List<String> li = IPSeeker.getInstance().getAllIp();
        for (String ip : li) {
            System.out.println(ip + "====" + new IPParserUtil().parserIp(ip));

        }

    }
}

package datasource;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

public class SendDataProcessor implements PageProcessor {

    private Site site = Site.me().setRetryTimes(3).setSleepTime(500).setTimeOut(30000);

    @Override
    public void process(Page page) {
        System.out.println("Send Data Success!");
    }

    @Override
    public Site getSite() {
        return site;
    }
}

package com.ascend.wangfeng.news.util;

import com.ascend.wangfeng.news.bean.Response;

import org.junit.Test;

/**
 * Created by fengye on 2017/7/10.
 * email 1040441325@qq.com
 */
public class JsonConversionTest {
@Test
    public void testJsonConverstion(){
    String response ="{\n" +
            "    \"response\": {\n" +
            "        \"status\": \"ok\",\n" +
            "        \"userTier\": \"developer\",\n" +
            "        \"total\": 10811,\n" +
            "        \"startIndex\": 1,\n" +
            "        \"pageSize\": 10,\n" +
            "        \"currentPage\": 1,\n" +
            "        \"pages\": 1082,\n" +
            "        \"orderBy\": \"relevance\",\n" +
            "        \"results\": [\n" +
            "            {\n" +
            "                \"id\": \"politics/2017/apr/28/shameful-shutdown-of-proper-election-debate\",\n" +
            "                \"type\": \"article\",\n" +
            "                \"sectionId\": \"politics\",\n" +
            "                \"sectionName\": \"Politics\",\n" +
            "                \"webPublicationDate\": \"2017-04-28T18:29:31Z\",\n" +
            "                \"webTitle\": \"Shameful shutdown of proper election debate | Letters\",\n" +
            "                \"webUrl\": \"https://www.theguardian.com/politics/2017/apr/28/shameful-shutdown-of-proper-election-debate\",\n" +
            "                \"apiUrl\": \"https://content.guardianapis.com/politics/2017/apr/28/shameful-shutdown-of-proper-election-debate\",\n" +
            "                \"isHosted\": false\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"education/2017/jul/04/michael-gove-extremism-trojan-horse-schools\",\n" +
            "                \"type\": \"article\",\n" +
            "                \"sectionId\": \"education\",\n" +
            "                \"sectionName\": \"Education\",\n" +
            "                \"webPublicationDate\": \"2017-07-04T06:15:34Z\",\n" +
            "                \"webTitle\": \"Michael Gove’s ‘brain flip’ poisoned schools extremism debate \\r\\n\",\n" +
            "                \"webUrl\": \"https://www.theguardian.com/education/2017/jul/04/michael-gove-extremism-trojan-horse-schools\",\n" +
            "                \"apiUrl\": \"https://content.guardianapis.com/education/2017/jul/04/michael-gove-extremism-trojan-horse-schools\",\n" +
            "                \"isHosted\": false\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"politics/2017/jun/22/markets-brexit-watch-bank-of-england-interest-rate\",\n" +
            "                \"type\": \"article\",\n" +
            "                \"sectionId\": \"politics\",\n" +
            "                \"sectionName\": \"Politics\",\n" +
            "                \"webPublicationDate\": \"2017-06-22T11:01:42Z\",\n" +
            "                \"webTitle\": \"'Markets don’t like chaos' – experts debate Brexit watch data\",\n" +
            "                \"webUrl\": \"https://www.theguardian.com/politics/2017/jun/22/markets-brexit-watch-bank-of-england-interest-rate\",\n" +
            "                \"apiUrl\": \"https://content.guardianapis.com/politics/2017/jun/22/markets-brexit-watch-bank-of-england-interest-rate\",\n" +
            "                \"isHosted\": false\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"politics/2017/jun/21/queen-speech-debate-corbyn-castigates-out-of-ideas-government\",\n" +
            "                \"type\": \"article\",\n" +
            "                \"sectionId\": \"politics\",\n" +
            "                \"sectionName\": \"Politics\",\n" +
            "                \"webPublicationDate\": \"2017-06-21T18:14:32Z\",\n" +
            "                \"webTitle\": \"Queen's speech debate: Corbyn castigates 'out of ideas' government\",\n" +
            "                \"webUrl\": \"https://www.theguardian.com/politics/2017/jun/21/queen-speech-debate-corbyn-castigates-out-of-ideas-government\",\n" +
            "                \"apiUrl\": \"https://content.guardianapis.com/politics/2017/jun/21/queen-speech-debate-corbyn-castigates-out-of-ideas-government\",\n" +
            "                \"isHosted\": false\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"uk-news/2017/mar/22/holyrood-suspends-referendum-debate-westminster-attacks-scottish-parliament\",\n" +
            "                \"type\": \"article\",\n" +
            "                \"sectionId\": \"uk-news\",\n" +
            "                \"sectionName\": \"UK news\",\n" +
            "                \"webPublicationDate\": \"2017-03-22T17:32:44Z\",\n" +
            "                \"webTitle\": \"Holyrood suspends referendum debate after Westminster attacks\",\n" +
            "                \"webUrl\": \"https://www.theguardian.com/uk-news/2017/mar/22/holyrood-suspends-referendum-debate-westminster-attacks-scottish-parliament\",\n" +
            "                \"apiUrl\": \"https://content.guardianapis.com/uk-news/2017/mar/22/holyrood-suspends-referendum-debate-westminster-attacks-scottish-parliament\",\n" +
            "                \"isHosted\": false\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"politics/2017/jun/11/ukip-leader-paul-nuttall-not-read-party-manifesto-before-tv-debate\",\n" +
            "                \"type\": \"article\",\n" +
            "                \"sectionId\": \"politics\",\n" +
            "                \"sectionName\": \"Politics\",\n" +
            "                \"webPublicationDate\": \"2017-06-11T10:56:59Z\",\n" +
            "                \"webTitle\": \"Paul Nuttall 'hadn't read Ukip manifesto before TV debate'\",\n" +
            "                \"webUrl\": \"https://www.theguardian.com/politics/2017/jun/11/ukip-leader-paul-nuttall-not-read-party-manifesto-before-tv-debate\",\n" +
            "                \"apiUrl\": \"https://content.guardianapis.com/politics/2017/jun/11/ukip-leader-paul-nuttall-not-read-party-manifesto-before-tv-debate\",\n" +
            "                \"isHosted\": false\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"environment/2017/jun/01/lobbying-act-stifling-environment-debate-in-election-campaign\",\n" +
            "                \"type\": \"article\",\n" +
            "                \"sectionId\": \"environment\",\n" +
            "                \"sectionName\": \"Environment\",\n" +
            "                \"webPublicationDate\": \"2017-06-01T06:00:47Z\",\n" +
            "                \"webTitle\": \"Lobbying Act 'stifling environment debate' in election campaign\",\n" +
            "                \"webUrl\": \"https://www.theguardian.com/environment/2017/jun/01/lobbying-act-stifling-environment-debate-in-election-campaign\",\n" +
            "                \"apiUrl\": \"https://content.guardianapis.com/environment/2017/jun/01/lobbying-act-stifling-environment-debate-in-election-campaign\",\n" +
            "                \"isHosted\": false\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"politics/2017/jun/01/the-snap-what-we-learned-bbc-leaders-debate\",\n" +
            "                \"type\": \"article\",\n" +
            "                \"sectionId\": \"politics\",\n" +
            "                \"sectionName\": \"Politics\",\n" +
            "                \"webPublicationDate\": \"2017-06-01T05:41:48Z\",\n" +
            "                \"webTitle\": \"The Snap: what we learned from the BBC leaders' debate\",\n" +
            "                \"webUrl\": \"https://www.theguardian.com/politics/2017/jun/01/the-snap-what-we-learned-bbc-leaders-debate\",\n" +
            "                \"apiUrl\": \"https://content.guardianapis.com/politics/2017/jun/01/the-snap-what-we-learned-bbc-leaders-debate\",\n" +
            "                \"isHosted\": false\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"politics/2017/may/31/corbyn-to-take-part-in-tv-leaders-debate\",\n" +
            "                \"type\": \"article\",\n" +
            "                \"sectionId\": \"politics\",\n" +
            "                \"sectionName\": \"Politics\",\n" +
            "                \"webPublicationDate\": \"2017-05-31T13:44:08Z\",\n" +
            "                \"webTitle\": \"Corbyn to take part in TV leaders' debate\",\n" +
            "                \"webUrl\": \"https://www.theguardian.com/politics/2017/may/31/corbyn-to-take-part-in-tv-leaders-debate\",\n" +
            "                \"apiUrl\": \"https://content.guardianapis.com/politics/2017/may/31/corbyn-to-take-part-in-tv-leaders-debate\",\n" +
            "                \"isHosted\": false\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"education/2017/may/30/labour-has-started-a-welcome-debate-on-higher-education-funding\",\n" +
            "                \"type\": \"article\",\n" +
            "                \"sectionId\": \"education\",\n" +
            "                \"sectionName\": \"Education\",\n" +
            "                \"webPublicationDate\": \"2017-05-30T18:34:13Z\",\n" +
            "                \"webTitle\": \"Labour has started a welcome debate on higher education funding | Letters\",\n" +
            "                \"webUrl\": \"https://www.theguardian.com/education/2017/may/30/labour-has-started-a-welcome-debate-on-higher-education-funding\",\n" +
            "                \"apiUrl\": \"https://content.guardianapis.com/education/2017/may/30/labour-has-started-a-welcome-debate-on-higher-education-funding\",\n" +
            "                \"isHosted\": false\n" +
            "            }\n" +
            "        ]\n" +
            "    }\n" +
            "}";
    Response result = JsonConversion.fromJson(response);
    System.out.print(result.toString());
}
}
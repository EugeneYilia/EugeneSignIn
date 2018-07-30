import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class EugeneSignIn {//Fuck github mother?

    public static void start() {
        try {
            Map<String, String> headers = new HashMap<String, String>();
            headers.put("Host", "github.com");
            headers.put("Connection", "keep-alive");
            headers.put("Cache-Control", "max-age=0");
            headers.put("Upgrade-Insecure-Requests", "1");
            headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.99 Safari/537.36");
            headers.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8");
            headers.put("Referer", "https://github.com/EugeneYilia/EugeneSignIn/blob/master/README.md");
            headers.put("Accept-Encoding", "gzip, deflate, br");
            headers.put("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.8");
            headers.put("Cookie", "_ga=GA1.2.375410603.1524229228; _octo=GH1.1.1304182142.1524229228; user_session=JaMmh5FPipi-Y8VhWBiAQcgRsTY4aAQ349SEQm_Jln2pdNmA; __Host-user_session_same_site=JaMmh5FPipi-Y8VhWBiAQcgRsTY4aAQ349SEQm_Jln2pdNmA; logged_in=yes; dotcom_user=EugeneYilia; tz=Asia%2FShanghai; has_recent_activity=1; _gat=1; _gh_sess=Y1RObnZiQ1pMU2tuNkRxbEdLS2pVYmFLVmFiYi95cmhjM3c5VHVoRHd4Q05JMG5NcThzV2U1STVZV0hjOFRLR1lTN0xoZVRSQXhRbVhqLytpRnVpOXRza3paNERvK1FYU1JLTXpIZzFEWkNKaFM1UTErVFBQcjZUZkI3enNPeGY4OVFGZE5OVUUyZG5wN1ErUEkvbWpXanBON3F1K1V2MjMyMEgxcHVwSU9UWDFsa2FvNDlDSjR2VjRLQjBES21rS0ZaMDR0NGpWSkk3VkYzRGFCSUVuMFJOLzI1M0xJeWNuSjJKc24vV1pCRHM1Z1ZnOFd0R0RiSlpvcGZpSTRDZUYvbG9TQjc3MENtaDNGMmdWK3hQYmErVmJnY1EwejViNzdET1Y4NGVoMnVhTVJDRkNmN0ZvWG1UU0pTLzBHU2twWUZQK2lYNlpsNUFLMnJqTURlZTJvaXB5V0ZZRUF1clc3WkFjMW5UVERxK0R2bnQ5L0poRE5rcnJwU3ZLZ051LS14Z0FrOCtyZllWeklHWmlVVmtjQkJBPT0%3D--a15e50d63f6f895c13c96c7136a0add3fe2adab2");
            Element element = Jsoup.connect("https://github.com/EugeneYilia/EugeneSignIn/edit/master/README.md").headers(headers).get().getElementById("new_blob");
            //System.out.println(element);
            //System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$4");
            Elements elements = element.getElementsByTag("input");
            String authenticity_token = "";
            String commit = "";
            for (int i = 0; i < elements.size(); i++) {
                if (elements.get(i).attr("name") != null && elements.get(i).attr("value") != null && !elements.get(i).attr("type").equals("radio")) {
                    //System.out.println(elements.get(i).attr("name") + "  " + elements.get(i).attr("value"));
                    if (elements.get(i).attr("name").equals("authenticity_token")) {
                        authenticity_token = elements.get(i).attr("value");
                    } else if (elements.get(i).attr("name").equals("commit")) {
                        commit = elements.get(i).attr("value");
                    }
                }
            }
            //System.out.println("commit->" + commit);
            //System.out.println("authenticity_token->" + authenticity_token);
            String content = "utf8=%E2%9C%93" +
                    "&" +
                    "authenticity_token=" + authenticity_token +
                    "&" +
                    "filename=README.md" +
                    "&" +
                    "new_filename=README.md" +
                    "&" +
                    "commit=" + commit +
                    "&" +
                    "same_repo=1" +
                    "&" +
                    "pr=" +
                    "&" +
                    "content_changed=true" +
                    "&" +
                    "value=EugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiu" +
                    "&" +
                    "message=" +
                    "&" +
                    "placeholder_message=UpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdate" +
                    "&" +
                    "description=" +
                    "&" +
                    "author_email=liuyichen%40EugeneLiu.xyz" +
                    "&" +
                    "commit-choice=direct" +
                    "&" +
                    "target_branch=master" +
                    "&" +
                    "quick_pull=";
            Map<String, String> signInMap = new HashMap<String, String>();
            signInMap.put("Host", "github.com");
            signInMap.put("Connection", "keep-alive");
            signInMap.put("Content-Length", String.valueOf(content.length()));
            signInMap.put("Cache-Control", "max-age=0");
            signInMap.put("Origin", "https://github.com");
            signInMap.put("Upgrade-Insecure-Requests", "1");
            signInMap.put("Content-Type", "application/x-www-form-urlencoded");
            signInMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.99 Safari/537.36");
            signInMap.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8");
            signInMap.put("Referer", "https://github.com/EugeneYilia/EugeneSignIn/edit/master/README.md");
            signInMap.put("Accept-Encoding", "gzip, deflate, br");
            signInMap.put("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.8");
            signInMap.put("Cookie", "_ga=GA1.2.375410603.1524229228; _octo=GH1.1.1304182142.1524229228; user_session=JaMmh5FPipi-Y8VhWBiAQcgRsTY4aAQ349SEQm_Jln2pdNmA; __Host-user_session_same_site=JaMmh5FPipi-Y8VhWBiAQcgRsTY4aAQ349SEQm_Jln2pdNmA; logged_in=yes; dotcom_user=EugeneYilia; tz=Asia%2FShanghai; has_recent_activity=1; _gat=1; _gh_sess=Y1RObnZiQ1pMU2tuNkRxbEdLS2pVYmFLVmFiYi95cmhjM3c5VHVoRHd4Q05JMG5NcThzV2U1STVZV0hjOFRLR1lTN0xoZVRSQXhRbVhqLytpRnVpOXRza3paNERvK1FYU1JLTXpIZzFEWkNKaFM1UTErVFBQcjZUZkI3enNPeGY4OVFGZE5OVUUyZG5wN1ErUEkvbWpXanBON3F1K1V2MjMyMEgxcHVwSU9UWDFsa2FvNDlDSjR2VjRLQjBES21rS0ZaMDR0NGpWSkk3VkYzRGFCSUVuMFJOLzI1M0xJeWNuSjJKc24vV1pCRHM1Z1ZnOFd0R0RiSlpvcGZpSTRDZUYvbG9TQjc3MENtaDNGMmdWK3hQYmErVmJnY1EwejViNzdET1Y4NGVoMnVhTVJDRkNmN0ZvWG1UU0pTLzBHU2twWUZQK2lYNlpsNUFLMnJqTURlZTJvaXB5V0ZZRUF1clc3WkFjMW5UVERxK0R2bnQ5L0poRE5rcnJwU3ZLZ051LS14Z0FrOCtyZllWeklHWmlVVmtjQkJBPT0%3D--a15e50d63f6f895c13c96c7136a0add3fe2adab2");
//            String text =
                    Jsoup.connect("https://github.com/EugeneYilia/EugeneSignIn/tree-save/master/README.md")
                    .headers(signInMap)
                    .data("utf8", "%E2%9C%93")
                    .data("authenticity_token", authenticity_token)
                    .data("filename", "README.md")
                    .data("new_filename", "README.md")
                    .data("commit", commit)//fcf11ef9a92a787be86a9b868ac2309c6b6c6c33
                    .data("same_repo", "1")
                    .data("pr", "")
                    .data("content_changed", "true")
                    .data("value", "EugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiuEugeneLiu")
                    .data("message", "")
                    .data("placeholder_message", "UpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdateUpdate")
                    .data("description", "")
                    .data("author_email", "liuyichen%40EugeneLiu.xyz")
                    .data("commit-choice", "direct")
                    .data("target_branch", "master")
                    .data("quick_pull", "")
                    .post()
//                    .body().text()
                    ;
            //System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.thoughtworks.xstream.XStream;

import java.io.*;
import java.lang.reflect.Type;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

public class ReadJSON {
    public static String readUsers(String url) throws IOException {
        InputStream inputStream = new URL(url).openStream();
        StringBuilder stringBuilder = new StringBuilder();

        try {
            BufferedReader bfr = new BufferedReader(new InputStreamReader(inputStream, Charset.defaultCharset()));
            int cp;
            while ((cp = bfr.read()) != -1) {
                stringBuilder.append((char) cp);
            }
            bfr.close();
        } finally {
            inputStream.close();
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        Type listType = new TypeToken<List<User>>() {
        }.getType();
        List<User> user;
        user = gson.fromJson(readUsers("https://jsonplaceholder.typicode.com/users"), listType);

        if (args[0].equals("-json")) {
            try {
                OutputStreamWriter ous = new OutputStreamWriter(new FileOutputStream("users.json"));
                gson.toJson(user, ous);
                ous.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        } else if (args[0].equals("-xml")) {
            XStream xStream = new XStream();
            try {
                OutputStreamWriter ous2 = new OutputStreamWriter(new FileOutputStream("users.xml"));
                xStream.toXML(user, ous2);
                ous2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

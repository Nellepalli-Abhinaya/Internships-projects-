import java.util.HashMap;
public class URLShortener 
	{

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int BASE = ALPHABET.length();
    private static final String DOMAIN = "https://yourdomain.com/";
    private HashMap<String, String> urlMap;

    public URLShortener() 
	{
        urlMap = new HashMap<>();
    }
    public String shortenURL(String longURL)
	{
        String key;
        do {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < 6; i++) 
			{
                stringBuilder.append(ALPHABET.charAt((int) (Math.random() * BASE)));
            }
            key = stringBuilder.toString();
        } while (urlMap.containsKey(key));
        String shortURL = DOMAIN + key;
        urlMap.put(shortURL, longURL);
        return shortURL;
    }
    public String getLongURL(String shortURL)
	{
        return urlMap.get(shortURL);
    }
    public static void main(String[] args) 
	{
        URLShortener shortener = new URLShortener();

        String longURL1 = "https://www.example.com/article/12345";
        String shortURL1 = shortener.shortenURL(longURL1);
        System.out.println("Shortened URL: " + shortURL1);
        System.out.println("Long URL: " + shortener.getLongURL(shortURL1));
    }
        
    }
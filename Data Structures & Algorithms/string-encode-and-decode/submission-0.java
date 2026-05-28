class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str:strs)
        {
            int length = str.length();
            sb.append(length);
            sb.append('#');
            sb.append(str);
        }
        // System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        for(int i=0;i<str.length();)
        {
            int len = 0;
            while(str.charAt(i)!='#')
            {
                len = (len*10)+(str.charAt(i++)-'0');
            }
            i++;
            StringBuilder sb= new StringBuilder();
            while(len>0)
            {
                sb.append(str.charAt(i++));
                len--;
            }
            res.add(sb.toString());
        }
        return res;
    }
}

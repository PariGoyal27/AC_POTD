//https://leetcode.com/problems/compare-version-numbers/description/
public class CompareVersion {
    public int compareVersion(String version1, String version2) {
        String[] str1 = version1.split("\\.");
        String[] str2 = version2.split("\\.");
        for(int i = 0, j = 0; i < str1.length || j < str2.length; i++, j++){
            int a = (i < str1.length) ? Integer.parseInt(str1[i]) : 0;
            int b = (j < str2.length) ? Integer.parseInt(str2[j]) : 0;
            if(a > b){
                return 1;
            }
            else if(a < b){
                return -1;
            }
        }
        return 0;
    }   
}
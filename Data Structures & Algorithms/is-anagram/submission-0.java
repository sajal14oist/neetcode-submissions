class Solution {
    public boolean isAnagram(String s, String t) {

        s = Stream.of(s.split(""))
                        .map(String::toUpperCase).sorted()
                        .collect(Collectors.joining());

        t = Stream.of(t.split(""))
                        .map(String::toUpperCase).sorted()
                        .collect(Collectors.joining());

        if(s.equals(t)){
            return true;
        }else{
            return false;
        }

    }
}

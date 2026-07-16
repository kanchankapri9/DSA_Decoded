class Day3 {
public:
    string mergeAlternately(string word1, string word2) {
        // Solution:  word1[0] + word2[0]
        // word1 = abc
        // word2 = xyz
        // iterate each string alternatively
        // if there is no element in any of the string append them .
       
       int i ;
       int j;
       string merged = "";

      while ( word1.size() == word2.size()) {
        
        for (int i=0; i<word1.size(); i++ ) {
         merged = word1[i] + word2[i];
       }

       for( int j=0; j<word2.size(); j++) {
         cout << merged + word1[i] + word2[i];
       }

        return merged;

      }
       
    }
};
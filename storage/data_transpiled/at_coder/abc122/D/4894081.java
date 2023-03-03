static final int getPatternInt ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  String [ ] ACGTList = {
    "A" , "G" , "C" , "T" }
    ;
    String [ ] AGCList = {
      "ATGC" , "AGTC" , "AGGC" }
      ;
      for ( String ACGT : ACGTList ) {
        for ( String AGC : Arrays . asList ( "AGC" , "ACG" , "GAC" ) ) {
          AGCList [ 0 ] = ACGT + AGC ;
          AGCList [ 1 ] = AGC + ACGT ;
        }
      }
      List < String > patternObj = new ArrayList < > ( ACGTList . length ) ;
      Map < String , Integer > patternMap = new HashMap < > ( ) ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        String [ ] pattern = patternObj . get ( i ) . split ( " " ) ;
        String strPattern = Arrays . toString ( pattern ) ;
        patternMap . put ( strPattern , strPattern . equals ( "AGC" ) || strPattern . equals ( "ACG" ) || strPattern . equals ( "GAC" ) ? 0 : 1 ) ;
      }
      for ( int i = 0 ;
      i < N - 3 ;
      i ++ ) {
        Map < String , Integer > nextPatternMap = new HashMap < > ( patternMap , 0 ) ;
        for ( String pattern : patternMap . keySet ( ) ) {
          for ( String ACGT : ACGTList ) {
            String newPattern = pattern + ACGT ;
            if ( AGCList [ 0 ] . equals ( newPattern ) ) {
              continue ;
            }
            nextPatternMap . put ( newPattern . substring ( 1 ) , patternMap . get ( newPattern . substring ( 0 , 3 ) ) ) ;
          }
        }
        patternMap = nextPatternMap . entrySet ( ) ;
      }
      int ans = 0 ;
      int devide = ( int ) Math . pow ( 10 , 9 ) + 7 ;
      for ( String pattern : patternMap . keySet ( ) ) {
        ans += patternMap . get ( pattern ) ;
        ans %= devide ;
      }
      System . out . println ( ans ) ;
      return ans ;
    }
    
@ Function public static String solve ( ) {
  String s = readLine ( ) . trim ( ) ;
  Map < Character , Integer > dic = new HashMap < > ( ) ;
  for ( char c : s . toCharArray ( ) ) {
    dic . put ( c , ++ dic . get ( c ) ) ;
  }
  StringBuilder ans = new StringBuilder ( ) ;
  List < String > key = Arrays . asList ( new String [ ] {
    "0" , "Z" , "ZERO" }
    , new String [ ] {
      "2" , "W" , "TWO" }
      , new String [ ] {
        "4" , "U" , "FOUR" }
        , new String [ ] {
          "5" , "F" , "FIVE" }
          , new String [ ] {
            "3" , "R" , "THREE" }
            , new String [ ] {
              "6" , "X" , "SIX" }
              , new String [ ] {
                "7" , "S" , "SEVEN" }
                , new String [ ] {
                  "8" , "G" , "EIGHT" }
                  , new String [ ] {
                    "1" , "O" , "ONE" }
                    , new String [ ] {
                      "9" , "I" , "NINE" }
                      ) ;
                      for ( String d : key ) {
                        String u = d . substring ( 0 , d . indexOf ( ' ' ) ) ;
                        String f = d . substring ( d . indexOf ( ' ' ) + 1 ) ;
                        Integer i = dic . get ( u ) ;
                        ans . append ( d ) ;
                        for ( char c : f . toCharArray ( ) ) {
                          dic . put ( c , i ) ;
                        }
                      }
                      Collections . sort ( ans ) ;
                      return ans . toString ( ) ;
                    }
                    
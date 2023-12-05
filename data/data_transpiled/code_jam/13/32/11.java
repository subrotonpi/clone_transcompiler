public static void main ( String [ ] args ) {
  for ( int testCase = 0 ;
  testCase < Integer . parseInt ( readLine ( args ) ) ;
  testCase ++ ) {
    int x = Integer . parseInt ( readLine ( args ) ) ;
    int y = Integer . parseInt ( readLine ( args ) ) ;
    String s = "" ;
    s += new String [ ] {
      "EW" , "WE" }
      [ x > 0 ? abs ( x ) : x ] + new String [ ] {
        "NS" , "SN" }
        [ y > 0 ? abs ( y ) : y ] ;
        String ans = s ;
        System . out . println ( "Case #" + ( testCase + 1 ) + ": " + ans ) ;
      }
    }
    
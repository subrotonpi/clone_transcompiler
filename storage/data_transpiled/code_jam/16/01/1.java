public static String print ( int t ) {
  int cs ;
  String ans ;
  for ( cs = 1 ;
  cs <= t ;
  cs ++ ) {
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( ( n == 0 ) || ( n == 1 ) ) {
      ans = "INSOMNIA" ;
    }
    else {
      Set < Integer > exists = new HashSet < Integer > ( ) ;
      int cnt = 0 ;
      long now = 0 ;
      while ( ( cnt < 10 ) && ( n == 1 ) ) {
        now += n ;
        String nowStr = String . valueOf ( now ) ;
        for ( int i = 0 ;
        i < nowStr . length ( ) ;
        i ++ ) {
          char c = nowStr . charAt ( i ) ;
          if ( ( ! exists . contains ( Integer . parseInt ( c ) ) ) ) {
            exists . add ( Integer . parseInt ( c ) ) ;
            cnt ++ ;
          }
        }
      }
      ans = String . valueOf ( now ) ;
    }
  }
  System . out . println ( "Case #" + cs + ": " + ans ) ;
  return ans ;
}

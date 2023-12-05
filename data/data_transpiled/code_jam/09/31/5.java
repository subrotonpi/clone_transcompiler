public static int T = Integer . parseInt ( input ) {
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    String i = input . substring ( 0 , testCase ) ;
    LinkedList < Character > chars = new LinkedList < Character > ( "1023456789abcdefghijklmnopqrstuvwxyz" ) ;
    HashMap < Character , String > oldnew = new HashMap < Character , String > ( ) ;
    String s = "" ;
    for ( char ch : i . toCharArray ( ) ) {
      if ( ! oldnew . containsKey ( ch ) ) oldnew . put ( ch , chars . remove ( 0 ) ) ;
      s += oldnew . get ( ch ) ;
    }
    int base = oldnew . size ( ) ;
    base = Math . max ( base , 2 ) ;
    int ans = Integer . parseInt ( s , base ) ;
    System . out . println ( "Case #" + testCase + ": " + ans ) ;
  }
  return T ;
}

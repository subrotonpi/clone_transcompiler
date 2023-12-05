public static String print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  HashMap < Character , Integer > map = new HashMap < Character , Integer > ( ) ;
  for ( int i = 0 ;
  i < 26 ;
  i ++ ) {
    map . put ( ( char ) ( i + 97 ) , new Integer ( i ) ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String s = input . substring ( 0 , i ) ;
    Set < Character > charSet = new HashSet < Character > ( ) ;
    charSet . add ( s ) ;
    for ( char c : charSet ) {
      map . get ( c ) . add ( s . indexOf ( c ) ) ;
    }
  }
  String ans = "" ;
  for ( int i = 0 ;
  i < 26 ;
  i ++ ) {
    char c = ( char ) ( i + 97 ) ;
    if ( map . get ( c ) . size ( ) == n ) {
      ans += c * Math . min ( map . get ( c ) . size ( ) , n ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}

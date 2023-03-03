public static String input ( ) {
  int a = s . nextInt ( ) ;
  int b = 0 ;
  int [ ] q = new int [ s . nextInt ( ) ] ;
  for ( int i = 0 ;
  i < s . nextInt ( ) ;
  i ++ ) {
    if ( a == s . nextInt ( ) ) {
      b ++ ;
    }
    else {
      q [ i ] = a ;
      q [ i ] = b ;
    }
  }
  q [ 0 ] = a ;
  String ans = "" ;
  for ( int i : q ) {
    ans += String . valueOf ( i ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}

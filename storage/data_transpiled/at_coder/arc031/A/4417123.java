public static void input ( ) {
  String s = input ( ) ;
  int n = s . length ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . charAt ( i ) != s . charAt ( n - 1 - i ) ) {
      System . out . println ( "NO" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "YES" ) ;
}

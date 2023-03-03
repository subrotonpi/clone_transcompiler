public static void input ( ) {
  String s = input . nextLine ( ) ;
  int n = s . length ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . charAt ( i ) != s . charAt ( n - i - 1 ) ) {
      System . out . println ( "NO" ) ;
      break ;
    }
  }
  else {
    System . out . println ( "YES" ) ;
  }
}

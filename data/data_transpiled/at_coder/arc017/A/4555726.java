public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  for ( int i = 2 ;
  i <= ( int ) ( n * 0.5 ) ;
  i ++ ) {
    if ( n % i == 0 ) {
      System . out . println ( "NO" ) ;
      break ;
    }
  }
  else {
    System . out . println ( "YES" ) ;
  }
}

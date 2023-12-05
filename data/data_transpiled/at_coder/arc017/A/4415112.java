public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int q = ( int ) ( n * 0.5 ) ;
  boolean b = true ;
  for ( int i = 2 ;
  i <= q ;
  i ++ ) {
    if ( n % i == 0 ) {
      b = false ;
      break ;
    }
  }
  if ( b ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}

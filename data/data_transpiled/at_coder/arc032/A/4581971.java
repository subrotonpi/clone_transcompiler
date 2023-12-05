public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  if ( n == 1 ) {
    System . out . println ( "BOWWOW" ) ;
    exit ( ) ;
  }
  int s = n * ( n + 1 ) / 2 ;
  for ( int i = 2 ;
  i <= ( int ) ( s * 0.5 ) ;
  i ++ ) {
    if ( s % i == 0 ) {
      System . out . println ( "BOWWOW" ) ;
      break ;
    }
  }
  else {
    System . out . println ( "WANWAN" ) ;
  }
}

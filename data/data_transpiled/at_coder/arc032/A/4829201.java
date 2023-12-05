public static void main ( ) {
  n = Integer . parseInt ( input ( ) ) ;
  m = n * ( n + 1 ) / 2 ;
  if ( n == 1 ) {
    System . out . println ( "BOWWOW" ) ;
    exit ( ) ;
  }
  for ( int i = 2 ;
  i <= ( int ) m ;
  i ++ ) {
    if ( m % i == 0 ) {
      System . out . println ( "BOWWOW" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "WANWAN" ) ;
}

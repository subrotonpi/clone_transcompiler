public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int cnt = 0 ;
  int m = n ;
  while ( m > 1 ) {
    m /= 2 ;
    cnt ++ ;
  }
  boolean taka = true ;
  m = 1 ;
  while ( m <= n ) {
    if ( taka ^ ( cnt % 2 == 0 ) ) {
      m = 2 * m ;
    }
    else {
      m = 2 * m + 1 ;
    }
    taka = ! taka ;
  }
  if ( taka ) {
    System . out . println ( "Takahashi" ) ;
  }
  else {
    System . out . println ( "Aoki" ) ;
  }
}

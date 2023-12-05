public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  if ( n <= 500 ) {
    System . out . println ( n ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      System . out . println ( StringUtils . repeat ( " " , n + 1 ) ) ;
    }
    exit ( ) ;
  }
  int m = ( n + 4 - 1 ) / 4 * 2 ;
  System . out . println ( m ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    if ( i % 2 == 0 ) {
      System . out . println ( StringUtils . repeat ( " " , ( i + j ) % m % n + 1 ) ) ;
    }
    else {
      System . out . println ( StringUtils . repeat ( " " , ( m + ( i + j ) % m ) < n ? ( m + ( i + j ) % m ) + 1 : ( ( i + j ) % m ) + 1 ) ) ;
    }
  }
}

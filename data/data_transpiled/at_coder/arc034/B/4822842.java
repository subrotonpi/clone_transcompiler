public static void print ( int n ) {
  int [ ] ans = new int [ n + 1 ] ;
  int cnt = 0 ;
  for ( int i = Math . max ( n - 153 , 0 ) ;
  i <= n ;
  i ++ ) {
    if ( i + Integer . valueOf ( i ) . intValue ( ) == n ) {
      cnt ++ ;
      ans [ cnt ] = i ;
    }
  }
  System . out . println ( cnt ) ;
  if ( cnt != 0 ) {
    System . out . println ( ( String ) ans [ 0 ] ) ;
  }
}

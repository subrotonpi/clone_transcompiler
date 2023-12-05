static int n ( ) {
  int a = Integer . parseInt ( input . readLine ( ) ) ;
  int b = Integer . parseInt ( input . readLine ( ) ) ;
  int c = Integer . parseInt ( input . readLine ( ) ) ;
  int d = Integer . parseInt ( input . readLine ( ) ) ;
  for ( int m = 0 ;
  m < n ;
  m ++ ) {
    if ( c * ( n - 1 - m ) - d * m <= b - a <= - c * m + ( n - 1 - m ) * d ) {
      System . out . println ( "YES" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "NO" ) ;
  return a ;
}

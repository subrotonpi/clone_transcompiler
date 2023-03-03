public static int n ( ) {
  int a = Integer . parseInt ( input . readLine ( ) ) ;
  int b = Integer . parseInt ( input . readLine ( ) ) ;
  int c = Integer . parseInt ( input . readLine ( ) ) ;
  int d = Integer . parseInt ( input . readLine ( ) ) ;
  for ( int p = 0 ;
  p < n - 1 ;
  p ++ ) {
    int q = n - 1 - p ;
    int bMin = p * c - q * d ;
    int bMax = p * d - q * c ;
    if ( bMin <= b - a && bMax <= bMax ) {
      System . out . println ( "YES" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "NO" ) ;
  return a ;
}

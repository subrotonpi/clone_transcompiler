public static void print ( double n , int k ) {
  int r = Integer . parseInt ( input ( ) ) ;
  Collections . sort ( r ) ;
  double ans = 0.0 ;
  for ( int i = n - k ;
  i >= 0 ;
  i -- ) {
    ans = ( ans + r [ i ] ) / 2 ;
  }
  System . out . println ( ans ) ;
}

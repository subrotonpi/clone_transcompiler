public static boolean judige ( int n , int a , int b ) {
  int [ ] h = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) h [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  /* judige n */
  int num ;
  int check = 0 ;
  for ( int i = 0 ;
  i < h . length ;
  i ++ ) {
    num = h [ i ] ;
    num -= b * n ;
    if ( num > 0 ) check += num / ( Math . abs ( b - a ) ) ;
    else num / Math . abs ( b - a ) + 1 ;
  }
  return check <= n ;
}

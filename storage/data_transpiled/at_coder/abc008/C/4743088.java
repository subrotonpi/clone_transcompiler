public static double print ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  double ans = 0 ;
  int [ ] lis = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) lis [ i ] = Integer . parseInt ( input ( ) ) ;
  Arrays . sort ( lis ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int cou = 0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( i != j ) {
        if ( lis [ i ] % lis [ j ] == 0 ) cou ++ ;
      }
    }
    if ( cou % 2 == 1 ) ans += 0.5 ;
    else ans += ( cou + 2 ) / ( 2 * cou + 2 ) ;
  }
  return ans ;
}

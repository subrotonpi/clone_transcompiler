public static int [ ] getNegativeInstances ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int [ ] L = new int [ n ] ;
  L [ 0 ] = Integer . parseInt ( input ( ) ) ;
  int ans = 1 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    Arrays . sort ( L ) ;
    int a = Integer . parseInt ( input ( ) ) ;
    int y = 0 ;
    for ( int j = 0 ;
    j < L . length ;
    j ++ ) {
      if ( L [ j ] >= a ) {
        L [ j ] = a ;
        y = 1 ;
        break ;
      }
    }
    if ( y == 0 ) {
      ans ++ ;
      L [ i ] = a ;
    }
  }
  return L ;
}

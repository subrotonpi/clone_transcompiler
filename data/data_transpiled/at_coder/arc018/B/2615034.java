public static int [ ] [ ] a ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] a = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      a [ i ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x1 = a [ i ] [ 0 ] ;
    int y1 = a [ i ] [ 1 ] ;
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      int x2 = a [ j ] [ 0 ] ;
      int y2 = a [ j ] [ 1 ] ;
      for ( int k = 0 ;
      k < j ;
      k ++ ) {
        int x3 = a [ k ] [ 0 ] ;
        int y3 = a [ k ] [ 1 ] ;
        int m = Math . abs ( ( x2 - x1 ) * ( y3 - y1 ) - ( x3 - x1 ) * ( y2 - y1 ) ) ;
        if ( m % 2 == 0 && m != 0 ) {
          ans ++ ;
        }
      }
    }
  }
  return ans ;
}

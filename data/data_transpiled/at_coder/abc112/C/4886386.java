public static int [ ] [ ] a ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] a = new int [ n ] [ 2 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = new int [ 2 ] ;
    for ( int j = 0 ;
    j < a [ i ] . length ;
    j ++ ) {
      a [ i ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
      a [ i ] [ 0 ] = a [ i ] [ 2 ] ;
      a [ i ] [ 2 ] = a [ i ] [ 0 ] ;
    }
  }
  Arrays . sort ( a ) ;
  for ( int x = 0 ;
  x < 101 ;
  x ++ ) {
    for ( int y = 0 ;
    y < 101 ;
    y ++ ) {
      int h = a [ n - 1 ] [ 0 ] + Math . abs ( x - a [ n - 1 ] [ 2 ] ) + Math . abs ( y - a [ n - 1 ] [ 1 ] ) ;
      for ( int k = 0 ;
      k < n ;
      k ++ ) {
        int d = h - Math . abs ( x - a [ k ] [ 2 ] ) - Math . abs ( y - a [ k ] [ 1 ] ) ;
        if ( a [ k ] [ 0 ] != Math . max ( d , 0 ) ) break ;
        if ( k == n - 1 ) {
          System . out . println ( x + " " + y + " " + h ) ;
          exit ( ) ;
        }
      }
    }
  }
  return a ;
}

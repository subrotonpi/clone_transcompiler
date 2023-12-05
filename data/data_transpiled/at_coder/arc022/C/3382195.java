public static int [ ] [ ] x ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] x = new int [ n + 1 ] [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int a = ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    int b = ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    x [ a ] [ i ] = b ;
    x [ b ] [ i ] = a ;
  }
  int [ ] d = new int [ n + 1 ] , q = new int [ 1 ] , v = new int [ 1 ] ;
  v [ 1 ] = 0 ;
  while ( q . length > 0 ) {
    int p = q . pop ( ) ;
    for ( int i : x [ p ] ) {
      if ( v [ i ] != 0 ) {
        d [ i ] = d [ p ] + 1 ;
        q . push ( i ) ;
      }
    }
  }
  System . out . println ( m + " " + d . length ) ;
  return x ;
}

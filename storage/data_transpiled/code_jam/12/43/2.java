@ Function public static String rl ( ) {
  int n = input . nextInt ( ) ;
  int [ ] x = rl . split ( " " ) ;
  int [ ] h = new int [ n ] ;
  int [ ] a = new int [ n ] ;
  int [ ] st = new int [ n ] ;
  h [ n - 1 ] = - 1 ;
  a [ n - 1 ] = - 1 ;
  for ( int i : xrange ( n - 1 ) ) {
    if ( h [ i ] != 0 ) continue ;
    List < Integer > q = new ArrayList < Integer > ( ) ;
    int j = i ;
    while ( ! h [ j ] . equals ( x [ j ] ) ) {
      q . add ( j ) ;
      int nj = x [ j ] - 1 ;
      if ( ArrayUtil . regionMatches ( h , j + 1 , nj , x [ j ] ) ) return "Impossible" ;
      j = nj ;
    }
    int jj = j ;
    int hh = h [ j ] ;
    int aa = a [ j ] + 1 ;
    a [ j ] ++ ;
    for ( ;
    ;
    ) {
      a [ j ] = aa ;
      h [ j ] = hh - aa * ( jj - j ) ;
    }
  }
  int mh = - min ( h ) ;
  return Arrays . toString ( x ) ;
}

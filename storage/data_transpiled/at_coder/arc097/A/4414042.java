public static void input ( ) {
  s = input . nextLine ( ) ;
  K = Integer . parseInt ( input . nextLine ( ) ) ;
  int l = s . length ( ) ;
  int [ ] [ ] d = new int [ s . length ] [ l ] ;
  for ( int i = 0 ;
  i < d . length ;
  i ++ ) {
    d [ i ] [ 0 ] = s . charAt ( i ) ;
    d [ i ] [ 1 ] = l - i ;
  }
  Arrays . sort ( d ) ;
  Map < Integer , Integer > h = new HashMap < > ( ) ;
  int ans = 0 ;
  int ca = d [ 0 ] [ 0 ] ;
  for ( int i = 0 ;
  i < d . length ;
  i ++ ) {
    if ( ( d [ i ] [ 0 ] != ca ) && ( ! h . containsKey ( s . substring ( l - i [ 1 ] , l - i [ 1 ] + j ) ) ) ) {
      ans ++ ;
      h . putAll ( s . substring ( l - i [ 1 ] , l - i [ 1 ] + j ) , 1 ) ;
    }
    else {
    }
  }
  Arrays . sort ( h ) ;
  System . out . println ( h . get ( K - 1 ) ) ;
}

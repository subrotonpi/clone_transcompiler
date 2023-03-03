static final int [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] a ( ) {
  int n = Integer . parseInt ( input [ 0 ] [ 0 ] [ 0 ] ) , m = Integer . parseInt ( input [ 1 ] [ 0 ] [ 0 ] ) , p = Integer . parseInt ( input [ 2 ] [ 0 ] [ 1 ] ) , q = Integer . parseInt ( input [ 3 ] [ 0 ] [ 1 ] ) , r = Integer . parseInt ( input [ 4 ] [ 0 ] ) ) ;
  List < List < Integer >> x = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) x . add ( Collections . singletonList ( i ) ) ;
  List < Integer > [ ] [ ] [ ] [ ] [ ] c = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    wata [ i ] [ 0 ] [ i ] = 0 ;
    for ( int j = 0 ;
    j < x . size ( ) ;
    j ++ ) wata [ i ] [ j ] [ 1 ] [ i ] += x [ i ] [ 2 ] ;
  }
  for ( int i = 0 ;
  i < c . size ( ) ;
  i ++ ) {
    List < Integer > mora = new ArrayList < > ( ) ;
    for ( int j = 0 ;
    j < x . size ( ) ;
    j ++ ) for ( int k = 0 ;
    k < x . get ( j ) ;
    k ++ ) mora . add ( wata [ j ] [ k ] [ j ] [ k ] ) ;
  }
  for ( int i = 0 ;
  i < c . size ( ) ;
  i ++ ) {
    List < Integer > mora = x . get ( i ) ;
    for ( int j = 0 ;
    j < x . size ( ) ;
    j ++ ) mora . add ( wata [ j ] [ j ] [ j ] ) ;
  }
  for ( int i = 0 ;
  i < c . size ( ) ;
  i ++ ) mora . add ( mora [ i ] [ i ] ) ;
  return mora ;
}

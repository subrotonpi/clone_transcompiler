public static int [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] a ( ) {
  int N = Integer . parseInt ( input [ 0 ] [ 0 ] ) , C = Integer . parseInt ( input [ 1 ] [ 2 ] [ 3 ] ) ;
  List < List < Integer >> D = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < C ;
  i ++ ) D . add ( Collections . singletonList ( Arrays . asList ( [ i ] ) ) ) ;
  List < List < Integer >> grid = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) grid . add ( Collections . singletonList ( Arrays . asList ( [ i ] ) ) ) ;
  int [ ] [ ] [ ] [ ] a = new int [ C ] [ 3 ] [ 3 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int tmp = i % 3 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      a [ tmp ] [ grid . get ( i ) [ j ] - 1 ] ++ ;
      tmp = ( tmp + 1 ) % 3 ;
    }
  }
  int [ ] [ ] [ ] b = new int [ C ] [ 3 ] [ 3 ] ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) for ( int j = 0 ;
  j < C ;
  j ++ ) b [ i ] [ j ] = sum ( D [ k ] [ j ] * a [ i ] [ k ] ) ;
  Arrays . sort ( b [ 0 ] [ i ] ) ;
  int ans = 1000000000 ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) for ( int j = 0 ;
  j < 3 ;
  j ++ ) for ( int k = 0 ;
  k < 3 ;
  k ++ ) if ( b [ 0 ] [ i ] [ j ] [ 1 ] != b [ 1 ] [ j ] [ 1 ] && b [ 1 ] [ j ] [ 1 ] != b [ 2 ] [ k ] [ 1 ] && b [ 2 ] [ k ] [ 1 ] != b [ 0 ] [ i ] [ j ] [ 1 ] ) ans = Math . min ( ans , b [ 0 ] [ i ] [ 0 ] + b [ 1 ] [ j ] [ 0 ] + b [ 2 ] [ k ] [ 0 ] ) ;
  return ans ;
}

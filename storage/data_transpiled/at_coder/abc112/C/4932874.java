static final double INF = Double . POSITIVE_INFINITY ;
/* solve the number of words in the input */
for ( int i = 0 ;
i < N ;
i ++ ) {
  if ( h [ i ] > 0 ) break ;
}
int [ ] [ ] cand = new int [ 101 ] [ 101 ] ;
for ( int j = 0 ;
j < 101 ;
j ++ ) {
  for ( int k = 0 ;
  k < 101 ;
  k ++ ) {
    cand [ j ] [ k ] = h [ i ] + Math . abs ( x [ i ] - k ) + Math . abs ( y [ i ] - j ) ;
  }
}
for ( int i = 0 ;
i < 101 ;
i ++ ) {
  for ( int j = 0 ;
  j < 101 ;
  j ++ ) {
    int [ ] flags = new int [ 101 ] ;
    for ( int k = 0 ;
    k < 101 ;
    k ++ ) {
      flags [ k ] = Math . max ( cand [ i ] [ j ] - Math . abs ( x [ k ] - j ) - Math . abs ( y [ k ] - i ) , 0 ) == h [ k ] ;
    }
    if ( Arrays . equals ( flags , cand [ i ] [ j ] ) ) {
      System . out . println ( j + " " + i + " " + cand [ i ] [ j ] ) ;
      return 0 ;
    }
  }
}
/* main program */
for ( String line : System . console ( ) . split ( " " ) ) {
  for ( String word : line . split ( " " ) ) {
    /* print word */
    System . out . println ( word ) ;
  }
}
final List < String > tokens = new ArrayList < String > ( ) ;
final int N = Integer . parseInt ( tokens . get ( 0 ) ) ;
final int [ ] x = new int [ N ] ;
final int [ ] y = new int [ N ] ;
final int [ ] h = new int [ N ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  x [ i ] = Integer . parseInt ( tokens . get ( i ) ) ;
  y [ i ] = Integer . parseInt ( tokens . get ( i ) ) ;
  h [ i ] = Integer . parseInt ( tokens . get ( i ) ) ;
}
solve ( N , x , y , h ) ;
if ( __name__ ==
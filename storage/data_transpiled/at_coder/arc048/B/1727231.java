@ GwtIncompatible ( "java.util.Scanner" ) public static void main ( String [ ] args ) {
  final double INF = Double . MAX_VALUE ;
  /* Index left */
  final int [ ] rList = new int [ N ] ;
  final int [ ] rHList = new int [ N ] ;
  final Map < Integer , Integer > rHMap = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    rHList [ i ] = Integer . parseInt ( input ( args [ i ] ) ) ;
    if ( i != rList . length && rHList [ i ] == INF ) {
      return i ;
    }
    throw new IllegalArgumentException ( ) ;
  }
  /* Index right */
  final int [ ] rList = new int [ N ] ;
  final Map < Integer , Integer > rHMap = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    rList [ i ] = Integer . parseInt ( input ( args [ i ] ) ) ;
    int H = rHList [ i ] ;
    H -- ;
    rList [ i ] = R ;
    rHList [ i ] = new Integer ( R ) ;
    rHMap [ i ] [ H ] ++ ;
  }
  Arrays . sort ( rList ) ;
  for ( int r = 0 ;
  r < rHList . length ;
  r ++ ) {
    int h = rHList [ r ] ;
    int win = rHMap . get ( r ) ;
    int i = rHList [ r ] ;
    int lose = N - i - 1 ;
    int draw = 0 ;
    win += rHMap . get ( r ) [ ( h + 1 ) % 3 ] ;
    lose += rHMap . get ( r ) [ ( h - 1 ) % 3 ] ;
    draw += rHMap . get ( r ) [ h ] ;
    System . out . println ( win + " " + lose + " " + ( draw - 1 ) ) ;
  }
}

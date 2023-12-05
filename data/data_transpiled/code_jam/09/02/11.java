@ GwtIncompatible ( "java.util.Scanner" ) public static void main ( String [ ] args ) {
  Scanner input = new Scanner ( System . in ) ;
  int H = input . nextInt ( ) ;
  int W = input . nextInt ( ) ;
  int [ ] [ ] altitudes = input . next ( ) ;
  int [ ] [ ] labels = new int [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) labels [ i ] [ 0 ] = null ;
  for ( int i0 = 0 ;
  i0 < H ;
  i0 ++ ) {
    for ( int j0 = 0 ;
    j0 < W ;
    j0 ++ ) {
      int i = i0 , j = j0 ;
      List < Point > path = new ArrayList < Point > ( ) ;
      do {
        Point symb ;
        if ( labels [ i ] [ j ] != null ) {
          symb = labels [ i ] [ j ] ;
          break ;
        }
        path . add ( new Point ( i , j ) ) ;
        Set < Point > neighbours = new HashSet < Point > ( ) ;
        for ( int di = - 1 , dj = 0 ;
        di < H ;
        di ++ , dj += dj ) {
          if ( 0 <= i + di && 0 <= j + dj && altitudes [ i + di ] [ j + dj ] < altitudes [ i ] [ j ] ) neighbours . add ( new Point ( i + di , j + dj ) ) ;
        }
        if ( neighbours . isEmpty ( ) ) {
          symb = symbols . pop ( ) ;
          break ;
        }
        else {
          i = Collections . min ( neighbours , new Comparator < Point > ( ) {
            @ Override public int compare ( Point p , Point p ) {
              return ( altitudes [ p . x ] [ p . y ] ) - p . x ;
            }
          }
          ) ;
        }
        for ( Point p : path ) labels [ i ] [ j ] = symb ;
      }
    }
  }
  /* read case */
  H = input . nextInt ( ) ;
  W = input . nextInt ( ) ;
  altitudes = new int [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) altitudes [ i ] = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < W ;
  i ++ ) altitudes [ i ] [ i ] = Lists . newArrayList ( ) ;
}

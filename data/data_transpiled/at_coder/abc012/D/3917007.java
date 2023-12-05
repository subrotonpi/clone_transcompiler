public static int [ ] [ ] warshallFloyd ( int vCount , @ Nonnull int [ ] [ ] matrix ) {
  for ( int i = 0 ;
  i < vCount ;
  i ++ ) {
    for ( int j = 0 ;
    j < matrix [ i ] . length ;
    j ++ ) {
      int c2 = matrix [ i ] [ j ] [ 0 ] ;
      for ( int k = 0 ;
      k < matrix [ j ] . length ;
      k ++ ) {
        final int c1 = matrix [ j ] [ k ] ;
        final int c3 = matrix [ i ] [ k ] ;
        if ( c1 > c2 + c3 ) {
          matrix [ j ] [ k ] = c2 + c3 ;
        }
      }
    }
  }
  if ( getClass ( ) . isClassPresent ( String . class ) ) {
    final int N = Integer . parseInt ( input . nextLine ( ) ) ;
    final int M = Integer . parseInt ( input . nextLine ( ) ) ;
    final float inf = Float . POSITIVE_INFINITY ;
    matrix = new int [ N ] [ M ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      matrix [ i ] [ i ] = inf ;
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      matrix [ i ] [ i ] = 0 ;
    }
    for ( int a = 0 ;
    a < M ;
    a ++ ) {
      for ( int b = 0 ;
      b < M ;
      b ++ ) {
        matrix [ a ] [ b - 1 ] = matrix [ b - 1 ] [ a - 1 ] = t ;
      }
    }
    matrix = warshallFloyd ( N , matrix ) ;
    System . out . println ( Math . min ( Math . max ( matrix [ 0 ] . length , matrix [ 1 ] . length ) , matrix [ 0 ] . length ) ) ;
  }
  return matrix ;
}

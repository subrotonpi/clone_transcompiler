public static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > cards = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < input . nextLine ( ) . length ( ) ;
  i ++ ) {
    cards . add ( Integer . parseInt ( input . nextLine ( ) . substring ( i , i + 1 ) ) - A ) ;
  }
  int X = Collections . max ( cards ) ;
  X = Collections . max ( X , A ) ;
  int [ ] [ ] dp = new int [ N + 1 ] [ 2 * N * X + 1 ] ;
  dp [ 0 ] [ N * X ] = 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < 2 * N * X + 1 ;
    j ++ ) {
      int c = cards . get ( i ) ;
      if ( j - c < 0 || j - c > 2 * N * X ) {
        dp [ i + 1 ] [ j ] = dp [ i ] [ j ] ;
      }
      else {
        dp [ i + 1 ] [ j ] = dp [ i ] [ j ] + dp [ i ] [ j - c ] ;
      }
    }
  }
  return dp [ N ] [ N * X ] - 1 ] ;
}

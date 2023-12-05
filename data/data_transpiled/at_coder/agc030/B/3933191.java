public static int L = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] X = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) X [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  /* calc the array of integers */
  int [ ] cumsum = new int [ N ] ;
  for ( int i = 0 ;
  i < X . length ;
  i ++ ) {
    cumsum [ i ] = cumsum [ i ] ;
  }
  int res = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int d ;
    if ( ( i + N ) % 2 != 0 ) {
      end = ( i + N - 1 ) / 2 ;
      d = 2 * ( cumsum [ end + 1 ] - cumsum [ i ] ) + 2 * L * ( N - 1 - end ) - 2 * ( cumsum [ N ] - cumsum [ end ] ) - ( L - X [ end ] ) ;
    }
    else {
      res = 0 ;
    }
  }
  return res ;
}

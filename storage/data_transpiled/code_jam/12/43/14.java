@ org . python . Method ( __doc__ = "Case #" + ( k + 1 ) + ": " + ans ) ;
/* Read in the input stream and return the result as a string */
public static int [ ] readList ( ) {
  int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  /* Try increment N and H */
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    double lhs = ( H [ L [ i ] - 1 ] - H [ i ] ) / ( L [ i ] - 1 - i ) ;
    for ( int j = i + 1 ;
    j < N ;
    j ++ ) {
      if ( j != L [ i ] - 1 ) {
        double rhs = ( H [ j ] - H [ i ] ) / ( j - i ) ;
        if ( lhs <= rhs ) {
          H [ L [ i ] - 1 ] ++ ;
          return 1 ;
        }
      }
    }
  }
  return 0 ;
}

static final int [ ] getLevenshteinDistance ( int sLen , int tLen , int q ) {
  int [ ] shrines = new int [ sLen ] ;
  int [ ] temples = new int [ tLen ] ;
  for ( int i = 0 ;
  i < sLen ;
  i ++ ) {
    shrines [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  for ( int i = 0 ;
  i < tLen ;
  i ++ ) {
    temples [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  /* Distance between 0 and 1 */
  if ( 0 <= sLen && 0 <= tLen && tLen < tLen ) {
    int s = shrines [ sLen ] ;
    int t = temples [ tLen ] ;
    if ( s >= t ) {
      return Math . max ( s , t ) - s ;
    }
    else if ( s <= t >= t ) {
      return s - Math . min ( s , t ) ;
    }
    else {
      return Math . abs ( s - t ) + Math . min ( Math . abs ( t - t ) , Math . abs ( s - s ) ) ;
    }
  }
  /* Solve */
  int sI = Arrays . binarySearch ( shrines , temples ) ;
  int tI = Arrays . binarySearch ( temples , temples ) ;
  /* Solve */
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    System . out . println ( solve ( ( int ) input . nextLine ( ) ) ) ;
  }
  return null ;
}

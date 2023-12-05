@ VisibleForTesting static int [ ] fractions ( Scanner scanner ) {
  final int casenum = 0 ;
  int CASES = 0 ;
  final List < Integer > times = new ArrayList < > ( ) ;
  while ( scanner . hasNextLine ( ) ) {
    if ( casenum == 0 ) {
      CASES = Integer . parseInt ( scanner . nextLine ( ) . trim ( ) ) ;
    }
    else {
      final int [ ] nums = new int [ scanner . nextLine ( ) . trim ( ) . split ( "\\s+" ) . length ] ;
      for ( int j = 0 ;
      j < nums . length ;
      j ++ ) {
        nums [ j ] = Integer . parseInt ( scanner . nextLine ( ) . trim ( ) ) ;
      }
      final int N = nums [ 0 ] ;
      int T = Math . abs ( nums [ 2 ] - nums [ 1 ] ) ;
      for ( int i = 3 ;
      i <= N ;
      i ++ ) {
        T = gcd ( T , Math . abs ( nums [ i ] - nums [ i - 1 ] ) ) ;
      }
      System . out . println ( "Case #" + casenum + ": " + ( T - ( nums [ 1 ] % T ) ) % T ) ;
    }
    casenum ++ ;
    if ( casenum == CASES + 1 ) {
      break ;
    }
  }
  return times . toArray ( new Integer [ 0 ] ) ;
}

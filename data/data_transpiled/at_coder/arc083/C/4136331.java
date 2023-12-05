public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > P = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    P . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  P = Arrays . copyOf ( P , P . size ( ) ) ;
  int [ ] X = Lists . newArrayList ( ) ;
  int [ ] Y = new int [ N ] ;
  List < Integer > [ ] children = new List [ N ] ;
  for ( int i = N - 1 ;
  i > 0 ;
  i -- ) {
    int parent = P . get ( i ) - 1 ;
    if ( children [ parent ] == null ) {
      children [ parent ] = new ArrayList < Integer > ( ) ;
    }
    children [ parent ] . add ( i ) ;
  }
  for ( int i = N - 1 ;
  i >= 0 ;
  i -- ) {
    if ( ! children [ i ] . isEmpty ( ) ) {
      int [ ] [ ] dp = new int [ N ] [ N ] ;
      int jMax = children [ i ] . size ( ) ;
      for ( int j = 0 ;
      j < jMax + 1 ;
      j ++ ) {
        dp [ j ] [ j ] = new int [ 5050 ] ;
      }
      dp [ 0 ] [ 0 ] = 1 ;
      int xSum = 0 , ySum = 0 ;
      for ( int j = 0 ;
      j < jMax ;
      j ++ ) {
        int c = children [ i ] . get ( j ) ;
        int xc = X [ c ] , yc = Y [ c ] ;
        xSum += xc ;
        ySum += yc ;
        for ( int k = 0 ;
        k < X [ i ] + 1 ;
        k ++ ) {
          if ( xc <= k && dp [ j ] [ k - xc ] == 1 ) {
            dp [ j + 1 ] [ k ] = 1 ;
          }
          if ( yc <= k && dp [ j ] [ k - yc ] == 1 ) {
            dp [ j + 1 ] [ k ] = 1 ;
          }
        }
      }
      boolean f = false ;
      for ( int k = X [ i ] ;
      k >= 0 ;
      k -- ) {
        if ( dp [ jMax ] [ k ] == 1 ) {
          Y [ i ] = xSum + ySum - k ;
          f = true ;
          break ;
        }
      }
      if ( ! f ) {
        System . out . println ( " IMP@@
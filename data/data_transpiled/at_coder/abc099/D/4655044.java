public static double [ ] [ ] readInput ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] D = new int [ C ] [ C ] ;
  for ( int i = 0 ;
  i < C ;
  i ++ ) D [ i ] [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] L = new int [ 3 ] [ C ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int [ ] X = new int [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      X [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      L [ ( i + j ) % 3 ] [ X [ j ] - 1 ] ++ ;
    }
  }
  double ans = Double . POSITIVE_INFINITY ;
  for ( int i = 0 ;
  i < C ;
  i ++ ) {
    for ( int j = 0 ;
    j < C ;
    j ++ ) {
      for ( int k = 0 ;
      k < C ;
      k ++ ) {
        if ( i != j && j != k && k != i ) {
          int tmp = 0 ;
          for ( int x = 0 ;
          x < C ;
          x ++ ) {
            tmp += L [ 0 ] [ x ] * D [ x ] [ i ] + L [ 1 ] [ x ] * D [ x ] [ j ] + L [ 2 ] [ x ] * D [ x ] [ k ] ;
          }
          ans = Math . min ( ans , tmp ) ;
        }
      }
    }
  }
  System . out . println ( ans ) ;
  return D ;
}

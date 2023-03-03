public static int N = Integer . parseInt ( input ) {
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int L [ ] [ ] = new int [ D ] [ K ] ;
  for ( int i = 0 ;
  i < L . length ;
  i ++ ) L [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int M [ ] [ ] = new int [ K ] [ K ] ;
  for ( int i = 0 ;
  i < M . length ;
  i ++ ) M [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    int cur = M [ i ] [ 0 ] ;
    int day = 0 ;
    if ( M [ i ] [ 0 ] < M [ i ] [ 1 ] ) {
      for ( int j = 0 ;
      j < D ;
      j ++ ) {
        if ( L [ j ] [ 0 ] <= cur && cur <= L [ j ] [ 1 ] ) {
          if ( L [ j ] [ 0 ] <= M [ i ] [ 1 ] && M [ i ] [ 1 ] <= L [ j ] [ 1 ] ) {
            day ++ ;
            System . out . println ( day ) ;
            break ;
          }
          else {
            day ++ ;
            cur = L [ j ] [ 1 ] ;
          }
        }
        else {
          day ++ ;
        }
      }
    }
    else {
      for ( int j = 0 ;
      j < D ;
      j ++ ) {
        if ( L [ j ] [ 0 ] <= cur && cur <= L [ j ] [ 1 ] ) {
          if ( L [ j ] [ 0 ] <= M [ i ] [ 1 ] && M [ i ] [ 1 ] <= L [ j ] [ 1 ] ) {
            day ++ ;
            System . out . println ( day ) ;
            break ;
          }
          else {
            day ++ ;
            cur = L [ j ] [ 0 ] ;
          }
        }
        else {
          day ++ ;
        }
      }
    }
  }
  return N ;
}

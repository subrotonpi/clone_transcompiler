public static int [ ] [ ] readInput ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] K = new int [ N ] ;
  int [ ] [ ] A = new int [ M ] [ N ] ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    int [ ] inpt = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      inpt [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
    }
    K [ i ] = inpt [ 0 ] ;
    for ( int j = 1 ;
    j <= K [ i ] ;
    j += 1 ) {
      A [ i ] [ j - 1 ] = inpt [ j ] ;
    }
  }
  int count = 0 ;
  for ( int j = 1 ;
  j <= M ;
  j += 1 ) {
    int likecount = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      for ( int k = 0 ;
      k < K [ i ] ;
      k ++ ) {
        if ( A [ i ] [ k ] == j ) {
          likecount ++ ;
        }
      }
    }
    if ( likecount == N ) {
      count ++ ;
    }
  }
  System . out . println ( count ) ;
  return A ;
}

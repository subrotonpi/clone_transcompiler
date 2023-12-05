public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int [ ] K = new int [ N ] ;
  int [ ] [ ] A = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] [ i ] = Integer . parseInt ( input ) ;
  }
  int count = 0 ;
  for ( int i = 1 ;
  i <= M ;
  i += 1 ) {
    int likecount = 0 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      for ( int k = 1 ;
      k < N ;
      k ++ ) {
        if ( A [ j ] [ k ] == i ) {
          likecount ++ ;
        }
      }
    }
    if ( likecount == N ) {
      count ++ ;
    }
  }
  System . out . println ( count ) ;
}

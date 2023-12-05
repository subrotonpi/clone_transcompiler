public static int nR = Integer . parseInt ( input ) {
  for ( int run = 0 ;
  run < nR ;
  run ++ ) {
    String [ ] data = input . split ( " " ) ;
    int N = Integer . parseInt ( data [ 0 ] ) ;
    int M = Integer . parseInt ( data [ 1 ] ) ;
    int K = Integer . parseInt ( data [ 2 ] ) ;
    int mini = K ;
    for ( int i = 2 ;
    i <= N ;
    i ++ ) {
      for ( int j = 2 ;
      j <= M ;
      j ++ ) {
        int loss = 0 ;
        int rm = 0 ;
        for ( int k = 0 ;
        k < Math . min ( i , j ) / 2 ;
        k ++ ) {
          for ( int m = 0 ;
          m < 5 ;
          m ++ ) {
            if ( 2 * k == Math . min ( i , j ) && m > 2 ) break ;
            if ( i * j - loss < K ) break ;
            if ( 2 * ( i + j ) - 4 - rm < mini ) mini = 2 * ( i + j ) - 4 - rm ;
            loss += ( k + 1 ) ;
            rm ++ ;
          }
          if ( i * j - loss < K ) break ;
        }
      }
    }
    System . out . println ( "Case #" + ( run + 1 ) + ": " + mini ) ;
  }
  return mini ;
}

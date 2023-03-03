public static int T = Integer . parseInt ( readLine ( ) ) {
  for ( int Case = 0 ;
  Case < Range . T ;
  Case ++ ) {
    int A = Integer . parseInt ( readLine ( ) ) ;
    int B = Integer . parseInt ( readLine ( ) ) ;
    int K = Integer . parseInt ( readLine ( ) ) ;
    /* tobin */
    int [ ] [ ] A = new int [ 32 ] [ ] ;
    int [ ] [ ] B = new int [ 32 ] [ ] ;
    int [ ] [ ] K = new int [ 32 ] [ ] ;
    /* tobin */
    for ( int i = 0 ;
    i < Range . T ;
    i ++ ) {
      for ( int j = 0 ;
      j < Range . T ;
      j ++ ) {
        for ( int k = 0 ;
        k < Range . T ;
        k ++ ) {
          A [ i ] [ j ] = ( A [ i ] >> ( 31 - i ) ) & 1 ;
          B [ i ] [ j ] = ( B [ i ] >> ( 32 - j ) ) & 1 ;
          K [ i ] [ j ] = ( K [ i ] >> ( 32 - j ) ) & 1 ;
        }
      }
    }
    for ( int i = 0 ;
    i < Range . T ;
    i ++ ) {
      int [ ] [ ] [ ] new int [ ] [ ] [ ] {
        {
          Integer . MIN_VALUE , Integer . MIN_VALUE }
          , {
            Integer . MIN_VALUE , Integer . MIN_VALUE }
          }
        }
        for ( int j = 0 ;
        j < Range . T ;
        j ++ ) {
          for ( int k = 0 ;
          k < Range . T ;
          k ++ ) {
            for ( int l = 0 ;
            l < Range . T ;
            l ++ ) {
              for ( int m = 0 ;
              m < Range . T ;
              m ++ ) {
                for ( int n = 0 ;
                n < Range . T ;
                n ++ ) {
                  if ( dp [ - 1 ] [ j ] [ k ] [ l ] == 0 ) continue ;
                  int o = m & n ;
                  if ( j == 1 && m > A [ i ] ) continue ;
                  if ( k == 1 && n > B [ i ] ) continue ;
                  if ( l == 1 && o > K [ i ] ) continue ;
                  int nj = ( int ) j == 1 && m == A [ i ] ? A [ i ] : B [ i ] ;
                  int nk = ( int ) k == 1 && n == B [ i ] ? B [
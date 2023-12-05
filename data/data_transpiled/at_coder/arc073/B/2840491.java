public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int MAX_N = 100 ;
  {
    int [ ] w = new int [ N + 1 ] , v = new int [ N + 1 ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int wi = Integer . parseInt ( input . nextLine ( ) ) ;
      int vi = Integer . parseInt ( input . nextLine ( ) ) ;
      w [ i ] = wi ;
      v [ i ] = vi ;
    }
    int [ ] [ ] dp = new int [ 3 * MAX_N + 1 ] [ N + 1 ] ;
    for ( int k = 0 ;
    k < N + 1 ;
    k ++ ) {
      for ( int j = 0 ;
      j < N + 1 ;
      j ++ ) {
        for ( int i = 0 ;
        i < N + 1 ;
        i ++ ) {
          for ( int j = 0 ;
          j < i + 1 ;
          j ++ ) {
            for ( int k = 0 ;
            k < 3 * j + 1 ;
            k ++ ) {
              if ( k - ( w [ i - 1 ] - w [ 0 ] ) >= 0 ) {
                if ( j * w [ 0 ] + k <= W && j > 0 ) {
                  dp [ i ] [ j ] [ k ] = Math . max ( dp [ i - 1 ] [ j ] [ k ] , dp [ i - 1 ] [ j - 1 ] [ k - ( w [ i - 1 ] - w [ 0 ] ) ] + v [ i - 1 ] ) ;
                }
                else {
                  dp [ i ] [ j ] [ k ] = 0 ;
                }
              }
              else {
                dp [ i ] [ j ] [ k ] = dp [ i - 1 ] [ j ] [ k ] ;
              }
            }
          }
        }
      }
    }
    int ans = 0 ;
    for ( int i = 0 ;
    i < N + 1 ;
    i ++ ) {
      for ( int j = 0 ;
      j < 3 * i + 1 ;
      j ++ ) {
        ans = Math . max ( ans , dp [ N ] [ i ] [ j ] ) ;
      }
    }
    System . out . println ( ans ) ;
  }
  if ( getClass ( ) . equals ( "com.google.common.util.Main" ) ) {
    main ( ) ;
  }
}

public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] X = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    x -- ;
    y -- ;
    X [ x ] [ y ] = 1 ;
    X [ y ] [ x ] = 1 ;
  }
  int ans = 1 ;
  for ( int i = 1 ;
  i < 1 << N ;
  i ++ ) {
    boolean f = false ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      for ( int k = 0 ;
      k < j ;
      k ++ ) {
        if ( ( i >> j ) & ( i >> k ) & 1 && X [ j ] [ k ] == 0 ) {
          f = true ;
          break ;
        }
      }
      if ( f ) break ;
    }
    if ( ! f ) {
      ans = Math . max ( ans , Integer . toBinaryString ( i ) . indexOf ( "1" ) ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}

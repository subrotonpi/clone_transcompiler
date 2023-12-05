@ Scanner ( System . in ) public static Numeric solve ( Scanner input ) {
  final int MOD = 30031 ;
  int N ;
  int M ;
  int K ;
  int N ;
  int NN ;
  int N ;
  int N ;
  int N ;
  int N ;
  int K ;
  int half ;
  int hp ;
  int P ;
  int [ ] line ;
  line = input . nextLine ( ) . split ( "\\s+" ) ;
  N = Integer . parseInt ( line [ 0 ] ) ;
  K = Integer . parseInt ( line [ 1 ] ) ;
  P = Integer . parseInt ( line [ 2 ] ) ;
  entr = new int [ N ] ;
  backw = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    cnt = 0 ;
    for ( int j = 0 ;
    j < P ;
    j ++ ) {
      if ( ( ( i & ( 1 << j ) ) != 0 ) ) cnt ++ ;
    }
    if ( cnt == K && ( i & 1 ) == 1 ) {
      backw [ i ] = entr . length ;
      entr [ N ] = i ;
    }
  }
  NN = entr . length ;
  M = new int [ NN ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    M = new int [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( ( entr [ i ] & ( 1 << ( P - 1 ) ) ) != 0 ) {
        int next = entr [ i ] - ( 1 << ( P - 1 ) ) ;
        next <<= 1 ;
        next += 1 ;
        M [ backw [ next ] ] [ i ] ++ ;
      }
      else {
        for ( int j = 0 ;
        j < P ;
        j ++ ) {
          if ( ( ( entr [ i ] & ( 1 << j ) ) != 0 ) ) {
            int next = entr [ i ] - ( 1 << j ) ;
            next <<= 1 ;
            next += 1 ;
            M [ backw [ next ] ] [ i ] ++ ;
          }
        }
      }
    }
    M = Math . pow ( M , N - K , NN ) ;
    v = new int [ N ] ;
    v [ 0 ] = 1 ;
    vv = dot ( M , v ) ;
    return Integer . valueOf ( vv [ 0 ] % MOD ) ;
  }
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    res = solve ( input ) ;
    
public static int N = Integer . parseInt ( input ) {
  int MOD = Integer . parseInt ( input . nextLine ( ) ) , N = ( int ) ( 1e9 + 7 ) ;
  ArrayList < Character > all_suffix = new ArrayList < Character > ( ) ;
  char [ ] base = {
    'A' , 'C' , 'G' , 'T' }
    ;
    for ( char char1 : base ) {
      for ( char char2 : base ) {
        for ( char char3 : base ) {
          all_suffix . add ( char1 + char2 + char3 ) ;
        }
      }
    }
    int len_all_suffix = all_suffix . size ( ) ;
    /*judge*/
    for ( int i = 0 ;
    i < 4 ;
    i ++ ) {
      char [ ] tmp = new char [ N - 2 ] ;
      for ( int j = 0 ;
      j < N - 2 ;
      j ++ ) {
        tmp [ j ] = last4 [ j ] ;
        if ( j >= 1 ) {
          tmp [ j - 1 ] = tmp [ j ] ;
        }
        if ( new String ( tmp ) . indexOf ( "AGC" ) >= 0 ) return false ;
      }
    }
    int [ ] [ ] dp = new int [ N - 2 ] [ N - 1 ] ;
    for ( int i = 0 ;
    i < N - 2 ;
    i ++ ) {
      dp [ i ] [ 0 ] = 0 ;
    }
    for ( int i = 0 ;
    i < N - 2 ;
    i ++ ) {
      if ( all_suffix . get ( i ) != 'AGC' && all_suffix . get ( i ) != 'GAC' && all_suffix . get ( i ) != 'ACG' ) dp [ 0 ] [ all_suffix . indexOf ( all_suffix . get ( i ) ) ] ++ ;
    }
    for ( int i = 1 ;
    i < N - 2 ;
    i ++ ) {
      for ( int j = 0 ;
      j < len_all_suffix ;
      j ++ ) {
        for ( char c : base ) {
          if ( judge ( all_suffix . get ( j ) + c ) ) {
            int k = all_suffix . indexOf ( all_suffix . get ( j ) . substring ( 1 ) + c ) ;
            dp [ i ] [ k ] += dp [ i - 1 ] [ j ] % MOD ;
          }
        }
      }
    }
    System . out . println ( Arrays . toString ( dp [ N - 3 ] ) % MOD ) ;
    return N ;
  }
  
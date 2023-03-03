public static int [ ] [ ] getBinaryArray ( String input ) {
  int N = Integer . parseInt ( input ) , K = Integer . parseInt ( input ) ;
  int [ ] [ ] a = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) a [ i ] = Integer . parseInt ( input ) ;
  int l = Math . max ( Integer . SIZE , Integer . SIZE ) - 2 ;
  K = Integer . toBinaryString ( K ) . substring ( 2 ) . substring ( 2 ) . substring ( l ) ;
  Arrays . sort ( a ) ;
  int [ ] [ ] val = new int [ l ] [ 2 ] ;
  for ( int i = 0 ;
  i < l ;
  i ++ ) {
    val [ i ] [ 0 ] = 0 ;
    val [ i ] [ 1 ] = 0 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < l ;
    j ++ ) {
      if ( a [ i ] [ j ] . equals ( "0" ) ) val [ j ] [ 0 ] ++ ;
      else val [ j ] [ 1 ] ++ ;
    }
  }
  int tmp = 0 ;
  for ( int j = 0 ;
  j < l ;
  j ++ ) {
    tmp += ( N - val [ j ] [ Integer . valueOf ( K [ j ] ) ] ) * 2 * j ;
  }
  int ans = tmp ;
  for ( int i = 0 ;
  i < l ;
  i ++ ) {
    tmp = 0 ;
    if ( K [ i ] . equals ( "1" ) ) {
      for ( int j = 0 ;
      j < i ;
      j ++ ) {
        tmp += Math . max ( val [ j ] [ 0 ] , val [ j ] [ 1 ] ) * 2 * j ;
      }
      tmp += val [ i ] [ 1 ] * 2 * i ;
      for ( int j = i + 1 ;
      j < l ;
      j ++ ) {
        tmp += ( N - val [ j ] [ Integer . valueOf ( K [ j ] ) ] ) * 2 * j ;
      }
    }
    ans = Math . max ( ans , tmp ) ;
  }
  System . out . println ( ans ) ;
  return a ;
}

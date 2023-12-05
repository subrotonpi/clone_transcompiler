public static void main ( String input , int A , int B ) {
  int [ ] pA = Integer . parseInt ( input ) ;
  pA [ 0 ] = Integer . parseInt ( String . valueOf ( A ) ) ;
  if ( pA [ 0 ] == 9 ) {
    if ( pA [ 1 ] == 9 ) {
      if ( pA [ 2 ] == 9 ) {
      }
      else {
        pA [ 2 ] = 9 ;
      }
    }
    else {
      pA [ 1 ] = 9 ;
    }
  }
  else {
    pA [ 0 ] = 9 ;
  }
  int ppA = pA [ 0 ] * 100 + pA [ 1 ] * 10 + pA [ 2 ] ;
  pB = Integer . parseInt ( String . valueOf ( B ) ) ;
  if ( pB [ 0 ] == 1 ) {
    if ( pB [ 1 ] > 0 ) pB [ 1 ] = 0 ;
    else {
      if ( pB [ 2 ] > 0 ) pB [ 2 ] = 0 ;
    }
  }
  else {
    pB [ 0 ] = 1 ;
  }
  int ppB = pB [ 0 ] * 100 + pB [ 1 ] * 10 + pB [ 2 ] ;
  System . out . println ( Math . max ( A - B , ppA - B , A - ppB ) ) ;
}

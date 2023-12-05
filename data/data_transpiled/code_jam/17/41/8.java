@ VisibleForTesting static void ceil ( double input ) {
  int numInputs = Integer . parseInt ( input ) ;
  for ( int i = 0 ;
  i < numInputs ;
  i ++ ) {
    int N = Integer . parseInt ( input ) ;
    int P = Integer . parseInt ( input ) ;
    int G = Integer . parseInt ( input ) ;
    int [ ] numsMod = new int [ P ] ;
    for ( int j = 0 ;
    j < P ;
    j ++ ) {
      numsMod [ j ] = 0 ;
    }
    for ( int g : G ) {
      numsMod [ g % P ] ++ ;
    }
    if ( P == 2 ) {
      System . out . println ( "Case #" + ( i + 1 ) + ": " + ( numsMod [ 0 ] + ceil ( numsMod [ 1 ] / 2.0 ) ) ) ;
      continue ;
    }
    if ( P == 3 ) {
      int smaller = Math . min ( numsMod [ 1 ] , numsMod [ 2 ] ) ;
      int larger = Math . max ( numsMod [ 1 ] , numsMod [ 2 ] ) ;
      int diff = larger - smaller ;
      System . out . println ( "Case #" + ( i + 1 ) + ": " + ( numsMod [ 0 ] + smaller + ceil ( diff / 3.0 ) ) ) ;
      continue ;
    }
    int total = numsMod [ 0 ] ;
    total += floor ( numsMod [ 2 ] / 2.0 ) ;
    int smaller = Math . min ( numsMod [ 1 ] , numsMod [ 3 ] ) ;
    int larger = Math . max ( numsMod [ 1 ] , numsMod [ 3 ] ) ;
    int diff = larger - smaller ;
    total += smaller ;
    if ( numsMod [ 2 ] % 2 == 1 ) {
      total ++ ;
      if ( diff > 2 ) {
        total += ceil ( ( diff - 2 ) / 4.0 ) ;
      }
    }
    else {
      total += ceil ( diff / 4.0 ) ;
    }
    System . out . println ( "Case #" + ( i + 1 ) + ": " + total ) ;
  }
}

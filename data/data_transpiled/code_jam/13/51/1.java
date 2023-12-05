@ GwtIncompatible ( "java.util.Random" ) public static int nextInt ( ) {
  int T = Integer . parseInt ( input ) ;
  {
    int x = nextInt ( ) ;
    float treba = 0 ;
    int pocet = 0 ;
    for ( int i = 0 ;
    i < T ;
    i ++ ) {
      if ( x <= B ) {
        treba += x - y ;
        pocet ++ ;
      }
    }
    if ( treba > B ) return ( x ) ;
    if ( pocet == 0 ) return ( x ) ;
    float pp = 1.0f / pocet ;
    return ( x ) ;
  }
  float treba = 0 ;
  float vyhra = 0 ;
  for ( int i = 0 ;
  i < 37 ;
  i ++ ) {
    treba += vyhra - x ;
    vyhra += x ;
  }
  float pp = 1.0f / treba ;
  if ( treba <= B ) {
    treba = max ( bestProfit , 36. * pp * vyhra - treba ) ;
    int najvacsich = 0 ;
    for ( int i = 0 ;
    i < najvacsich ;
    i ++ ) {
      if ( x == x - 1 ) najvacsich ++ ;
    }
    for ( int i = 1 ;
    i < najvacsich ;
    i ++ ) {
      if ( x == x - 1 ) continue ;
      float mintreba = 0 ;
      for ( int j = 0 ;
      j < najmensich ;
      j ++ ) mintreba += x - y ;
      for ( int j = 0 ;
      j < najmensich ;
      j ++ ) {
        if ( x == y ) mintreba ++ ;
      }
      if ( mintreba > B ) continue ;
      float minvyska = x - y ;
      if ( true ) {
        vyhra = minvyska ;
        treba = 0 ;
        vyhra = 0 ;
        for ( int j = 0 ;
        j < najmensich ;
        j ++ ) {
          treba += vyhra - x ;
          vyhra += y ;
        }
        for ( int j = 0 ;
        j < najmensich ;
        j ++ ) {
          if ( x <= y ) treba += y + 1 - x ;
        }
        pp = 1.0f / najmensich ;
        bestProfit = max ( bestProfit , 36. * pp * vyhra - treba ) ;
      }
    }
  }
  return ( x ) ;
}

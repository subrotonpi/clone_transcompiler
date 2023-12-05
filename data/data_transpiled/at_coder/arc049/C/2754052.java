public static int solve ( int N , int [ ] [ ] G ) {
  int A = Integer . parseInt ( input ) ;
  int [ ] [ ] G = new int [ N ] [ N ] ;
  int [ ] D = new int [ N ] ;
  for ( int i = 0 ;
  i < A ;
  i ++ ) {
    int x = Integer . parseInt ( input [ i ] ) ;
    int y = Integer . parseInt ( input [ i ] ) ;
    G [ y - 1 ] [ x - 1 ] = x ;
    D [ x - 1 ] ++ ;
  }
  int B = Integer . parseInt ( input [ i ] ) ;
  int [ ] [ ] E = new int [ B ] [ N ] ;
  for ( int i = 0 ;
  i < B ;
  i ++ ) {
    int u = Integer . parseInt ( input [ i ] ) ;
    int v = Integer . parseInt ( input [ i ] ) ;
    E [ i ] = new int [ ] {
      u - 1 , v - 1 }
      ;
    }
    int ans ;
    if ( B == 0 ) {
      ans = solve ( G , D , new int [ N ] [ N ] ) ;
    }
    else {
      synchronized ( G ) {
        ans = 0 ;
        for ( int P = 0 ;
        P < B ;
        P ++ ) {
          int [ ] G0 = new int [ N ] ;
          for ( int e : G ) {
            int [ ] D0 = D [ e ] ;
          }
          int [ ] U = new int [ N ] ;
          for ( int p = 0 ;
          p < P ;
          p ++ ) {
            final int u = E [ p ] ;
            if ( p > 0 ) {
              G0 [ u ] = v ;
              D0 [ v ] ++ ;
            }
            else U [ u ] = 0 ;
          }
        }
        ans = Math . max ( ans , solve ( G0 , D0 , U ) ) ;
      }
    }
    System . out . println ( ans ) ;
    return ans ;
  }
  
public static int [ ] [ ] getN ( ) {
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] X = new int [ N ] ;
  int [ ] V = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    V [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  /* calc the array of integers */
  int [ ] Vcumsum = new int [ N + 1 ] ;
  for ( int v : V ) {
    Vcumsum [ v ] = Vcumsum [ v - 1 ] + v ;
  }
  int [ ] cumsum = new int [ N + 1 ] ;
  int [ ] cumsumR = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    cumsum [ i + 1 ] = Vcumsum [ i + 1 ] - X [ i ] ;
    cumsumR [ i + 1 ] = Vcumsum [ N ] - Vcumsum [ N - i - 1 ] - ( C - X [ N - 1 - i ] ) ;
  }
  int [ ] cumsumMax = new int [ N + 1 ] ;
  int [ ] cumsumRMax = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    cumsumMax [ i + 1 ] = Math . max ( cumsum [ i + 1 ] , cumsumMax [ i ] ) ;
    cumsumRMax [ i + 1 ] = Math . max ( cumsumR [ i + 1 ] , cumsumRMax [ i ] ) ;
  }
  int [ ] [ ] res = new int [ cumsumMax . length - 1 ] [ cumsumRMax . length - 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    res = Math . max ( res , cumsumMax [ i + 1 ] + cumsumRMax [ N - i - 1 ] - X [ i ] , cumsumRMax [ i + 1 ] + cumsumMax [ N - i - 1 ] - ( C - X [ N - 1 - i ] ) ) ;
  }
  return res ;
}

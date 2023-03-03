@ VisibleForTesting static BiFunction < Integer , Integer , Integer > biFunction ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < List < Integer >> RH = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) RH . add ( Collections . singletonList ( Integer . parseInt ( input ( ) ) ) ) ;
  int R = R , H = H ;
  @ SuppressWarnings ( "unchecked" ) int [ ] a = new int [ 4 ] ;
  for ( int i = 1 ;
  i < 4 ;
  i ++ ) a [ i ] = 0 ;
  for ( int i = 1 ;
  i < 4 ;
  i ++ ) a [ i ] = br ( H , rateL , rateR , i ) ;
  int [ ] gcp = new int [ 3 ] ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    gcp [ i ] = a [ i + 1 ] - a [ i ] ;
  }
  return gcp ;
}

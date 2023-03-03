static final int [ ] getBottom ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] w = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    w [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  List < Integer > bottom = new ArrayList < > ( ) ;
  bottom . add ( 0 ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( Math . max ( bottom . size ( ) , w [ i ] ) < 0 ) {
      bottom . add ( w [ i ] ) ;
    }
    else {
      List < Integer > tempBottom = new ArrayList < > ( bottom ) ;
      int judge = 0 ;
      while ( judge == 0 ) {
        if ( tempBottom . size ( ) < w [ i ] ) {
          tempBottom . remove ( Math . min ( tempBottom . size ( ) , w [ i ] ) ) ;
          judge ++ ;
        }
      }
      bottom . remove ( minmax ) ;
      bottom . add ( w [ i ] ) ;
    }
  }
  return bottom . toArray ( ) ;
}

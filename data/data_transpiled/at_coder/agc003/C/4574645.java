@ VisibleForTesting static void copyList ( ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] A = new int [ N ] ;
  for ( int n = 0 ;
  n < N ;
  n ++ ) {
    A [ n ] = Integer . parseInt ( input ) ;
  }
  List < Integer > Aorder = new ArrayList < > ( A ) ;
  Collections . sort ( Aorder ) ;
  Set < Integer > odd = new HashSet < > ( ) , even = new HashSet < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( i % 2 == 0 ) {
      even . add ( Aorder . get ( i ) ) ;
    }
    else {
      odd . add ( Aorder . get ( i ) ) ;
    }
  }
  missMatch = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( i % 2 == 0 ) {
      if ( odd . contains ( A [ i ] ) ) missMatch ++ ;
    }
    else {
      if ( even . contains ( A [ i ] ) ) missMatch ++ ;
    }
  }
  System . out . println ( missMatch / 2 ) ;
}

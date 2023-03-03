public static int f ( List < Interval > intervals ) {
  int [ ] timeUsed = new int [ 2 ] ;
  for ( int i = 0 ;
  i < intervals . size ( ) ;
  i ++ ) {
    timeUsed [ intervals . get ( i ) . _2 ] += intervals . get ( i ) . _2 - intervals . get ( i ) . _1 ;
  }
  int flips = 0 ;
  List < ConclusionPoint > conseq = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < intervals . size ( ) ;
  i ++ ) {
    if ( intervals . get ( i ) . _2 == intervals . get ( ( i + 1 ) % intervals . size ( ) ) . _2 ) {
      int gap = intervals . get ( ( i + 1 ) % intervals . size ( ) ) . _1 - intervals . get ( i ) . _2 ;
      if ( gap < 0 ) gap += 60 * 24 ;
      conseq . add ( new ConclusionPoint ( gap , intervals . get ( i ) . _2 ) ) ;
      flips += 2 ;
    }
    else {
      flips += 1 ;
    }
  }
  Collections . sort ( conseq ) ;
  for ( ConclusionPoint c : conseq ) {
    timeUsed [ c . _2 ] += c . _1 ;
    if ( timeUsed [ c . _2 ] <= 720 ) {
      flips -= 2 ;
    }
  }
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    intervals = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < a ;
    i ++ ) {
      intervals . add ( Lists . newArrayList ( ) ) ;
      intervals . get ( i ) . _2 = 0 ;
    }
    for ( int i = 0 ;
    i < b ;
    i ++ ) {
      intervals . add ( Lists . newArrayList ( ) ) ;
      intervals . get ( i ) . _2 = 1 ;
    }
    Collections . sort ( intervals ) ;
    int ans = f ( intervals ) ;
    System . out . println ( "Case #" + testCase + ": " + ans ) ;
  }
  return flips ;
}

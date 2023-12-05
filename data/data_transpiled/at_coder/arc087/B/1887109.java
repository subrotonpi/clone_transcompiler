public static void input ( Scanner in ) {
  int x = in . nextInt ( ) , y = in . nextInt ( ) ;
  String [ ] s2 = in . nextLine ( ) . split ( "T" ) ;
  List < Integer > dXs = Lists . newArrayList ( ) ;
  List < Integer > dYs = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < s2 . length ;
  i += 2 ) {
    dXs . add ( s2 [ i ] ) ;
    dYs . add ( s2 [ i + 1 ] ) ;
  }
  Set < Integer > memoX = new THashSet < Integer > ( dXs . get ( 0 ) ) ;
  for ( int i = 1 , dX = dXs . size ( ) ;
  i < dX ;
  i ++ ) {
    Set < Integer > memoX2 = Sets . newLinkedHashSet ( ) ;
    for ( int xNow : memoX ) {
      memoX2 . add ( xNow + dX ) ;
      memoX2 . add ( xNow - dX ) ;
    }
    memoX = memoX2 ;
  }
  Set < Integer > memoY = new THashSet < Integer > ( 0 ) ;
  for ( int i = 0 , dY = dYs . size ( ) ;
  i < dY ;
  i ++ ) {
    Set < Integer > memoY2 = Sets . newLinkedHashSet ( ) ;
    for ( int yNow : memoY ) {
      memoY2 . add ( yNow + dY ) ;
      memoY2 . add ( yNow - dY ) ;
    }
    memoY = memoY2 ;
  }
  if ( memoX . contains ( x ) && memoY . contains ( y ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}

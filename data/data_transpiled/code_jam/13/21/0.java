public static int ntest = Integer . parseInt ( scanner . nextLine ( ) ) {
  for ( int itc = 0 ;
  itc < ntest ;
  itc ++ ) {
    System . out . format ( "Case #%d:" , itc + 1 ) ;
    int myMote = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int n = scanner . nextInt ( ) ;
    ArrayList < Integer > motes = new ArrayList < Integer > ( ) ;
    for ( int index = 0 ;
    index < n ;
    index ++ ) {
      motes . add ( Integer . parseInt ( scanner . nextLine ( ) ) ) ;
    }
    if ( myMote == 1 ) {
      System . out . println ( n ) ;
      continue ;
    }
    int bestAnswer = n ;
    int myAnswer = 0 ;
    for ( int index = 0 ;
    index < n ;
    index ++ ) {
      int i = motes . get ( index ) ;
      if ( i < myMote ) {
        myMote += i ;
        continue ;
      }
      bestAnswer = Math . min ( bestAnswer , myAnswer + n - index ) ;
      while ( myMote <= i ) {
        myMote += myMote - 1 ;
        myAnswer ++ ;
      }
      myMote += i ;
    }
    bestAnswer = Math . min ( bestAnswer , myAnswer ) ;
    System . out . println ( bestAnswer ) ;
  }
  return bestAnswer ;
}

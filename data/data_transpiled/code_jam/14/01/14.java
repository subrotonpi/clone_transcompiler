public static void main ( String [ ] args ) {
  int t = Integer . parseInt ( readLine ( ) ) ;
  for ( int ti = 0 ;
  ti < t ;
  ti ++ ) {
    int ans1 = Integer . parseInt ( readLine ( ) ) ;
    List < Integer > l1 = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < 4 ;
    i ++ ) {
      l1 . add ( map ( readLine ( ) ) ) ;
    }
    List < Integer > l2 = new ArrayList < > ( ) ;
    int ans2 = Integer . parseInt ( readLine ( ) ) ;
    for ( int i = 0 ;
    i < 4 ;
    i ++ ) {
      l2 . add ( map ( readLine ( ) ) ) ;
    }
    Set < Integer > s = new HashSet < > ( l1 . get ( ans1 - 1 ) ) ;
    s . retainAll ( l2 . get ( ans2 - 1 ) ) ;
    if ( s . size ( ) == 1 ) {
      System . out . println ( "Case #" + ( ti + 1 ) + ": " + Collections . singleton ( s . get ( 0 ) ) ) ;
    }
    else if ( s . isEmpty ( ) ) {
      System . out . println ( "Case #" + ( ti + 1 ) + ": Volunteer cheated!" ) ;
    }
    else {
      System . out . println ( "Case #" + ( ti + 1 ) + ": Bad magician!" ) ;
    }
  }
  if ( getClass ( ) . equals ( Main . class ) ) {
    Main . main ( args ) ;
  }
}

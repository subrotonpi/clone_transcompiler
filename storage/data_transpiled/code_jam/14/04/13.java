public static void main ( String [ ] args ) {
  int t = Integer . parseInt ( readLine ( ) ) ;
  for ( int ti = 0 ;
  ti < t ;
  ti ++ ) {
    int n = Integer . parseInt ( readLine ( ) ) ;
    List < Double > l1 = map . get ( Double . parseDouble ( readLine ( ) ) ) ;
    List < Double > l2 = map . get ( Double . parseDouble ( readLine ( ) ) ) ;
    Collections . sort ( l1 ) ;
    Collections . sort ( l2 ) ;
    List < Double > l3 = l2 . stream ( ) . collect ( toList ( ) ) ;
    List < Double > l4 = l1 . stream ( ) . collect ( toList ( ) ) ;
    int y = 0 ;
    for ( int li : l1 ) {
      if ( li < l3 . get ( 0 ) ) {
        l3 . remove ( l3 . size ( ) - 1 ) ;
      }
      else {
        l3 . remove ( 0 ) ;
        y ++ ;
      }
    }
    for ( int li : l2 ) {
      if ( li > l4 . get ( 0 ) ) {
        l4 . remove ( 0 ) ;
      }
    }
    int z = l4 . size ( ) ;
    System . out . println ( "Case #" + ( ti + 1 ) + ": " + y + " " + z ) ;
  }
  if ( getClass ( ) . equals ( Main . class ) ) {
    Main . main ( ) ;
  }
}

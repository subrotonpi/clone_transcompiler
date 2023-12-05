@ Util public static void main ( String [ ] args ) {
  Reader r = reader ( "input" ) ;
  int num = Integer . parseInt ( r . readLine ( ) ) ;
  List < String > ans = new ArrayList < String > ( ) ;
  for ( int i : xrange ( num ) ) {
    int g1 = Integer . parseInt ( r . readLine ( ) ) ;
    List < String > row1 = new ArrayList < String > ( ) ;
    for ( int j : xrange ( 4 ) ) {
      if ( j == g1 - 1 ) row1 = CollectionUtils . toArrayList ( r . readLine ( ) . split ( "\\s+" ) ) ;
      else r . readLine ( ) ;
    }
    int g2 = Integer . parseInt ( r . readLine ( ) ) ;
    List < String > row2 = new ArrayList < String > ( ) ;
    for ( int j : xrange ( 4 ) ) {
      if ( j == g2 - 1 ) row2 = CollectionUtils . toArrayList ( r . readLine ( ) . split ( "\\s+" ) ) ;
      else r . readLine ( ) ;
    }
    List < String > intersection = new ArrayList < String > ( row1 ) ;
    if ( row2 . contains ( row1 ) ) intersection . add ( row2 . get ( 0 ) ) ;
    if ( intersection . size ( ) == 0 ) ans . add ( "Volunteer cheated!" ) ;
    else if ( intersection . size ( ) == 1 ) ans . add ( intersection . get ( 0 ) ) ;
    else ans . add ( "Bad magician!" ) ;
  }
  write ( "output" , ans ) ;
  if ( __name__ . equals ( "main" ) ) {
    main ( ) ;
  }
}

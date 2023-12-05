static final String getStdIn ( ) {
  final Supplier < String > ns = ( ) -> System . in . nextLine ( ) . replaceAll ( " " , "" ) ;
  final Supplier < Integer > ni = ( ) -> Integer . parseInt ( ns . get ( ) ) ;
  final Supplier < String > nm = ( ) -> map ( Integer :: parseInt , System . in ) ;
  final Supplier < List < String >> nl = ( ) -> Collections . singletonList ( nm . get ( ) ) ;
  final Supplier < String > nsl = ( ) -> map ( String :: valueOf , System . in ) ;
  final int n = ni . get ( ) ;
  final String [ ] a = nl . get ( ) ;
  int p1 = 0 ;
  int p2 = 0 ;
  int p3 = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] % 2 == 0 ) {
      if ( a [ i ] % 4 == 0 ) {
        p3 ++ ;
      }
      else {
        p2 ++ ;
      }
    }
    else {
      p1 ++ ;
    }
  }
  if ( p1 <= p3 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    if ( p1 == p3 + 1 && p2 == 0 ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
}

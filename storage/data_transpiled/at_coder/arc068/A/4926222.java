static final String getExample ( ) {
  final Supplier < String > ns = ( ) -> System . in . nextLine ( ) . replaceAll ( "\\s+" , " " ) ;
  final Supplier < Integer > ni = ( ) -> Integer . parseInt ( ns . get ( ) ) ;
  final Supplier < String > nm = ( ) -> map ( Integer :: parseInt , String :: valueOf ) ;
  final Supplier < List < String >> nl = ( ) -> Collections . singletonList ( nm . get ( ) ) ;
  final Supplier < String > nsl = ( ) -> map ( String :: valueOf , String :: valueOf ) ;
  final int x = ni . get ( ) ;
  if ( x % 11 == 0 ) {
    System . out . println ( x / 11 * 2 ) ;
  }
  else {
    if ( x % 11 <= 6 ) {
      System . out . println ( x / 11 * 2 + 1 ) ;
    }
    else {
      System . out . println ( x / 11 * 2 + 2 ) ;
    }
  }
}

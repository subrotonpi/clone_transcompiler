@ Parameters public static Collection < Object [ ] > input ( ) {
  List < Object [ ] > x = newArrayList ( ) ;
  for ( String s : input . nextLine ( ) . split ( " " ) ) {
    if ( x . stream ( ) . noneMatch ( x :: contains ) && x . stream ( ) . noneMatch ( x :: contains ) && x . stream ( ) . noneMatch ( x :: contains ) ) {
      System . out . println ( "YES" ) ;
    }
    else {
      System . out . println ( "NO" ) ;
    }
  }
  return x ;
}

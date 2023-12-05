public static List < Integer > convert ( String input ) {
  List < Integer > a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    if ( a . stream ( ) . anyMatch ( a :: contains ) ) {
      System . out . println ( a . get ( i ) ) ;
    }
  }
  return a ;
}

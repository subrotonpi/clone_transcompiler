public static List < Integer > convert ( String input ) {
  List < Integer > a = Lists . newArrayList ( ) ;
  for ( String s : input . split ( " " ) ) {
    if ( a . get ( 0 ) == a . get ( 1 ) ) {
      System . out . println ( a . get ( 2 ) ) ;
    }
    else if ( a . get ( 1 ) == a . get ( 2 ) ) {
      System . out . println ( a . get ( 0 ) ) ;
    }
    else {
      System . out . println ( a . get ( 1 ) ) ;
    }
  }
  return a ;
}

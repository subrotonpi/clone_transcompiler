public static List < Integer > convert ( String input ) {
  List < Integer > l = Lists . newArrayList ( ) ;
  for ( String s : input . split ( " " ) ) {
    if ( s . equals ( l . get ( 0 ) ) ) {
      System . out . println ( l . get ( 2 ) ) ;
    }
    else if ( s . equals ( l . get ( 0 ) ) ) {
      System . out . println ( l . get ( 1 ) ) ;
    }
    else {
      System . out . println ( l . get ( 0 ) ) ;
    }
  }
  return l ;
}

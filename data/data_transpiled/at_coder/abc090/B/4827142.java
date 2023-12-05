public static int [ ] getA ( ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > lists = Lists . newArrayList ( A , B + 1 ) ;
  List < String > strLists = Lists . newArrayList ( String . valueOf ( lists . get ( 0 ) ) ) ;
  List < Integer > kaibunLists = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < lists . size ( ) ;
  i ++ ) {
    for ( int j = 0 ;
    j < lists . get ( i ) ;
    j ++ ) {
      String kaibun = lists . get ( j ) . toString ( ) ;
      if ( lists . get ( i ) == Integer . parseInt ( kaibun ) ) {
      }
    }
  }
  return kaibunLists . toArray ( ) ;
}

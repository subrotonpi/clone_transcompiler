public static void i ( Scanner i ) throws IOException {
  int testCases = Integer . parseInt ( i . nextLine ( ) ) ;
  for ( int t = 1 ;
  t <= testCases ;
  t ++ ) {
    int v = Integer . parseInt ( i . nextLine ( ) ) ;
    int [ ] va = new int [ v ] ;
    int [ ] vb = new int [ v ] ;
    for ( int z = 0 ;
    z < v ;
    z ++ ) va [ z ] = Integer . parseInt ( i . nextLine ( ) ) ;
    for ( int z = 0 ;
    z < v ;
    z ++ ) vb [ z ] = Integer . parseInt ( i . nextLine ( ) ) ;
    Arrays . sort ( va ) ;
    Arrays . sort ( vb , Integer . reverseOrder ( ) ) ;
    int r = 0 ;
    for ( int p = 0 ;
    p < va . length ;
    p ++ ) r += va [ p ] * vb [ p ] ;
    System . out . println ( "Case #" + t + ": " + r ) ;
  }
}

public static int H = Integer . parseInt ( input ) {
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] ORG = new int [ H ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    ORG [ i ] = input . nextLine ( ) ;
  }
  String EDGE = "#" ;
  System . out . println ( EDGE ) ;
  return EDGE . length ( ) ;
}

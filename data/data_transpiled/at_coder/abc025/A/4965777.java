public static void input ( Scanner s ) {
  int n = Integer . parseInt ( s . nextLine ( ) ) ;
  int [ ] arr = new int [ n ] ;
  for ( int i = 0 ;
  i < 5 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 5 ;
    j ++ ) {
      arr [ i ] = s . nextInt ( ) + s . nextInt ( ) ;
    }
  }
  Arrays . sort ( arr ) ;
  System . out . println ( arr [ n - 1 ] ) ;
}

private static void input ( Scanner in ) {
  int n = in . nextInt ( ) , m = in . nextInt ( ) ;
  int [ ] boxs = new int [ n ] ;
  int [ ] TF = new int [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = in . nextInt ( ) , b = in . nextInt ( ) ;
    if ( boxs [ a - 1 ] == 0 ) {
      continue ;
    }
    else {
      boxs [ a - 1 ] -- ;
    }
  }
  System . out . println ( Arrays . toString ( TF ) ) ;
}

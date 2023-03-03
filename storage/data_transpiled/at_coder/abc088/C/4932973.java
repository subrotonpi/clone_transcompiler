public static int [ ] [ ] C1 = list ( map ( input ) ) ;
int [ ] [ ] C2 = list ( map ( input ) ) ;
int [ ] [ ] C3 = list ( map ( input ) ) ;
int [ ] [ ] C = {
  C1 , C2 , C3 }
  ;
  int [ ] A = new int [ 3 ] ;
  int [ ] B = new int [ 3 ] ;
  B = C1 ;
  A [ 1 ] = C2 [ 0 ] - B [ 0 ] ;
  A [ 2 ] = C3 [ 0 ] - B [ 0 ] ;
  boolean flg = true ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    int a = A [ i ] ;
    for ( int j = 0 ;
    j < B . length ;
    j ++ ) {
      int b = B [ j ] ;
      if ( C [ i ] [ j ] != a + b ) {
        flg = false ;
      }
    }
  }
  if ( flg == true ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return C ;
}

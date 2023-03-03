public static int [ ] [ ] readInput ( ) {
  int a = Integer . parseInt ( readLine ( ) ) ;
  int b = Integer . parseInt ( readLine ( ) ) ;
  int c = Integer . parseInt ( readLine ( ) ) ;
  int [ ] ar = new int [ a ] ;
  for ( int i = 0 ;
  i < b ;
  i ++ ) ar [ i ] = Integer . parseInt ( readLine ( ) ) ;
  int [ ] [ ] br = new int [ b ] [ a ] ;
  for ( int i = 0 ;
  i < a ;
  i ++ ) br [ i ] [ 0 ] = 0 ;
  String go = "M" ;
  int ap = 1 ;
  for ( int i = 0 ;
  i < a ;
  i ++ ) {
    if ( go . equals ( "M" ) ) {
      for ( int j = 0 ;
      j < b ;
      j ++ ) {
        if ( ar [ 0 ] == 0 ) {
          System . arraycopy ( ar , 0 , br [ 0 ] , ap ++ , b ) ;
        }
        br [ i ] [ j ] = ap ;
        ar [ 0 ] -- ;
      }
      go = "U" ;
    }
    else {
      for ( int j = b - 1 ;
      j >= 0 ;
      j -- ) {
        if ( ar [ 0 ] == 0 ) {
          System . arraycopy ( ar , 0 , br [ 0 ] , ap ++ , b ) ;
        }
        br [ i ] [ j ] = ap ;
        ar [ 0 ] -- ;
      }
      go = "M" ;
    }
  }
  for ( int [ ] [ ] r : br ) {
    for ( int i = 0 ;
    i < b - 1 ;
    i ++ ) System . out . print ( r [ i ] + " " ) ;
    System . out . println ( r [ b - 1 ] ) ;
  }
  return br ;
}

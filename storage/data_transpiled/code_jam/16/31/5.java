@ Sys public static String solve ( ) {
  String [ ] [ ] P = new String [ N ] [ N ] ;
  Arrays . sort ( P ) ;
  Arrays . reverse ( P ) ;
  for ( int i = 0 ;
  i < P [ 0 ] [ 0 ] ;
  i ++ ) {
    for ( int j = 0 ;
    j < P . length ;
    j ++ ) {
      if ( P [ j ] [ 0 ] == 0 ) {
        System . arraycopy ( P , 0 , P [ j ] , 0 , P [ j ] . length ) ;
        break ;
      }
      P [ j ] [ 0 ] -- ;
      ret [ j ] [ 1 ] = P [ j ] [ 1 ] ;
      pass ( ) ;
    }
    pass ( ) ;
  }
  String ret2 = new String ( ) ;
  int lenret = ret . length ( ) ;
  if ( lenret % 2 == 1 ) {
    ret2 += ret [ ret . length ( ) - 1 ] + " " ;
    lenret -- ;
  }
  for ( int i = 0 ;
  i < lenret / 2 ;
  i ++ ) {
    ret2 += ret [ lenret - 2 * i - 1 ] + ret [ lenret - 2 * i - 2 ] + " " ;
    pass ( ) ;
  }
  return ret2 . substring ( 0 , ret2 . length ( ) - 1 ) ;
}

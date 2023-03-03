public static void print ( int N , int M ) {
  int [ ] x = new int [ M ] ;
  int [ ] y = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    x [ i ] = 0 ;
    y [ i ] = 0 ;
  }
  for ( int k = 0 ;
  k < M ;
  k ++ ) {
    x [ k ] = map . get ( x [ k ] ) ;
    y [ k ] = map . get ( y [ k ] ) ;
    x [ k ] -- ;
    y [ k ] -- ;
  }
  int [ ] ball = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) ball [ x [ i ] ] -- ;
  int [ ] red = new int [ N ] ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) red [ y [ j ] ] = 0 ;
  System . out . println ( Arrays . toString ( red ) ) ;
}

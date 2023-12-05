static int [ ] C = new int [ 3 ] ;
int [ ] [ ] C1 = new int [ 2 ] [ 3 ] ;
int [ ] [ ] C2 = new int [ 2 ] [ 3 ] ;
boolean flg = false ;
for ( int i = 0 ;
i < 3 ;
i ++ ) {
  C [ i ] = new int [ 3 ] ;
  for ( int j = 0 ;
  j < 2 ;
  j ++ ) {
    if ( ( C [ i ] [ j ] - C [ i ] [ j + 1 ] ) != C [ i + 1 ] [ j ] - C [ i + 1 ] [ j + 1 ] ) {
      flg = true ;
    }
  }
}

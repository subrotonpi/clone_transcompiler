static final String [ ] [ ] A = new String [ 10 ] [ 10 ] ;
for ( int i = 0 ;
i < 10 ;
i ++ ) {
  for ( int j = 0 ;
  j < 10 ;
  j ++ ) {
    A [ i ] [ j ] = i ;
  }
}
char [ ] [ ] Acp = new char [ A . length ] [ 10 ] ;
int [ ] dx = {
  1 , 0 , - 1 , 0 }
  ;
  int [ ] dy = {
    0 , 1 , 0 , - 1 }
    ;
    /* search for x and y */
    Acp [ 0 ] [ 0 ] = "x" ;
    for ( int p = 0 ;
    p < 4 ;
    p ++ ) {
      int nx = x + dx [ p ] ;
      int ny = y + dy [ p ] ;
      if ( 0 <= nx && nx < 10 && ny < 10 && Acp [ nx ] [ ny ] == "o" ) {
        /* check */
      }
    }
    return A ;
  }
  
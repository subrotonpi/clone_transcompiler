static final String [ ] [ ] field = new String [ 10 ] [ 10 ] ;
for ( int p = 0 ;
p < 10 ;
p ++ ) {
  field [ p ] [ 0 ] = String . valueOf ( input . next ( ) ) ;
}
char [ ] [ ] temp = new char [ 4 ] [ 4 ] ;
Arrays . fill ( temp , 'x' ) ;
Arrays . fill ( temp , 'y' ) ;
Arrays . fill ( temp , 'y' ) ;
/* temp[x][y] = "x" */
for ( int p = 0 ;
p < 4 ;
p ++ ) {
  int nx = x + dx [ p ] ;
  int ny = y + dy [ p ] ;
  if ( 0 <= nx && nx < 10 && 0 <= ny && ny < 10 && temp [ nx ] [ ny ] == 'o' ) {
    /* check */
  }
}
return field ;
}

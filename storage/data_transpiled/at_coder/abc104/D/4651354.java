{
  a [ 1 ] = 1 + 1 ;
}
int m = 10 * 9 + 7 ;
for ( String s : input . split ( ) ) {
  int i = ( s . length ( ) - 64 ) ;
  if ( i > 0 ) a [ i ] += a [ i - 1 ] ;
  else a [ i ] = 0 ;
}

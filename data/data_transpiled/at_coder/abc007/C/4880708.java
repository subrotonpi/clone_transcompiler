[ r ] , c [ ] ;
int [ ] sy = new int [ r ] ;
int [ ] sx = new int [ r ] ;
int [ ] gy = new int [ r ] ;
int [ ] gx = new int [ r ] ;
c = new String [ r ] ;
String s = "" ;
for ( int i = 0 ;
i < r ;
i ++ ) {
  s = input . nextLine ( ) ;
  c [ i ] = new String [ s . length ( ) ] ;
  for ( int j = 0 ;
  j < s . length ( ) ;
  j ++ ) c [ i ] [ j ] = s . charAt ( j ) ;
}
int [ ] [ ] done = new int [ r ] [ ] ;
int [ ] [ ] next = new int [ r ] [ ] ;
int [ ] next1 = new int [ r ] ;
int x = sx ;
int y = sy ;
int counter = 1 ;
while ( ! done [ gy ] [ gx ] ) {
  for ( int i = 0 ;
  i < next . length ;
  i ++ ) {
    y = next [ i ] [ 0 ] ;
    x = next [ i ] [ 1 ] ;
    if ( ! done [ y ] [ x + 1 ] && c [ y ] [ x + 1 ] == "." ) {
      done [ y ] [ x + 1 ] = "." ;
      next1 [ y ] [ x + 1 ] = "." ;
      c [ y ] [ x + 1 ] = Integer . toString ( counter ) ;
    }
    if ( ! done [ y ] [ x - 1 ] && c [ y ] [ x - 1 ] == "." ) {
      done [ y ] [ x - 1 ] = "." ;
      next1 [ y ] [ x - 1 ] = "." ;
      c [ y ] [ x - 1 ] = Integer . toString ( counter ) ;
    }
    if ( ! done [ y ] [ x ] && c [ y + 1 ] [ x ] == "." ) {
      done [ y ] [ x - 1 ] = "." ;
      next1 [ y ] [ x ] = "." ;
      c [ y + 1 ] [ x ] = Integer . toString ( counter ) ;
    }
    if ( ! done [ y ] [ x ] && c [ y - 1 ] [ x ] == "." ) {
      done [ y ] [ x - 1 ] = "." ;
      next1 [ y ]
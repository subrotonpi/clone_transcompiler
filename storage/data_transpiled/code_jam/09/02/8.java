static final String print = "Case #" + Integer . toString ( number ) ;
class Square {
  int height = - 1 ;
  boolean sink = true ;
  List < Square > links = new ArrayList < Square > ( ) ;
  label = null ;
  parent = null ;
}
public String toString ( ) {
  return Integer . toString ( height ) ;
}
public void labelAll ( Square cur , String label ) {
  cur . label = label ;
  for ( Square square : cur . links ) labelAll ( square , label ) ;
}
public Square findTop ( Square cur ) {
  if ( cur . parent == null ) {
    return cur ;
  }
  else {
    return findTop ( cur . parent ) ;
  }
}
int cases = Integer . parseInt ( System . in ) ;
for ( int case = xrange ( 1 , cases + 1 ) ;
case <= xrange ( cases ) ;
case ++ ) {
  int [ ] dim = new int [ 2 ] ;
  for ( int num = 0 ;
  num < dim [ 0 ] ;
  num ++ ) dim [ num ] = Integer . parseInt ( System . in ) ;
  Square [ ] [ ] map = new Square [ xrange ( dim [ 1 ] ) ] [ dim [ 0 ] ] ;
  for ( int i = 0 ;
  i < range ( xrange ( dim [ 0 ] ) ) ;
  i ++ ) {
    String [ ] line = System . in . readLine ( ) . split ( " " ) ;
    for ( int j = 0 ;
    j < range ( xrange ( dim [ 1 ] ) ) ;
    j ++ ) map [ i ] [ j ] . height = Integer . parseInt ( line [ j ] ) ;
  }
}
for ( int i = xrange ( dim [ 0 ] ) ;
i < xrange ( range ( 0 , 0 ) ) ;
i ++ ) {
  for ( int j = 0 ;
  j < range ( range ( 1 , 0 ) ) ;
  j ++ ) {
    Point [ ] dirs = {
      new Point ( 0 , - 1 ) , new Point ( - 1 , 0 ) , new Point ( 1 , 0 ) , new Point ( 0 , 1 ) }
      ;
      Square drain = null ;
      for ( Point dir : dirs ) {
        int r = i + dir . y ;
        int c = j + dir . x ;
        if ( r < 0 || c < 0 || r >= dim [ 0 ] || c >= dim [ 1 ] ) continue ;
        if ( map [ r ] [ c ] . height < map [ i ] [ j ] . height && ( drain == null
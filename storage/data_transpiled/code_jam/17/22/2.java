input ;
t = input . nextInt ( ) ;
{
  if ( a < b ) return fuck ( B , b , A , a , C , c ) ;
  if ( b < c ) return fuck ( A , a , C , c , B , b ) ;
  int d = b + c - a ;
  assert d >= 0 ;
  b -= d ;
  c -= d ;
  return ( A + B ) * b + ( A + B + C ) * d + ( A + C ) * c ;
}
{
  if ( o == b && o + b == n ) return "OB" ;
  if ( g == r && g + r == n ) return "GR" ;
  if ( v == y && v + y == n ) return "VY" ;
  if ( o > 0 && o >= b || g > 0 && g >= r || v > 0 && v >= y ) return "IMPOSSIBLE" ;
  b -= o ;
  r -= g ;
  y -= v ;
  int s = b + r + y ;
  if ( 2 * b > s || 2 * r > s || 2 * y > s ) return "IMPOSSIBLE" ;
  String z = fuck ( "B" , b , "R" , r , "Y" , y ) ;
  for ( int i = 0 ;
  i < z . length ( ) ;
  ++ i ) {
    if ( z . charAt ( i ) == 'B' ) {
      z = z . substring ( 0 , i ) + "BO" + z . substring ( i ) ;
      break ;
    }
  }
  for ( int i = 0 ;
  i < z . length ( ) ;
  ++ i ) {
    if ( z . charAt ( i ) == 'R' ) {
      z = z . substring ( 0 , i ) + "RG" + z . substring ( i ) ;
      break ;
    }
  }
  for ( int i = 0 ;
  i < z . length ( ) ;
  ++ i ) {
    if ( z . charAt ( i ) == 'Y' ) {
      z = z . substring ( 0 , i ) + "YV" + z . substring ( i ) ;
      break ;
    }
  }
  return z ;
}

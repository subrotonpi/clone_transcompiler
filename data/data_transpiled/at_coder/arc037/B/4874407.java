;
g = new int [ n ] ;
states = new int [ n ] ;
{
  if ( states [ b ] == 2 ) return false ;
  if ( states [ b ] == 1 ) return true ;
  states [ b ] = 1 ;
  boolean res = false ;
  for ( int i = 0 ;
  i < g [ b ] . length ;
  i ++ ) {
    if ( g [ b ] [ i ] != a ) res = i == 0 || res ;
  }
  states [ b ] = 2 ;
  return res ;
}

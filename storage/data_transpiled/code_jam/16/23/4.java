private static boolean DFS ( int [ ] [ ] G , int [ ] U , boolean [ ] V , int x ) {
  V [ x ] = true ;
  for ( int y = 0 ;
  y < G [ x ] . length ;
  y ++ ) {
    if ( U [ y ] == - 1 || ( ! V [ U [ y ] ] && DFS ( G , U , V , U [ y ] ) ) ) {
      U [ y ] = x ;
      return true ;
    }
  }
  return false ;
}

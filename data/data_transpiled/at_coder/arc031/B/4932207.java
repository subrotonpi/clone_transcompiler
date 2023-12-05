[ ] M = new M [ 10 ] ;
for ( int i = 0 ;
i < 10 ;
i ++ ) {
  M [ i ] = new LinkedList < String > ( ) ;
}
{
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) {
    int dx = ( i < 10 ) ? - 1 : 0 ;
    int dy = ( i < 10 ) ? 1 : 0 ;
    if ( 0 <= x + dx && x + dx < 10 && 0 <= y + dy && y + dy < 10 ) {
      if ( m [ y + dy ] . charAt ( x + dx ) == 'o' ) {
        m [ y + dy ] . set ( x + dx , 'x' ) ;
        dfs ( m , x + dx , y + dy ) ;
      }
    }
  }
}
{
  boolean island ( M [ ] , x , y ) ;
  return Arrays . equals ( M , x ) ;
}
public static boolean solve ( ) {
  for ( int y = 0 ;
  y < 10 ;
  y ++ ) {
    for ( int x = 0 ;
    x < 10 ;
    x ++ ) {
      if ( M [ y ] [ x ] == 'x' ) {
        List < String > M2 = new ArrayList < String > ( ) ;
        for ( String l : M ) {
          if ( island ( M2 , x , y ) ) return true ;
        }
      }
    }
  }
  return false ;
}
}

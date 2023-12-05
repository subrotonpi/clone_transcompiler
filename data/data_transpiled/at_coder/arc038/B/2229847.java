public static int inIn ( ) {
  return Integer . parseInt ( input . nextLine ( ) ) ;
}
{
  int [ ] [ ] s = new int [ input . length ] [ ] ;
  boolean [ ] d = new boolean [ input . length ] ;
  boolean [ ] [ ] r = new boolean [ input . length ] [ ] ;
  {
    int i ;
    int j ;
    int h = input . length ;
    int w = input . length ;
    for ( i = 0 ;
    i < h ;
    i ++ ) {
      d [ i ] [ j ] = true ;
      if ( s [ i ] [ j ] == '#' ) {
        r [ i ] [ j ] = true ;
        return r [ i ] [ j ] ;
      }
    }
    if ( ! dfs ( i , j + 1 ) ) {
      r [ i ] [ j ] = true ;
      return r [ i ] [ j ] ;
    }
    if ( ! dfs ( i + 1 , j ) ) {
      r [ i ] [ j ] = true ;
      return r [ i ] [ j ] ;
    }
    r [ i ] [ j ] = false ;
    return r [ i ] [ j ] ;
  }
}

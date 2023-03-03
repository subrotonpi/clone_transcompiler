@ Nonnull public static String get ( ) {
  int k = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
  int n = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
  int [ ] keys = new int [ n ] ;
  int [ ] connects = new int [ n ] ;
  for ( int x : xrange ( n ) ) connects [ x ] = map . get ( k ) ;
  boolean [ ] save = new boolean [ 1 << n ] ;
  for ( int x : xrange ( n ) ) save [ x ] = null ;
  /* dfs */
  int now = connects [ now ] . intValue ( ) ;
  if ( keys [ t ] <= 0 ) return false ;
  m |= 1 << now ;
  if ( save [ m ] != null ) return save [ m ] ;
  order . add ( now + 1 ) ;
  keys [ t ] -- ;
  visited [ now ] = true ;
  for ( int x : connects [ now ] . subList ( 2 , connects . length ) ) keys [ x ] ++ ;
  if ( Arrays . equals ( visited [ now ] , save [ m ] ) ) {
    save [ m ] = true ;
    return true ;
  }
  for ( int x : xrange ( n ) ) if ( ! visited [ x ] && dfs ( x , m ) ) save [ m ] = true ;
  keys [ t ] ++ ;
  visited [ now ] = false ;
  order . remove ( ) ;
  for ( int x : connects [ now ] . subList ( 2 , connects . length ) ) keys [ x ] -- ;
  save [ m ] = false ;
  return false ;
}

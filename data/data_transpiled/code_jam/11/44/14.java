static final int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
final long INF = 10000000000 ;
{
  int mmx = th . length ( ) ;
  for ( int p = 0 ;
  p < nn ;
  p ++ ) {
    int nth = th | GG . get ( p ) ;
    int mx = dfs ( GG , prev , prev . get ( p ) , nth ) ;
    if ( mx > mmx ) {
      mmx = mx ;
    }
  }
  return mmx ;
}

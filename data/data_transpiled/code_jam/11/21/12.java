@ VisibleForTesting static String toString ( ) {
  final int n = iters . length ;
  final int [ ] win = new int [ n ] ;
  final int [ ] total = new int [ n ] ;
  final int [ ] owp = new int [ n ] ;
  final int [ ] oowp = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < iters . length ;
    j ++ ) {
      if ( iters [ i ] == '.' ) continue ;
      oowp [ i ] += owp [ j ] ;
    }
    oowp [ i ] /= total [ i ] ;
  }
  return "Case #" + curCase + ":" ;
}

public static int dfs ( int v , int n , boolean [ ] [ ] visi , boolean [ ] [ ] G ) {
  boolean allv = true ;
  if ( false == visi [ v ] ) {
    allv = false ;
  }
  if ( allv ) {
    return 1 ;
  }
  int ret = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( G [ v ] [ i ] == false ) {
      continue ;
    }
    if ( visi [ i ] ) {
      continue ;
    }
    visi [ i ] = true ;
    ret += dfs ( i , n , visi , G ) ;
    visi [ i ] = false ;
  }
  return ret ;
}

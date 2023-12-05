static final int [ ] [ ] G ( int v ) {
  System . setSecurityManager ( new SecurityManager ( ) {
    public void checkExit ( int answer ) {
      int ans = 0 ;
    }
  }
  ) ;
  {
    boolean allv = true ;
    for ( int i = 0 ;
    i < visi . length ;
    i ++ ) {
      if ( ! visi [ i ] ) allv = false ;
    }
    if ( allv ) return 1 ;
    int ret = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( G [ v ] [ i ] == false ) continue ;
      if ( visi [ i ] ) continue ;
      visi [ i ] = true ;
      ret += dfs ( i , n , visi ) ;
      visi [ i ] = false ;
    }
  }
}

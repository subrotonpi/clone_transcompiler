@ VisibleForTesting static void solve ( ) {
  int n = ( Integer ) input . nextInt ( ) ;
  int m = ( Integer ) input . nextInt ( ) ;
  int [ ] [ ] distance = new int [ n ] [ n ] ;
  int [ ] [ ] L = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) distance [ i ] [ i ] = 0 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int u = ( Integer ) input . nextInt ( ) ;
    int v = ( Integer ) input . nextInt ( ) ;
    int l = ( Integer ) input . nextInt ( ) ;
    if ( u == 1 ) L [ i ] [ v ] = l ;
    else L [ i ] [ v ] = l ;
  }
}

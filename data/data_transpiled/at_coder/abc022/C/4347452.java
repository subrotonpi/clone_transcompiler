@ VisibleForTesting static Iterable < Pair < Integer , Integer >> combinations ( ) {
  double ans = Double . POSITIVE_INFINITY ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] [ ] glaph = new double [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    glaph [ i ] [ i ] = Double . POSITIVE_INFINITY ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    glaph [ i ] [ i ] = 0 ;
  }
  ArrayList < Pair < Integer , Integer >> s = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int u = Integer . parseInt ( input . nextLine ( ) ) ;
    int v = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( u == 1 ) {
      s . add ( new Pair < > ( v - 1 , l ) ) ;
    }
    else {
      s . add ( l ) ;
    }
  }
  return s ;
}

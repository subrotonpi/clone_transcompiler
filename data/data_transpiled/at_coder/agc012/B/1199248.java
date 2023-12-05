@ VisibleForTesting static void paint ( int v , int d , int c ) {
  if ( color [ v ] == 0 ) {
    color [ v ] = c ;
  }
  if ( dp [ v ] >= d || d == 0 ) {
    return ;
  }
  dp [ v ] = d ;
  for ( int nb : graph [ v ] ) {
    paint ( nb , d - 1 , c ) ;
  }
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  dp = new int [ N ] ;
  color = new int [ N ] ;
  graph = new HashSet < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int i = Integer . parseInt ( input . nextLine ( ) ) ;
    int j = Integer . parseInt ( input . nextLine ( ) ) ;
    graph [ i - 1 ] . add ( j - 1 ) ;
    graph [ j - 1 ] . add ( i - 1 ) ;
  }
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  vdcs = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int v = Integer . parseInt ( input . nextLine ( ) ) ;
    int d = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    vdcs . add ( new Integer ( v - 1 ) ) ;
  }
  Collections . reverse ( vdcs ) ;
  for ( int i = 0 ;
  i < vdcs . size ( ) ;
  i ++ ) {
    paint ( vdcs . get ( i ) , d , c ) ;
  }
  for ( int i = 0 ;
  i < color . size ( ) ;
  i ++ ) {
    System . out . println ( color . get ( i ) ) ;
  }
}

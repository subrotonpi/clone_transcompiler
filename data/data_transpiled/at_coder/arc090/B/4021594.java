public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int [ ] [ ] edge = new int [ N + 1 ] [ M + 1 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int l = Integer . parseInt ( input ) ;
    int r = Integer . parseInt ( input ) ;
    int d = Integer . parseInt ( input ) ;
    edge [ l ] [ r ] = d ;
    edge [ r ] [ l ] = - d ;
  }
  int [ ] G = new int [ N + 1 ] ;
  boolean ok = true ;
  Stack < Integer > stack = new Stack < Integer > ( ) ;
  for ( int x = 1 ;
  x <= N ;
  x ++ ) {
    if ( G [ x ] != null ) continue ;
    G [ x ] = G [ x ] + x ;
    stack . push ( x ) ;
  }
  while ( stack . size ( ) > 0 ) {
    int v = stack . pop ( ) ;
    for ( int to : edge [ v ] ) {
      int d = edge [ to ] ;
      if ( G [ to ] == null ) {
        G [ to ] = G [ v ] + d ;
        stack . push ( to ) ;
      }
      else {
        if ( G [ to ] != G [ v ] + d ) {
          ok = false ;
          break ;
        }
      }
    }
  }
  System . out . println ( ok ? "Yes" : "No" ) ;
}

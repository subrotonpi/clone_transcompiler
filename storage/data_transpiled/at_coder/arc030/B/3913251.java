public static int N = Integer . parseInt ( input ) {
  int * H = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] G = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    G [ a - 1 ] [ b ] = b - 1 ;
    G [ b - 1 ] [ a ] = a - 1 ;
  }
  int [ ] used = new int [ N ] ;
  {
    int r = H [ v ] ;
    for ( int w : G [ v ] ) {
      if ( w == p ) continue ;
      r |= dfs ( w , v , d + 1 ) ;
    }
    used [ v ] = r ;
  }
  {
    int res = 0 ;
    for ( int v = 0 ;
    v < N ;
    v ++ ) {
      if ( used [ v ] ) {
        if ( v != X - 1 ) res += 2 ;
      }
    }
    System . out . println ( res ) ;
  }
  return 0 ;
}

public static void main ( String [ ] args ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] v = new int [ n ] ;
  int [ ] [ ] g = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    a -- ;
    b -- ;
    v [ a ] ++ ;
    v [ b ] ++ ;
    g [ a ] [ b ] = b ;
    g [ b ] [ a ] = a ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( v [ i ] % 2 == 1 ) {
      System . out . println ( "No" ) ;
      exit ( ) ;
    }
  }
  int v4 = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( v [ i ] >= 6 ) {
      System . out . println ( "Yes" ) ;
      exit ( ) ;
    }
    if ( v [ i ] == 4 ) v4 ++ ;
  }
  if ( v4 == 0 ) {
    System . out . println ( "No" ) ;
    exit ( ) ;
  }
  if ( v4 == 1 ) {
    System . out . println ( "No" ) ;
    exit ( ) ;
  }
  if ( v4 >= 3 ) {
    System . out . println ( "Yes" ) ;
    exit ( ) ;
  }
  int [ ] memo = new int [ n ] ;
  int [ ] ord = new int [ n ] ;
  int [ ] lowlink = new int [ n ] ;
  int [ ] articulation = new int [ n ] ;
  {
    int count = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int nv = g [ i ] ;
      if ( memo [ nv ] == 0 ) {
        count ++ ;
        dfs ( nv , v , k + 1 ) ;
        lowlink [ v ] = Math . min ( lowlink [ v ] , lowlink [ nv ] ) ;
        if ( p != - 1 && ord [ v ] <= lowlink [ nv ] ) isArticulation = true ;
      }
      else if ( nv != p ) {
        lowlink [ v ] = Math . min ( lowlink [ v ] , ord [ nv ] ) ;
      }
    }
    
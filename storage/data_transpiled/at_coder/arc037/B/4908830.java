static int N ( ) {
  int M = ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int [ ] [ ] graph = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    graph [ i ] = new int [ N ] ;
  }
  /* search for a */
  A += new int [ ] {
    a }
    ;
    boolean c = true ;
    for ( int i : graph [ a ] ) {
      if ( B [ i ] != null && i != p ) {
        return A == null ? false : true ;
      }
      if ( ! A [ i ] [ 0 ] . equals ( p ) ) {
        A = search ( a , i , A , B . clone ( ) ) ;
        c = false ;
      }
    }
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      int u = ( Integer . parseInt ( input . nextLine ( ) ) - 1 ) ;
      int v = ( Integer . parseInt ( input . nextLine ( ) ) - 1 ) ;
      graph [ u ] [ v ] = graph [ v ] ;
      graph [ v ] [ u ] = graph [ v ] ;
    }
    int ans = 0 , A = 0 , B = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( ! A [ i ] [ 0 ] . equals ( p ) ) {
        int G = search ( - 1 , i , new int [ ] {
        }
        , new int [ ] {
        }
        ) ;
        boolean c = false ;
        if ( c ) {
          ans ++ ;
          A += G ;
        }
        else {
          A += G ;
          B += G ;
        }
      }
    }
    System . out . println ( ans ) ;
    return ans ;
  }
  
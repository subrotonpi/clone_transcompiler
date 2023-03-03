public static Map < String , Integer > map ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int [ ] Tree = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Tree [ i ] = i ;
  }
  int [ ] size = new int [ N ] ;
  {
    int s1 , s2 ;
    int s2 ;
    /* Find the first element in the tree */
    if ( input . equals ( Tree [ s1 ] ) ) {
      return s1 ;
    }
    else {
      Tree [ s1 ] = find ( Tree [ s1 ] ) ;
      return Tree [ s1 ] ;
    }
  }
  {
    int s1 , s2 ;
    int s2 ;
    /* Unite the first element in the tree */
    s1 = Integer . parseInt ( input ) ;
    s2 = Integer . parseInt ( input ) ;
    if ( s1 != s2 ) {
      Tree [ s2 ] = s1 ;
      size [ s1 ] += size [ s2 ] ;
    }
  }
  int [ ] Edge = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    int y = Integer . parseInt ( input ) ;
    Edge [ i ] = new int [ ] {
      a - 1 , b - 1 , y }
      ;
    }
    int Q = Integer . parseInt ( input ) ;
    List < Pair < String , Integer >> people = new ArrayList < > ( ) ;
    for ( int q = 0 ;
    q < Q ;
    q ++ ) {
      int v = Integer . parseInt ( input ) ;
      int w = Integer . parseInt ( input ) ;
      people . add ( new Pair < > ( - 1 , v - 1 , w ) ) ;
    }
    Map < String , Integer > ans = new HashMap < > ( ) ;
    for ( Pair < String , Integer > q : new ArrayList < > ( people . stream ( ) . map ( Pair :: first ) . collect ( Collectors . toList ( ) ) ) ) {
      if ( q . first ( ) == - 1 ) {
        ans . put ( q . first ( ) , size [ find ( q . second ( ) ) ] ) ;
      }
      else {
        /* Unite the first element in the tree */
        unite ( q . first ( ) , q . second ( ) ) ;
      }
    }
    for ( Pair <
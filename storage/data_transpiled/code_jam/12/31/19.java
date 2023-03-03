public static List < Integer > iterativeDfs ( Map < Integer , List < Integer >> graph , int start , List < Integer > path ) {
  List < Integer > q = new ArrayList < Integer > ( ) ;
  q . add ( start ) ;
  while ( q . size ( ) > 0 ) {
    int v = q . remove ( 0 ) ;
    if ( ! path . contains ( v ) ) {
      path = path . add ( v ) ;
      q = graph . get ( v ) . stream ( ) . map ( q ) . collect ( Collectors . toList ( ) ) ;
    }
  }
  {
    List < Integer > path = new ArrayList < Integer > ( ) ;
    q = new ArrayList < Integer > ( ) ;
    q . add ( start ) ;
    while ( q . size ( ) > 0 ) {
      int v = q . remove ( 0 ) ;
      if ( ! path . contains ( v ) ) {
        path = path . add ( v ) ;
        q = graph . get ( v ) . stream ( ) . map ( q ) . collect ( Collectors . toList ( ) ) ;
      }
    }
    return path ;
  }
  int T = Integer . parseInt ( scanner . nextLine ( ) ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    int N = Integer . parseInt ( scanner . nextLine ( ) ) ;
    Map < Integer , List < Integer >> graph = Maps . newHashMap ( ) ;
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      graph . put ( i , new ArrayList < Integer > ( ) ) ;
    }
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      List < Integer > line = Integer . parseInt ( scanner . nextLine ( ) ) ;
      for ( int j = 0 ;
      j < line . size ( ) ;
      j ++ ) {
        graph . get ( line . get ( j ) ) . add ( j ) ;
      }
    }
    Map < Integer , Set < Integer >> parents = Maps . newHashMap ( ) ;
    for ( Integer i : graph . keySet ( ) ) {
      parents . put ( i , Sets . newHashSet ( iterativeDfs ( graph , i , path ) ) ) ;
    }
    boolean diamond = false ;
    for ( Integer node : graph . keySet ( ) ) {
      if ( diamond ) {
        break ;
      }
      Set < Integer > visited = Sets . newHashSet ( ) ;
      for ( Integer par : graph . get ( node ) ) {
        if ( diamond ) {
          for ( Integer x : parents . get
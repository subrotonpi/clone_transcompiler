static void print ( int N , int M ) {
  Stack < Entry > ES = new Stack < > ( ) ;
  Map < Integer , Set < Integer >> D = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Map < Integer , Integer > parent = new HashMap < > ( ) ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      parent . put ( j , j ) ;
    }
    {
      int px = root ( parent . get ( j ) ) ;
      int py = root ( parent . get ( j ) ) ;
      if ( px < py ) parent . put ( py , px ) ;
      else parent . put ( px , py ) ;
    }
  }
  Map < Integer , Set < Integer >> E = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int p = Integer . parseInt ( input . nextLine ( ) ) ;
    int q = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    p -- ;
    q -- ;
    ES . push ( new Entry ( p , q , c ) ) ;
    if ( D . get ( p ) . containsKey ( c ) ) {
      unite ( D . get ( p ) . get ( c ) , i ) ;
    }
    else D . get ( p ) . put ( c , i ) ;
    E . putIfAbsent ( p , new HashSet < > ( ) ) ;
    if ( D . get ( q ) . containsKey ( c ) ) {
      unite ( D . get ( q ) . get ( c ) , i ) ;
    }
    else D . get ( q ) . put ( c , i ) ;
    E . putIfAbsent ( q , new HashSet < > ( ) ) ;
  }
  Map < Integer , Set < Integer >> P = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int p = ES . peek ( i ) ;
    int q = ES . peek ( i ) ;
    Set < Integer > s = P . computeIfAbsent ( root ( i ) , k -> new HashSet < > ( ) ) ;
    s . add ( p ) ;
    s . add ( q ) ;
  }
  @ SuppressWarnings ( "unchecked" ) Queue < Entry > que = new ArrayDeque < > ( ) ;
  int cost = 0 ;
  int [ ] dist = new int [ N ] ;
  dist [ 0 ] =
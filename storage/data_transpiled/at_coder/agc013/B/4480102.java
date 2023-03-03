public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] [ ] c = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    c [ i ] = new int [ n ] ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      c [ i ] [ j ] = Integer . parseInt ( input ) ;
    }
  }
  Map < Integer , List < Integer >> graph = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    graph . put ( i + 1 , new ArrayList < > ( ) ) ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    graph . put ( c [ i ] [ 0 ] , graph . get ( c [ i ] [ 0 ] ) . add ( c [ i ] [ 1 ] ) ) ;
    graph . put ( c [ i ] [ 1 ] , graph . get ( c [ i ] [ 1 ] ) . add ( c [ i ] [ 0 ] ) ) ;
  }
  Stack < Integer > stack = new Stack < > ( ) ;
  int start = 1 ;
  int i = start ;
  Set < Integer > visited = new HashSet < > ( ) ;
  visited . add ( i ) ;
  List < Integer > root = new ArrayList < > ( ) ;
  root . add ( i ) ;
  while ( true ) {
    for ( int j : graph . get ( i ) ) {
      if ( ! visited . contains ( j ) ) {
        i = j ;
        root . add ( i ) ;
        visited . add ( i ) ;
        break ;
      }
    }
  }
  i = 1 ;
  List < Integer > root2 = new ArrayList < > ( ) ;
  while ( true ) {
    for ( int j : graph . get ( i ) ) {
      if ( ! visited . contains ( j ) ) {
        i = j ;
        root2 . add ( i ) ;
        visited . add ( i ) ;
        break ;
      }
    }
  }
  int ver = root2 . size ( ) + root . size ( ) ;
  System . out . println ( ver ) ;
  root = root2 . toArray ( new Integer [ root2 . size ( ) ] ) ;
  for ( int i = 0 ;
  i < root . size ( ) ;
  i ++ ) {
    System . out . print ( root . get ( i ) + "" ) ;
  }
  
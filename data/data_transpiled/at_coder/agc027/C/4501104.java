static final String getInput ( ) {
  Scanner input = new Scanner ( System . in ) ;
  System . setIn ( input ) ;
  @ SuppressWarnings ( "resource" ) int n = input . nextInt ( ) ;
  int m = input . nextInt ( ) ;
  char [ ] s = input . toCharArray ( ) ;
  int [ ] A = new int [ n ] ;
  int [ ] B = new int [ n ] ;
  int [ ] [ ] Edges = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = input . nextInt ( ) ;
    int b = input . nextInt ( ) ;
    a -- ;
    b -- ;
    if ( a == b ) {
      if ( s [ a ] == 'A' ) A [ a ] ++ ;
      else B [ a ] ++ ;
    }
    else {
      Edges [ a ] [ b ] = Edges [ b ] [ a ] ;
      if ( s [ a ] == 'A' ) A [ b ] ++ ;
      else B [ b ] ++ ;
      if ( s [ b ] == 'A' ) A [ a ] ++ ;
      else B [ a ] ++ ;
    }
  }
  boolean [ ] Del = new boolean [ n ] ;
  Queue < Integer > q = new ArrayDeque < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( A [ i ] * B [ i ] == 0 ) {
      q . add ( i ) ;
      Del [ i ] = true ;
    }
  }
  while ( q . size ( ) > 0 ) {
    int u = q . poll ( ) ;
    char l = s [ u ] ;
    for ( int v : Edges [ u ] ) {
      if ( Del [ v ] ) continue ;
      if ( l == 'A' ) A [ v ] -- ;
      else B [ v ] -- ;
      if ( A [ v ] * B [ v ] == 0 ) {
        q . add ( v ) ;
        Del [ v ] = true ;
      }
    }
  }
  System . out . println ( Arrays . toString ( Del ) == n ? "No" : "Yes" ) ;
  return "" ;
}

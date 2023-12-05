public static void print ( String input ) {
  int a , b ;
  StringBuilder g1 = new StringBuilder ( ) ;
  StringBuilder g2 = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < 100 ;
  i ++ ) {
    g1 . append ( "#" ) ;
  }
  g2 . append ( "." ) ;
  a = a - 1 ;
  b = b - 1 ;
  int j = 0 ;
  while ( a != 0 ) {
    for ( int i = 0 ;
    i < 100 ;
    i += 2 ) {
      g1 . append ( "." ) ;
      a -- ;
      if ( a == 0 ) {
        break ;
      }
    }
    j += 2 ;
  }
  j = 1 ;
  while ( b != 0 ) {
    for ( int i = 0 ;
    i < 100 ;
    i += 2 ) {
      g2 . append ( "#" ) ;
      b -- ;
      if ( b == 0 ) {
        break ;
      }
    }
    j += 2 ;
  }
  g1 . append ( g2 . toString ( ) ) ;
  System . out . println ( 40 + " " + 100 ) ;
  for ( StringBuilder ele : g1 ) {
    System . out . println ( ele . toString ( ) ) ;
  }
}

public static void print ( String input ) {
  int t = Integer . parseInt ( input ) ;
  for ( int kei : xrange ( t ) ) {
    int x = ( Integer . parseInt ( input ) ) ;
    int y = ( Integer . parseInt ( input ) ) ;
    char [ ] ans = new char [ kei + 1 ] ;
    while ( x > 0 ) {
      ans [ kei ] = 'WE' ;
      x -- ;
    }
    while ( x < 0 ) {
      ans [ kei ] = 'EW' ;
      x ++ ;
    }
    while ( y > 0 ) {
      ans [ kei ] = 'SN' ;
      y -- ;
    }
    while ( y < 0 ) {
      ans [ kei ] = 'NS' ;
      y ++ ;
    }
    System . out . println ( "Case #" + ( kei + 1 ) + ": " + new String ( ans ) ) ;
  }
}

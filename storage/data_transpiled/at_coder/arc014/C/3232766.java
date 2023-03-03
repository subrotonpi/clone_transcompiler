public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = input . nextInt ( ) ;
  }
  ArrayList < Integer > st = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( st . isEmpty ( ) ) st . add ( a [ i ] ) ;
    else if ( st . get ( i ) == st . get ( i - 1 ) ) {
      st . remove ( i ) ;
    }
  }
  System . out . println ( st . size ( ) ) ;
}

public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  boss = new ArrayList < > ( n ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) boss . add ( new ArrayList < > ( ) ) ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    boss . get ( a - 1 ) . add ( i + 2 ) ;
  }
  salary = new int [ n ] ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    if ( boss . get ( i ) . size ( ) == 0 ) {
      salary [ i ] = 1 ;
    }
    else {
      int [ ] pool = new int [ n ] ;
      for ( int b : boss . get ( i ) ) pool [ b - 1 ] = salary [ b - 1 ] ;
      salary [ i ] += max ( pool ) + min ( pool ) + 1 ;
    }
  }
  System . out . println ( salary [ 0 ] ) ;
}

public static void input ( Scanner in ) {
  int [ ] n = in . nextInt ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    n [ i ] = in . nextInt ( ) ;
  }
  int N = in . nextInt ( ) ;
  int a = n [ 0 ] ;
  int b = n . length ;
  int c = 0 ;
  for ( int i = 0 ;
  i < b ;
  i ++ ) {
    c += a * 10 * i ;
  }
  if ( N <= c ) {
    System . out . println ( c ) ;
  }
  else {
    StringBuilder sb = new StringBuilder ( ) ;
    for ( int i = 0 ;
    i < c ;
    i ++ ) {
      sb . append ( Integer . toString ( ( int ) c ) + 1 ) ;
    }
    System . out . println ( sb . toString ( ) ) ;
  }
}

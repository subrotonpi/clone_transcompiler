public static int A ( ) {
  int len = input . nextInt ( ) ;
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    len = input . nextInt ( ) ;
    if ( len % 2 == 1 ) continue ;
  }
  return len ;
}

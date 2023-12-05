public static int N ( Scanner input ) {
  int M = input . nextInt ( ) ;
  int [ ] X = new int [ 10 * 5 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = input . nextInt ( ) ;
    int b = input . nextInt ( ) ;
    a = a - 1 ;
    b = b - 1 ;
    X [ a ] ++ ;
    X [ b ] ++ ;
  }
  if ( Arrays . equals ( X , X ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return N ;
}

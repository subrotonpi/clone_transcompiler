public static int [ ] [ ] edge ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] edge = new int [ N + 1 ] [ N ] ;
  int a = 1 ;
  for ( int b = 1 ;
  b <= N ;
  b ++ ) {
    System . out . println ( "? " + a + " " + b ) ;
    int d = Integer . parseInt ( input . nextLine ( ) ) ;
    edge [ b ] = d ;
  }
  return edge ;
}

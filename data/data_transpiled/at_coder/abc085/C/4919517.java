public static int N = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) , Y = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Y / 10000 ;
  int b = ( Y % 10000 ) / 5000 ;
  int c = ( Y % 5000 ) / 1000 ;
  for ( int i = 0 ;
  i < a + 1 ;
  i ++ ) {
    int x = a - i ;
    int y = b + i * 2 ;
    for ( int j = 0 ;
    j < y + 1 ;
    j ++ ) {
      int z = c + j * 5 ;
      if ( x + y - j + z == N ) {
        System . out . println ( x + " " + y - j + " " + z ) ;
        exit ( ) ;
      }
      if ( x + y - j + z > N ) break ;
    }
  }
  return N ;
}

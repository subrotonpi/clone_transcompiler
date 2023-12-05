public static void print ( int N ) {
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( a ) ;
  int result = 0 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    result += a [ i + 1 ] - a [ i ] ;
  }
  System . out . println ( result ) ;
}

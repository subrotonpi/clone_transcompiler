public static void print ( int N ) {
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( a ) ;
  Arrays . sort ( a ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( a [ i ] < sortedA [ ( int ) ( N / 2 ) ] ) {
      System . out . println ( sortedA [ ( int ) ( N / 2 ) ] ) ;
    }
    else {
      System . out . println ( sortedA [ ( int ) ( N / 2 ) - 1 ] ) ;
    }
  }
}

public static void print ( int N ) {
  int [ ] X = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] Y = X . clone ( ) ;
  Arrays . sort ( Y ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( X [ i ] <= Y [ Integer . parseInt ( N / 2 ) - 1 ] ) {
      System . out . println ( Y [ Integer . parseInt ( N / 2 ) ] ) ;
    }
    else {
      System . out . println ( Y [ Integer . parseInt ( N / 2 ) - 1 ] ) ;
    }
  }
}

public static void print ( String s ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] a = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] [ i ] = i ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    StringBuffer sb = new StringBuffer ( ) ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      sb . append ( a [ N - j - 1 ] [ i ] ) ;
    }
    System . out . println ( sb ) ;
  }
}

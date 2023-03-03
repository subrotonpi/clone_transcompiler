public static void print ( int N ) {
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int count = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 1 ;
    j <= D ;
    j += A [ i ] ) {
      count ++ ;
    }
  }
  System . out . println ( count + X ) ;
}

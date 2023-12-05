public static int N = Integer . parseInt ( input ) {
  int [ ] X = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) X [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  Arrays . sort ( X ) ;
  Arrays . sort ( Y ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( X [ i ] > Y [ N / 2 - 1 ] ? Y [ N / 2 - 1 ] : Y [ N / 2 ] ) ;
  }
  return X [ N ] ;
}

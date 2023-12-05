public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] X = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < X . length ;
  i ++ ) {
    if ( X [ i ] < Math . abs ( K - X [ i ] ) ) {
      sumLen += X [ i ] * 2 ;
    }
    else {
      sumLen += Math . abs ( K - X [ i ] ) * 2 ;
    }
  }
  return sumLen ;
}

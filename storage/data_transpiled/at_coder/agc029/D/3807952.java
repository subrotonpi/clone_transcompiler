public static int H = Integer . parseInt ( input ) {
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] X = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( X ) ;
  int d = 0 ;
  int ans = H ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( X [ i ] + d == X [ i ] ) {
      d ++ ;
    }
    if ( X [ i ] + d < X [ i ] ) {
      ans = X [ i ] - 1 ;
      break ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}

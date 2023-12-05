public static int [ ] getHigh ( ) {
  int H = Integer . parseInt ( input . readLine ( ) ) ;
  int W = Integer . parseInt ( input . readLine ( ) ) ;
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] V = new int [ W ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    V [ i ] = H - 1 ;
  }
  X = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . readLine ( ) ) ;
    X [ i ] = ( y == 0 ) ? x : y ;
  }
  Arrays . sort ( V ) ;
  int d = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int y = X [ i ] ;
    x = X [ i ] ;
    x = x - 1 ;
  }
  Arrays . sort ( V ) ;
  int d = 0 ;
  return V ;
}

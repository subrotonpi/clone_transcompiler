public static int N ( int N , int A , int B ) {
  int [ ] X = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) X [ i ] = i ;
  int num = 0 ;
  int pre = X [ 0 ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    num += Math . min ( ( X [ i ] - pre ) * A , B ) ;
    pre = X [ i ] ;
  }
  System . out . println ( num ) ;
  return num ;
}

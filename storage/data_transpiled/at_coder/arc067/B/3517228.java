static int N ( int N , int A , int B ) {
  int s = 0 ;
  int [ ] X = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) X [ i ] = i ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) s += Math . min ( ( X [ i ] - X [ i - 1 ] ) * A , B ) ;
  System . out . println ( s ) ;
  return s ;
}

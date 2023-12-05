static int N ( int M , int X ) {
  int [ ] A = ( int [ ] ) input . split ( " " ) ;
  int [ ] Z = new int [ N ] ;
  for ( int a : A ) Z [ a ] = 1 ;
  int lower = 0 ;
  int higher = 0 ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    lower += Z [ i ] < X ? Z [ i ] : 0 ;
    higher += Z [ i ] > X ? Z [ i ] : 0 ;
  }
  System . out . println ( Math . min ( lower , higher ) ) ;
  return lower ;
}

public static int N ( int M , int X ) {
  int [ ] A = new int [ M ] ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ) ;
  }
  int lower = 0 ;
  int higher = 0 ;
  for ( int a : A ) {
    lower += a < X ? 1 : 0 ;
    higher += a > X ? 1 : 0 ;
  }
  System . out . println ( min ( lower , higher ) ) ;
  return lower ;
}

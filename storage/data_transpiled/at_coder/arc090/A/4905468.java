public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] A1 = Lists . newArrayList ( ) ;
  int [ ] A2 = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A1 [ i ] = Integer . parseInt ( input ) ;
    A2 [ i ] = Integer . parseInt ( input ) ;
  }
  int [ ] count1 = new int [ N ] ;
  count1 [ 0 ] = A1 [ 0 ] ;
  int [ ] count2 = new int [ N ] ;
  count2 [ N - 1 ] = A2 [ N - 1 ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    count1 [ i ] = A1 [ i ] ;
    count2 [ N - 1 - i ] = A2 [ i ] ;
  }
  int candy = 0 ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    candy = Math . max ( candy , count1 [ i ] + count2 [ i ] ) ;
  }
  System . out . println ( candy ) ;
}

private static int [ ] b ( String input ) {
  int p = Integer . parseInt ( input ) ;
  int q = Integer . parseInt ( input ) ;
  int r = Integer . parseInt ( input ) ;
  int [ ] net = new int [ 6 ] ;
  for ( int i = 0 ;
  i < 6 ;
  i ++ ) {
    net [ i ] = 0 ;
  }
  int [ ] w = {
    p , p , q , q , r , r }
    ;
    int [ ] d = {
      q , r , p , r , p , q }
      ;
      int [ ] h = {
        r , q , r , p , q }
        ;
        for ( int i = 0 ;
        i < 6 ;
        i ++ ) {
          net [ i ] = ( b [ 0 ] / w [ i ] ) * ( b [ 1 ] / d [ i ] ) * ( b [ 2 ] / h [ i ] ) ;
        }
        System . out . println ( max ( net ) ) ;
        return net ;
      }
      
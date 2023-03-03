static final int solve ( ) {
  final int inf = 1 << 30 ;
  int ans ;
  int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int r_max = 0 ;
  int b_max = 0 ;
  int r_min = 0 ;
  int b_min = inf ;
  Pair [ ] p = new Pair [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int xi = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int yi = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    if ( xi > yi ) {
      xi = yi ;
      yi = xi ;
    }
    p [ i ] = new Pair ( xi , yi ) ;
    r_max = Math . max ( r_max , yi ) ;
    r_min = Math . min ( r_min , yi ) ;
    b_max = Math . max ( b_max , xi ) ;
    b_min = Math . min ( b_min , xi ) ;
  }
  int ans1 = ( r_max - r_min ) * ( b_max - b_min ) ;
  int ans2 = ( r_max - b_min ) ;
  Arrays . sort ( p , new Comparator < Pair > ( ) {
    public int compare ( Pair o1 , Pair o2 ) {
      int b_min = o1 . first ;
      int b_max = o2 . first ;
      int y_min = inf ;
      int dif_b = b_max - b_min ;
      for ( int j = 0 ;
      j < n - 1 ;
      j ++ ) {
        if ( p [ j ] . second == r_max ) {
          break ;
        }
        y_min = Math . min ( y_min , p [ j ] . second ) ;
        b_min = Math . min ( p [ j + 1 ] . first , y_min ) ;
        b_max = Math . max ( b_max , p [ j ] . second ) ;
        dif_b = Math . min ( dif_b , b_max - b_min ) ;
        if ( p [ j ] . second < p [ j + 1 ] . second ) {
          break ;
        }
      }
      return - 1 ;
    }
  }
  ) ;
  ans *= dif_b ;
  ans = Math . min ( ans1 , ans2 ) ;
  System . out . println ( ans ) ;
}

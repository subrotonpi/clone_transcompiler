static final int solve ( ) {
  final int inf = 1 << 30 ;
  int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int r_max = 0 ;
  int b_max = 0 ;
  int r_min = 0 ;
  int b_min = inf ;
  Pair < Integer , Integer > [ ] p = new Pair [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int xi = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int yi = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    if ( xi > yi ) {
      xi = yi ;
      yi = xi ;
    }
    p [ i ] = new Pair < Integer , Integer > ( xi , yi ) ;
    r_max = Math . max ( r_max , yi ) ;
    r_min = Math . min ( r_min , yi ) ;
    b_max = Math . max ( b_max , xi ) ;
    b_min = Math . min ( b_min , xi ) ;
  }
  int ans1 = ( r_max - r_min ) * ( b_max - b_min ) ;
  int ans2 = ( r_max - b_min ) ;
  Arrays . sort ( p , new Comparator < Pair < Integer , Integer >> ( ) {
    @ Override public int compare ( Pair < Integer , Integer > o1 , Pair < Integer , Integer > o2 ) {
      int b_min = o1 . first ;
      int b_max = o2 . first ;
      int y_min = inf ;
      int dif_b = b_max - b_min ;
      for ( int j = 0 ;
      j < n - 1 ;
      j ++ ) {
        y_min = Math . min ( y_min , p [ j ] . second ) ;
        b_min = Math . min ( p [ j + 1 ] . first , y_min ) ;
        b_max = Math . max ( b_max , p [ j ] . second ) ;
        dif_b = Math . min ( dif_b , b_max - b_min ) ;
      }
      return ( int ) ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( (
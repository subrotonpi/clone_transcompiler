static final int [ ] [ ] getStdOut ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int M = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] x_y_z = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    x_y_z [ i ] = Lists . newArrayList ( ) ;
  }
  for ( int i = 0 ;
  i < 8 ;
  i ++ ) {
    x_minusplus = ( - 1 ) * i ;
    for ( int j = 0 ;
    j < 2 ;
    j ++ ) {
      y_minusplus = ( - 1 ) * j ;
      for ( int k = 0 ;
      k < 2 ;
      k ++ ) {
        int [ ] [ ] temp_x_y_z = new int [ N ] [ ] ;
        z_minusplus = ( - 1 ) * k ;
        int [ ] temp_x_y_z = new int [ N ] ;
        System . arraycopy ( x_y_z , 0 , temp_x_y_z , 0 , N ) ;
        double [ ] temp_sum = new double [ N ] ;
        for ( int l = 0 ;
        l < M ;
        l ++ ) {
          temp_x_y_z [ l ] [ 0 ] *= x_minusplus ;
          temp_x_y_z [ l ] [ 1 ] *= y_minusplus ;
          temp_x_y_z [ l ] [ 2 ] *= z_minusplus ;
          temp_sum [ l ] = Math . pow ( temp_x_y_z [ l ] , 2 ) ;
        }
        Arrays . sort ( temp_x_y_z ) ;
        for ( int l = 0 ;
        l < M ;
        l ++ ) {
          temp_ans [ num ] += temp_sum [ l ] ;
        }
        num ++ ;
      }
    }
  }
  System . out . println ( max ( temp_ans ) ) ;
  return temp_ans ;
}

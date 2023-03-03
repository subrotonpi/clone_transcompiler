private static int [ ] d_num = {
  0 , 31 , 29 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 }
  ;
  int D = 366 ;
  {
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      d += d_num [ i ] ;
    }
    return d - 1 ;
  }
  
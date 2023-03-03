public static void print ( int n ) {
  int MOD = 10 * 9 + 7 ;
  double dpa [ ] = {
    0 , 0 , 1 }
    ;
    double dpc [ ] = {
      0 , 0 , 1 }
      ;
      double dpg [ ] = {
        0 , 0 , 1 }
        ;
        double dpt [ ] = {
          0 , 0 , 1 }
          ;
          for ( int i = 2 ;
          i < n + 2 ;
          i ++ ) {
            dpa [ i ] = dpa [ i ] + dpc [ i ] + dpg [ i ] + dpt [ i ] ;
            dpc [ i ] = dpa [ i ] - dpg [ i - 1 ] + dpc [ i ] + dpg [ i ] - dpa [ i - 1 ] - 2 * dpa [ i - 2 ] + dpt [ i ] - dpa [ i - 2 ] ;
            dpg [ i ] = dpa [ i ] + dpc [ i ] + dpg [ i ] + dpt [ i ] ;
          }
          System . out . println ( ( dpa [ n + 1 ] + dpg [ n + 1 ] + dpc [ n + 1 ] + dpt [ n + 1 ] ) % MOD ) ;
        }
        
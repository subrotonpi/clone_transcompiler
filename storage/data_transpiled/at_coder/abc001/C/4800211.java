public static int D = Integer . parseInt ( input ) {
  char [ ] dirs = {
    'N' , 'NNE' , 'NE' , 'ENE' , 'E' , 'ESE' , 'SE' , 'SSE' , 'S' , 'SSW' , 'SW' , 'WSW' , 'W' , 'WNW' , 'NW' , 'NNW' }
    ;
    char [ ] wind = {
      25 , 155 , 335 , 545 , 795 , 1075 , 1385 , 1715 , 2075 , 2445 , 2845 , 3265 }
      ;
      char ans1 = dirs [ ( D * 10 + 1125 ) / 2250 % 16 ] ;
      char [ ] tmp = new char [ M ] ;
      for ( int i = 0 ;
      i < M ;
      i ++ ) {
        tmp [ i ] = wind [ i ] / 100 * 60 ;
      }
      int ans2 = Arrays . binarySearch ( tmp , W ) ;
      return ans2 == 0 ? 0 : ans1 + " " + ans2 ;
    }
    
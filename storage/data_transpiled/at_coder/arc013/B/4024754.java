public static int bMoving ( int C , int [ ] Baggages ) {
  int verticalMax = 0 , horizontal_max = 0 , height_max = 0 ;
  for ( int i = 0 ;
  i < C ;
  i ++ ) {
    int ver = Baggages [ i ] ;
    int hor = Baggages [ i ] ;
    int hei = Baggages [ i ] ;
    verticalMax = Math . max ( verticalMax , ver ) ;
    horizontal_max = Math . max ( horizontal_max , hor ) ;
    height_max = Math . max ( height_max , hei ) ;
  }
  int ans = verticalMax * horizontal_max * height_max ;
  return ans ;
}

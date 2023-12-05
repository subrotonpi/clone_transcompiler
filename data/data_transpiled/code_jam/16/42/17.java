static final double [ ] getStdDev ( ) {
  String [ ] ls = System . console ( ) . readLine ( ) . split ( " " ) ;
  int N = 0 ;
  double [ ] PS = new double [ N ] ;
  HashMap < String , Double > M = new HashMap < String , Double > ( ) ;
  {
    String key = ( i , yes , no ) -> {
      if ( M . containsKey ( key ) ) {
        return M . get ( key ) ;
      }
      if ( yes + no == 0 ) {
        M . put ( key , 1.0 ) ;
        return 1.0 ;
      }
      if ( i == PS . length ) {
        M . put ( key , 0.0 ) ;
        return 0.0 ;
      }
      return Double . NaN ;
    }
    ;
  }
  ;
  double inc = 0.0 ;
  if ( yes > 0 ) {
    inc = PS [ i ] * f ( i + 1 , yes - 1 , no ) ;
  }
  if ( no > 0 ) {
    inc += ( 1.0 - PS [ i ] ) * f ( i + 1 , yes , no - 1 ) ;
  }
  M . put ( key , inc ) ;
  return inc ;
}

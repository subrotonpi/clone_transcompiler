public static int k = Integer . parseInt ( input ) {
  int [ ] a = Integer . parseInt ( input . readLine ( ) ) ;
  int child = 2 ;
  int cmin = 2 ;
  int cmax = 2 ;
  for ( int ai = a . length - 1 ;
  ai >= 0 ;
  ai -- ) {
    if ( cmin % a [ ai ] != 0 ) cmin = ( cmin / a [ ai ] + 1 ) * a [ ai ] ;
    cmax = 2 ;
  }
  return child ;
}

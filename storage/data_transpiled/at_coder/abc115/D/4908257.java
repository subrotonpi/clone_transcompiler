public static int N , X = Integer . parseInt ( input ) {
  int [ ] layers = new int [ input . length ] ;
  for ( int i = 0 ;
  i < input . length ;
  i ++ ) {
    layers [ i ] = 0 ;
  }
  /* layers of level */
  if ( layers [ i ] != 0 ) {
    return layers [ i ] ;
  }
  layers [ i ] = 2 * layersOfLevel ( i - 1 ) + 3 ;
  /* how many putty */
  if ( i == 0 && i == 1 ) {
    return 1 ;
  }
  if ( i == layersOfLevel ( i ) ) {
    return 2 * ( i + 1 ) - 1 ;
  }
  int totalLayers = layersOfLevel ( i ) ;
  if ( totalLayers == 1 ) {
    return 0 ;
  }
  if ( totalLayers <= 1 + layersOfLevel ( i - 1 ) ) {
    return how ( n - 1 , layersOfLevel ( i - 1 ) ) + 1 + how ( n - 1 , x - layersOfLevel ( i - 1 ) - 2 ) ;
  }
  else {
    return 2 * how ( n - 1 , layersOfLevel ( i ) ) + 1 ;
  }
}

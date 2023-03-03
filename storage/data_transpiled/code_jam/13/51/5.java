public static int [ ] readArray ( Converter < Integer > convertor ) {
  int [ ] ret = new Scanner ( System . in ) . nextInt ( ) . split ( " " ) ;
  if ( convertor != null ) ret = ArrayUtil . convert ( ret , convertor ) ;
  return ret ;
  /* ok */
  if ( m == 110 && i == 37 ) debug = true ;
  int need = 0 ;
  for ( int j = 0 ;
  j < i ;
  j ++ ) need += m - ns [ j ] ;
  for ( int j = i ;
  j < ns . length ;
  j ++ ) if ( m + 1 > ns [ j ] ) need += m + 1 - ns [ j ] ;
  return need <= B ? ret : null ;
  /* cal */
}

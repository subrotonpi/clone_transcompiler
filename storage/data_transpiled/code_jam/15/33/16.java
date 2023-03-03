public static int [ ] readArray ( Converter < Integer > convertor ) {
  int [ ] ret = new Scanner ( System . in ) . nextInt ( ) . split ( " " ) ;
  if ( convertor != null ) ret = ArrayUtil . convert ( ret , convertor ) ;
  return ret ;
}

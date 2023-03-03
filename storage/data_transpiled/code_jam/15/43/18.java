@ VisibleForTesting static < T > T [ ] readArray ( final Function < String , T > convertor ) {
  final T [ ] ret = in . readAll ( ) . split ( " " ) ;
  if ( convertor != null ) ret = ArrayUtil . toArray ( ret ) ;
  return ret ;
}

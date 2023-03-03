public static final int [ ] getIntegerArray ( ) {
  final int len = Integer . parseInt ( input ( ) ) ;
  final List < Integer > l = new ArrayList < Integer > ( len ) ;
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    l . add ( i ) ;
  }
  count ++ ;
  final int [ ] output = new int [ len ] ;
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    output [ i ] = l . get ( i ) ;
  }
  return output ;
}

public static int [ ] Price ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  ArrayList < Integer > Price = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int p = Integer . parseInt ( input ( ) ) ;
    Price . add ( p ) ;
  }
  Price . sort ( ) ;
  return Price . toArray ( ) ;
}

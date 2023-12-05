static final String foo2 ( String word , int [ ] idx , int n ) {
  StringBuilder sb = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < idx . length ;
  i ++ ) {
    sb . append ( word . charAt ( i ) ) ;
    sb . append ( n % 2 ) ;
    n /= 2 ;
  }
  long res = 0 ;
  for ( String s : word . toCharArray ( ) ) {
    res = res * 2 + s ;
  }
  long t = ( long ) ( res * 0.5 ) ;
  if ( t * t == res ) {
    return sb . toString ( ) ;
  }
  return "" ;
}

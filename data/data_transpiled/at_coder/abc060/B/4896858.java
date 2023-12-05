public static String print ( int a , int b , int c ) {
  boolean s = false ;
  for ( int i = 1 ;
  i <= b ;
  i ++ ) {
    if ( ( a * i ) % b == c ) {
      s = true ;
      break ;
    }
  }
  return s ? "YES" : "NO" ;
}

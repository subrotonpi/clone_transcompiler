public static String solve ( int n ) {
  int [ ] digits = new int [ 10 ] ;
  while ( n > 0 ) {
    digits [ n ] = n % 10 ;
    n /= 10 ;
  }
  int len = digits . length ;
  char [ ] ans = null ;
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    if ( i > 0 && digits [ i ] < digits [ i - 1 ] ) break ;
    if ( i == 0 || digits [ i ] - 1 >= digits [ i - 1 ] ) {
      if ( digits [ i ] - 1 == 0 ) {
        ans = new char [ len ] ;
      }
      ans [ i ] = 9 ;
    }
    else {
      ans = new char [ len ] ;
      for ( int j = 0 ;
      j < len ;
      j ++ ) {
        ans [ j ] = digits [ j ] ;
      }
      ans [ j ] = digits [ i ] ;
    }
  }
  if ( i == len - 1 ) ans = digits ;
  return new String ( ans ) ;
}

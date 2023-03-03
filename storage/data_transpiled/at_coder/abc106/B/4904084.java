public static int N = Integer . parseInt ( input ) {
  int count = 0 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    ArrayList < Integer > a = new ArrayList < Integer > ( ) ;
    if ( i % 2 == 0 ) {
      continue ;
    }
    for ( int j = 1 ;
    j <= i ;
    j ++ ) {
      if ( i % j == 0 ) {
        a . add ( j ) ;
      }
    }
    if ( a . size ( ) == 8 ) {
      count ++ ;
    }
  }
  return count ;
}

public static int [ ] convert ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int mirror = 0 ;
  for ( int i = a ;
  i <= b ;
  i ++ ) {
    if ( i % 10 == i / 10000 && ( i / 10 ) % 10 == ( i / 1000 ) % 10 ) {
      mirror ++ ;
    }
    else {
      i ++ ;
    }
  }
  return ( int [ ] ) mirror ;
}

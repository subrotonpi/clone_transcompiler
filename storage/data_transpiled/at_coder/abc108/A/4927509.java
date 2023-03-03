public static int K = Integer . parseInt ( input ) {
  int even = 0 ;
  int odd = 0 ;
  for ( int i = 1 ;
  i <= K ;
  i ++ ) {
    if ( i % 2 == 0 ) {
      even ++ ;
    }
    else {
      odd ++ ;
    }
  }
  System . out . println ( even * odd ) ;
  return even ;
}

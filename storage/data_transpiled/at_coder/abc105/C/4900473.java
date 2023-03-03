static final int input ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  StringBuffer sb = new StringBuffer ( ) ;
  if ( N == 0 ) {
    sb . append ( 0 ) ;
  }
  while ( N != 0 ) {
    if ( N % ( - 2 ) == - 1 ) {
      sb . append ( 1 ) ;
      N /= ( - 2 ) ;
      N ++ ;
    }
    else {
    }
  }
  return N ;
}

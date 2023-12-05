@ VisibleForTesting static int from ( String input ) {
  int N = Integer . parseInt ( input ) ;
  Map < Integer , Integer > a = new HashMap < > ( Collections . nCopies ( 400 , N ) ) ;
  int c = 0 ;
  int n = 0 ;
  for ( int key : Arrays . asList ( 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 ) ) {
    if ( a . get ( key ) != null ) {
      c ++ ;
    }
  }
  for ( int key : a . keySet ( ) ) {
    n ++ ;
  }
  return n ;
}

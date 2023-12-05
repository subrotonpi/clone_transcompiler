public static String solve ( int N ) throws IOException {
  HashSet < Integer > saw = new HashSet < Integer > ( ) ;
  int ct = 0 ;
  int A = N ;
  while ( saw . size ( ) < 10 && ct < 100 ) {
    ct ++ ;
    for ( int x = ` A ` ;
    x < N ;
    x ++ ) saw . add ( x ) ;
    A += N ;
  }
  return ( saw . size ( ) == 10 && ct < 100 ) ? ` A - N ` : "INSOMNIA" ;
}

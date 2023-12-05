@ VisibleForTesting static void main ( Scanner in ) {
  int n = in . nextInt ( ) , k = in . nextInt ( ) ;
  int [ ] ax = new int [ 100001 ] ;
  int c = 0 ;
  int j = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = in . nextInt ( ) ;
    int b = in . nextInt ( ) ;
    ax [ a ] += b ;
  }
  while ( c < k ) {
    c += ax [ j ++ ] ;
  }
  System . out . println ( j - 1 ) ;
}

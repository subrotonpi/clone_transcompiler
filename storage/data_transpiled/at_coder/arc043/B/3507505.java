@ VisibleForTesting static void binarySearch ( int bl , int br ) {
  int n = Integer . parseInt ( input ( ) ) ;
  List < Integer > D = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    D . add ( Integer . parseInt ( input ( ) ) ) ;
  }
  int m = 10 * 9 + 7 ;
  List < Integer > R = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < D . size ( ) ;
  i ++ ) {
    R . add ( n - bl ( D , 2 * i ) ) ;
  }
  R = Collections . unmodifiableList ( R ) ;
  Function f = ( y , x ) -> ( y + br ( D , x / 2 ) * R . get ( Math . min ( n - 1 , bl ( D , 2 * x ) ) ) ) % m ;
  int a = Collections . frequency ( R , f ) ;
  System . out . println ( a [ a - 1 ] - a [ 0 ] ) ;
}

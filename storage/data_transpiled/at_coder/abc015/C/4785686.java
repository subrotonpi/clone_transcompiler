static void print ( int n , int k ) {
  List < List < Integer >> T = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    T . add ( Collections . singletonList ( i ) ) ;
  }
  @ SuppressWarnings ( "unchecked" ) Iterator < List < Integer >> iterator = T . iterator ( ) ;
}

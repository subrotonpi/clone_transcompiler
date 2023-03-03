public static void print ( int N , int K ) {
  List < Integer > As = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) As . add ( i ) ;
  int count = 1 ;
  N -= K ;
  while ( N > 0 ) {
    count ++ ;
    N -= K - 1 ;
  }
  System . out . println ( count ) ;
}

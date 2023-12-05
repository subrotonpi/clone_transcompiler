public static void print ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input ( ) ) ) ;
  }
  int S = Integer . parseInt ( A . get ( 0 ) ) ;
  String ans = ( ( 2 * S ) % ( N * ( N + 1 ) ) ) == 0 && Arrays . binarySearch ( A , ( 2 * S ) / ( N * ( N + 1 ) ) - ( A . get ( i ) - A . get ( i - 1 ) ) ) ;
  System . out . println ( ans ) ;
}

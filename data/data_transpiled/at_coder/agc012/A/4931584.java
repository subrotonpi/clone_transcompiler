public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( i ) ;
  }
  A . sort ( ) ;
  int total = 0 ;
  for ( int i = 1 ;
  i < 2 * N ;
  i += 2 ) {
    total += A . get ( i ) ;
  }
  System . out . println ( total ) ;
}

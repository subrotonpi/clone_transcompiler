public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( i ) ;
  }
  A . sort ( Collections . reverseOrder ( A ) ) ;
  List < Integer > B = A . subList ( 1 , 2 ) ;
  int c = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    c += B . get ( i ) ;
  }
  System . out . println ( c ) ;
}

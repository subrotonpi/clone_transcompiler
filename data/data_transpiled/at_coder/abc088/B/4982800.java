public static int N ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < Integer > A = new ArrayList < > ( Collections . nCopies ( N , input ) ) ;
  int alice = 0 ;
  int bob = 0 ;
  for ( int i = 0 ;
  i < A . size ( ) ;
  i ++ ) {
    if ( i % 2 == 0 ) {
      alice = alice + A . get ( i ) ;
    }
    else {
      bob = bob + A . get ( i ) ;
    }
  }
  System . out . println ( alice - bob ) ;
  return N ;
}

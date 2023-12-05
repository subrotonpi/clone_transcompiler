public static String main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final String S = input . nextLine ( ) . trim ( ) ;
  final StringBuffer L = new StringBuffer ( ) ;
  final StringBuffer R = new StringBuffer ( ) ;
  int c = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final char s = S . charAt ( i ) ;
    if ( s == '(' ) {
      c ++ ;
    }
    else {
      c -- ;
    }
    if ( c < 0 ) {
      L . append ( '(' ) ;
      c ++ ;
    }
  }
  R . append ( ')' ) ;
  return L . append ( S ) . append ( R . toString ( ) ) ;
}

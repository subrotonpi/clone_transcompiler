@ VisibleForTesting static void main ( String [ ] args ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( i ) ;
  }
  final int ans = A . stream ( ) . mapToInt ( Integer :: parseInt ) . sum ( ) ;
  System . out . println ( ans ) ;
}

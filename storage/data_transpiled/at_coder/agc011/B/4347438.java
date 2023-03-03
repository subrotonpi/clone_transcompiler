@ VisibleForTesting static Iterable < Integer > accumulate ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( i ) ;
  }
  A = Ordering . natural ( ) . reverse ( ) ;
  final List < Integer > aAcc = Lists . newArrayList ( ) ;
  return aAcc ;
}

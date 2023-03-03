@ VisibleForTesting static Iterable < Integer > accumulate ( ) {
  final int MOD = 10 * 9 + 7 ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Integer > T = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    T . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  T . sort ( ) ;
  final Collection < Integer > cs = Collections . singleton ( T ) ;
  System . out . println ( cs ) ;
  return cs ;
}

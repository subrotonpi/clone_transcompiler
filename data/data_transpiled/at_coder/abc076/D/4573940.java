@ VisibleForTesting static Iterable < Integer > iterable ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > ts = Lists . newArrayList ( ) ;
  List < Integer > vs = Lists . newArrayList ( ) ;
  for ( int t = 0 ;
  t < n ;
  t ++ ) {
    ts . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    vs . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  List < Integer > va = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    va . add ( i ) ;
  }
  va . clear ( ) ;
  return va ;
}

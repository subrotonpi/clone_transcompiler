@ VisibleForTesting static Iterable < Integer > accumulate ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > a = Lists . newArrayList ( ) ;
  for ( Integer i : a ) {
    a . add ( i ) ;
  }
  List < Integer > c = Lists . newArrayList ( ) ;
  int s = 0 ;
  for ( Map . Entry < Integer , Integer > entry : c ) {
    s = s + entry . getValue ( ) * ( entry . getValue ( ) - 1 ) / 2 ;
  }
  System . out . println ( s ) ;
  return c ;
}

@ VisibleForTesting static Iterable < List < Integer >> permutations ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int r = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> s = new ArrayList < > ( ) ;
  for ( int j = 0 ;
  j < n + 1 ;
  j ++ ) {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      s . add ( new ArrayList < > ( ) ) ;
    }
  }
  List < List < Integer >> g = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    g . add ( i ) ;
  }
  for ( int j = 0 ;
  j < m ;
  j ++ ) {
    s . add ( new ArrayList < > ( ) ) ;
  }
  return s ;
}

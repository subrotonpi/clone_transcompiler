@ VisibleForTesting static Iterable < Integer > accumulate ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > imos = new ArrayList < > ( m + 1 ) ;
  int total = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    imos . set ( l - 1 ) ;
  }
  return imos ;
}

static final int [ ] getMath ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int s = Math . ceil ( n * ( 1 / 2 ) ) ;
  List < Integer > ans = new ArrayList < > ( ) ;
  for ( int i = 1 ;
  i <= s ;
  i ++ ) {
    for ( int j = 0 ;
    j < n / i + 1 ;
    j ++ ) {
      int m = n - i * j ;
      int d = Math . abs ( i - j ) ;
      ans . add ( m + d ) ;
    }
  }
  System . out . println ( min ( ans ) ) ;
  return ans . toArray ( ) ;
}

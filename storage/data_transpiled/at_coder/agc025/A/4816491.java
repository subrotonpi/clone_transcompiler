static final double nextDouble ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  double ans = Double . POSITIVE_INFINITY ;
  for ( int i = 1 ;
  i <= ( int ) ( n / 2 + 1 ) ;
  i ++ ) {
    String a = String . valueOf ( i ) ;
    String b = String . valueOf ( n - i ) ;
    double an = 0 ;
    for ( int j = 0 ;
    j < a . length ( ) ;
    j ++ ) {
      an += ( int ) a . charAt ( j ) ;
    }
    for ( int k = 0 ;
    k < b . length ( ) ;
    k ++ ) {
      an += ( int ) b . charAt ( k ) ;
    }
    if ( an < ans ) {
      ans = an ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}

@ VisibleForTesting static void input ( ) {
  final int [ ] c = new int [ 10 ] ;
  final int n = Integer . parseInt ( input . nextLine ( ) ) , m = Integer . parseInt ( input . nextLine ( ) ) ;
  int t = 2 ;
  while ( ( t * t <= m ) && ( m < n ) ) {
    if ( m % t != 0 ) {
      t ++ ;
      continue ;
    }
    while ( m % t == 0 ) {
      c [ t ] ++ ;
      m /= t ;
    }
  }
  if ( m > 1 ) c [ m ] ++ ;
  a = 1 ;
  for ( int i : c ) a = a * comb ( n + c [ i ] - 1 , n - 1 , 1 ) % ( 10 * 9 + 7 ) ;
  System . out . println ( a ) ;
}

public static void print ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  a = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int ans = 0 ;
  int M = max ( a ) ;
  int m = min ( a ) ;
  while ( M > n - 1 ) {
    int Mi = a . indexOf ( M ) ;
    int div = M / n ;
    for ( int i = 0 ;
    i < div ;
    i ++ ) {
      if ( i == Mi ) a . set ( i , n * div ) ;
      else a . set ( i , div ) ;
    }
    ans += div ;
    M = max ( a ) ;
    m = min ( a ) ;
  }
  System . out . println ( ans ) ;
}

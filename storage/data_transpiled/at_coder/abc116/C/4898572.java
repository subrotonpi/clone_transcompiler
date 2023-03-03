public static void input ( ) {
  List < Integer > S = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < S . size ( ) ;
  i ++ ) {
    S . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int i = 0 ;
  int ans = 0 ;
  while ( true ) {
    if ( i >= S . size ( ) ) {
      break ;
    }
    for ( int j = i + 1 ;
    j <= S . size ( ) ;
    j ++ ) {
      int a = Collections . max ( S . subList ( i , j ) ) ;
      if ( j >= S . size ( ) ) {
        ans += Collections . max ( S . subList ( i , j ) ) ;
        i += j ;
        break ;
      }
      else if ( a <= S . get ( j ) ) {
        continue ;
      }
      else {
        ans += Collections . max ( S . subList ( i , j ) ) ;
        ans -= S . get ( j ) ;
        i = j ;
        break ;
      }
    }
  }
  System . out . println ( ans ) ;
}

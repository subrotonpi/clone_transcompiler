private static String solve ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  String ans = "Yes" ;
  int alone = 0 ;
  int group = 0 ;
  int ha = max ( a ) ;
  int la = min ( a ) ;
  if ( ha - la >= 2 ) ans = "No" ;
  else if ( ha - la == 1 ) {
    for ( int i = 0 ;
    i < a . length ;
    i ++ ) {
      if ( a [ i ] == ha - 1 ) alone ++ ;
      else group ++ ;
    }
    if ( alone < ha && 2 * ( ha - alone ) <= group ) pass ( ) ;
    else ans = "No" ;
  }
  else if ( ha - la == 0 ) {
    if ( a [ 0 ] == n - 1 || 2 * a [ 0 ] <= n ) pass ( ) ;
    else ans = "No" ;
  }
  return ans ;
}

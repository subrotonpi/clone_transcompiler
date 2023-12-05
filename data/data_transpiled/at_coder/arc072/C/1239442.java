public static String input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int d = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] q = new int [ Q ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) q [ i ] = i ;
  int [ ] a = new int [ N ] ;
  int [ ] b = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) a [ i ] = D ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) b [ i ] = 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( d [ i ] / 2 < b [ i + 1 ] ) b [ i ] = b [ i + 1 ] + d [ i ] ;
    else b [ i ] = b [ i + 1 ] ;
  }
  String res = "" ;
  for ( int i : q ) {
    if ( a [ i - 1 ] < b [ i ] ) res += "NO" ;
    else res += "YES" ;
    res += "\n" ;
  }
  System . out . println ( res ) ;
  return res ;
}

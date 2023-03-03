public static String solve ( int n ) {
  HashSet < String > digs = new HashSet < String > ( ) ;
  for ( int i : xrange ( 1 , 1000 ) ) {
    for ( int j : String . valueOf ( i * n ) . split ( " " ) ) digs . add ( j ) ;
    if ( ( digs . size ( ) == 10 ) && ( digs . size ( ) == 10 ) ) return i * n ;
  }
  return "INSOMNIA" ;
  int t = Integer . parseInt ( readLine ( ) ) ;
  for ( int cas : xrange ( 1 , t + 1 ) ) {
    n = Integer . parseInt ( readLine ( ) ) ;
    System . out . println ( "Case #" + cas + ": " + solve ( n ) ) ;
  }
  return "INSOMNIA" ;
}

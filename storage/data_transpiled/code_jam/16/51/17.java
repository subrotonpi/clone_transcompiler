@ input public static int T ( ) {
  @ SuppressWarnings ( "resource" ) Scanner scanner = new Scanner ( System . in ) ;
  int T = scanner . nextInt ( ) ;
  Map < String , Integer > dp = new HashMap < String , Integer > ( ) ;
  dp . put ( "" , 0 ) ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    char ch = scanner . next ( ) ;
    Map < String , Integer > last = dp . get ( dp . size ( ) - 1 ) ;
    Map < String , Integer > nxt = new HashMap < String , Integer > ( ) ;
    for ( Map . Entry < String , Integer > pre : last . entrySet ( ) ) {
      String val = pre . getValue ( ) ;
      if ( ! ( S . length ( ) - i < pre . getKey ( ) . length ( ) ) ) {
        String st = pre . getKey ( ) + ch ;
        nxt . put ( st , max ( nxt . get ( st ) , val ) ) ;
      }
      if ( pre . length ( ) > 0 ) {
        int sc = val + ( ch == pre . getKey ( ) . charAt ( pre . getKey ( ) . length ( ) - 1 ) ? 10 : 5 ) ;
        String st = pre . getKey ( ) . substring ( 0 , pre . getKey ( ) . length ( ) - 1 ) ;
        nxt . put ( st , max ( nxt . get ( st ) , sc ) ) ;
      }
    }
    dp . put ( nxt ) ;
  }
  return max ( dp . values ( ) ) ;
}

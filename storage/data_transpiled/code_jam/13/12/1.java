@ sys . exit public static void main ( String ... args ) {
  int z = input . nextInt ( ) ;
  @ SuppressWarnings ( "unchecked" ) Map < String , Integer > memo = new HashMap < > ( ) ;
  @ SuppressWarnings ( "unchecked" ) Map < String , Integer > map = new HashMap < > ( ) ;
  for ( int cas : xrange ( 1 , z + 1 ) ) {
    int e = Integer . parseInt ( input . nextLine ( ) ) ;
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] v = Integer . parseInt ( input . nextLine ( ) ) ;
    @ SuppressWarnings ( "unchecked" ) int E = Integer . parseInt ( input . nextLine ( ) ) ;
    int N = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( N == n ) return ;
    int s = 0 ;
    for ( int t : xrange ( E + 1 ) ) {
      int w = Math . min ( Math . min ( e , E - t + r ) , N + 1 ) + t * v [ N ] ;
      s = Math . max ( s , w ) ;
    }
  }
  map . clear ( ) ;
  int ans = map . get ( e ) ;
  System . out . println ( "Case #" + cas + ": " + ans ) ;
}

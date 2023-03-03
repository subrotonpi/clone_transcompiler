@ VisibleForTesting static void main ( String [ ] args ) {
  int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int t : xrange ( 1 , T + 1 ) ) {
    int N = Integer . parseInt ( readLine ( ) ) ;
    Node [ ] nodes = new Node [ N ] ;
    for ( int i : xrange ( N ) ) {
      nodes [ i ] = map ( Integer . parseInt ( readLine ( ) ) - 1 , w -> Integer . parseInt ( readLine ( ) ) - 1 ) ;
    }
    boolean nottree = false ;
    for ( int i : xrange ( N ) ) {
      Queue < Integer > q = new LinkedList < Integer > ( ) ;
      q . add ( i ) ;
      Set < Integer > set = new HashSet < Integer > ( ) ;
      while ( q . size ( ) > 0 ) {
        int n = q . poll ( ) ;
        if ( set . contains ( n ) ) {
          nottree = true ;
          break ;
        }
        set . add ( n ) ;
        for ( int m : nodes [ n ] ) {
          q . add ( m ) ;
        }
      }
      if ( nottree ) break ;
    }
    System . out . println ( "Case #" + t + ": " + ( nottree ? "Yes" : "No" ) ) ;
  }
}

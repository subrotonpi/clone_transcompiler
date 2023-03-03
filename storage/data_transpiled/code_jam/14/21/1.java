public static int T = Integer . parseInt ( Scanner in ) {
  for ( int Case : xrange ( T ) ) {
    System . out . printf ( "Case #%d:%n" , Case + 1 ) ;
    int N = Integer . parseInt ( in . nextLine ( ) ) ;
    /* Turning a list of integers */
    ArrayList < Point > a = new ArrayList < Point > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( a . size ( ) == 0 || a . get ( a . size ( ) - 1 ) . x != i ) {
        a . add ( new Point ( i , 1 ) ) ;
      }
      else {
        a . set ( a . get ( a . size ( ) - 1 ) . x , new Point ( a . get ( a . size ( ) - 1 ) . x , a . get ( a . size ( ) - 1 ) . y + 1 ) ) ;
      }
    }
    /* Turning a list of integers */
    A = new ArrayList < Point > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      A . add ( tonormal ( in . nextLine ( ) ) ) ;
    }
    boolean win = Arrays . asList ( A . get ( 0 ) . x ) . contains ( A . get ( 1 ) . x ) ;
    for ( int k = 1 ;
    k < N ;
    k ++ ) {
      if ( win ) {
        int s = 0 ;
        for ( int i = 0 ;
        i < xrange ( A . get ( 0 ) . x ) . x ;
        i ++ ) {
          ArrayList < Point > t = new ArrayList < Point > ( ) ;
          for ( int j = 0 ;
          j < xrange ( N ) ;
          j ++ ) {
            t . add ( A . get ( j ) . x . y ) ;
          }
          int m = new ArrayList < Point > ( t ) . get ( t . size ( ) / 2 ) ;
          s += Math . pow ( Math . abs ( i - m ) , 2 ) ;
        }
        System . out . println ( s ) ;
      }
      else {
        System . out . println ( "Fegla Won" ) ;
      }
    }
    return s ;
  }
}

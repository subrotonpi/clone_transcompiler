static final Runnable main = new Runnable ( ) {
  @ Override public void run ( ) {
    Scanner input = new Scanner ( System . in ) ;
    int N = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] A = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) A [ i ] = 0 ;
    int cnt = 1 ;
    Set < Integer > pushed = new HashSet < > ( ) ;
    pushed . add ( 1 ) ;
    Queue < Integer > q = new LinkedList < > ( ) ;
    q . add ( 1 ) ;
    while ( q . size ( ) > 0 ) {
      int a = q . poll ( ) ;
      int b = A [ a ] ;
      if ( b == 2 ) return cnt ;
      else if ( pushed . contains ( b ) ) return - 1 ;
      else {
        pushed . add ( b ) ;
        cnt ++ ;
        q . add ( b ) ;
      }
    }
  }
}

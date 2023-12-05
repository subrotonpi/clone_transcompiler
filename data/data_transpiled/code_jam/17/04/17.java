static final int [ ] [ ] findConnections ( int t , int r , int c , int method ) {
  int [ ] [ ] B ;
  int N = input ( ) ;
  int M = input ( ) ;
  int [ ] [ ] A = new int [ N ] [ M ] ;
  int score = 0 ;
  for ( int r = 1 ;
  r <= N ;
  r ++ ) {
    for ( int c = 1 ;
    c <= N ;
    c ++ ) {
      boolean hasr = hasFlow ( r , c , FR , 0 ) ;
      boolean hasd = hasFlow ( r , c , FD , 1 ) ;
      if ( hasr ) score ++ ;
      if ( hasd ) {
        char newt = hasr ? 'o' : 'x' ;
        char key = r ;
        if ( D [ key ] [ c ] != null ) oldt = D [ key ] [ c ] ;
        else oldt = ' ' ;
      }
      if ( oldt == newt ) continue ;
      B [ 0 ] [ c ] = newt ;
    }
  }
  System . out . println ( "Case #" + testcase + ": " + score + " " + B . length ) ;
  for ( int i = 0 ;
  i < B . length ;
  i ++ ) {
    int s = B [ i ] [ 0 ] ;
    int e = B [ i ] [ 1 ] ;
    int occupied = B [ i ] [ 2 ] ;
    if ( occupied ) {
      assert ! used . contains ( s ) ;
      assert ! used . contains ( e ) ;
      used . add ( s ) ;
      used . add ( e ) ;
      G . addEdge ( "source" , s , capacity ( 1 ) ) ;
      G . addEdge ( e , "sink" , capacity ( 1 ) ) ;
      G . addEdge ( s , e , capacity ( 1 ) ) ;
    }
  }
  Set < Integer > starts = new HashSet < Integer > ( ) ;
  Set < Integer > ends = new HashSet < Integer > ( ) ;
  for ( int r = 1 ;
  r <= N ;
  r ++ ) {
    for ( int c = 1 ;
    c <= N ;
    c ++ ) {
      int s = B [ i ] [ 0 ] ;
      int e = B [ i ] [ 1 ] ;
      starts . add ( s ) ;
      ends . add ( e ) ;
      if ( used . contains ( s ) || used . contains ( e ) ) continue ;
      G . addEdge ( s , e , capacity ( 1 ) ) ;
    }
  }
  for
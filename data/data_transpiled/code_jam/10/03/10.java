public static int T = Integer . parseInt ( Scanner in ) {
  int R = in . nextInt ( ) ;
  int k = in . nextInt ( ) ;
  int N = in . nextInt ( ) ;
  int [ ] g = new int [ R ] ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    R = in . nextInt ( ) ;
    k = in . nextInt ( ) ;
    int [ ] g = in . nextInt ( ) ;
    int res ;
    if ( max ( g ) > k ) {
      res = 0 ;
    }
    else {
      HashSet < Integer > visited = new HashSet < Integer > ( ) ;
      int i = 0 ;
      while ( ! visited . contains ( i ) ) {
        visited . add ( i ) ;
        i = in . nextInt ( ) ;
      }
      int c = 1 ;
      int p = in . nextInt ( ) ;
      int j = in . nextInt ( ) ;
      while ( j != i ) {
        int x = in . nextInt ( ) ;
        c ++ ;
        p += x ;
      }
      int a = in . nextInt ( ) ;
      int r = 0 ;
      int res = 0 ;
      boolean enteredLoop = false ;
      boolean doneLoop = false ;
      while ( r < R ) {
        if ( ! enteredLoop ) {
          int re = in . nextInt ( ) ;
          a = in . nextInt ( ) ;
          res += re ;
          r ++ ;
          if ( a == i ) enteredLoop = true ;
        }
        else if ( ! doneLoop ) {
          int loopsToDo = ( R - r ) / c ;
          r += loopsToDo * c ;
          res += p * loopsToDo ;
          doneLoop = true ;
        }
        else {
          int re = in . nextInt ( ) ;
          a = in . nextInt ( ) ;
          res += re ;
          r ++ ;
        }
      }
    }
  }
  System . out . println ( "Case #" + in . nextInt ( ) + ":" + res ) ;
  return res ;
}

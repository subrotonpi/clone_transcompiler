public static int T = Integer . parseInt ( Scanner in ) {
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    int N = in . nextInt ( ) ;
    int [ ] [ ] L = new int [ N ] [ N ] ;
    for ( int n = 0 ;
    n < N ;
    n ++ ) {
      L [ n ] = Arrays . stream ( in . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
    }
    int [ ] level1 = new int [ N ] ;
    int [ ] level2 = new int [ N ] ;
    boolean done = false ;
    int stars = 0 ;
    int games = 0 ;
    while ( ! done ) {
      done = true ;
      for ( int stage = 0 ;
      stage < N ;
      stage ++ ) {
        if ( level2 [ stage ] == 0 && stars >= L [ stage ] [ 1 ] ) {
          games ++ ;
          stars += 2 - level1 [ stage ] ;
          level2 [ stage ] = 1 ;
          level1 [ stage ] = 1 ;
          done = false ;
        }
      }
      if ( done ) {
        List < Integer > candidates = new ArrayList < > ( ) ;
        for ( int stage = 0 ;
        stage < N ;
        stage ++ ) {
          if ( L [ stage ] [ 0 ] <= stars && level1 [ stage ] == 0 ) {
            candidates . add ( stage ) ;
          }
        }
        if ( candidates . size ( ) > 0 ) {
          Collections . sort ( candidates , new Comparator < Integer > ( ) {
            @ Override public int compare ( Integer o1 , Integer o2 ) {
              return L [ o1 ] [ o2 ] - L [ o1 ] [ o2 ] ;
            }
          }
          ) ;
          Collections . reverse ( candidates ) ;
          stars ++ ;
          level1 [ candidates . get ( 0 ) ] = 1 ;
          done = false ;
          games ++ ;
        }
      }
    }
    if ( stars < 2 * N ) {
      System . out . println ( "Case #" + ( t + 1 ) + ": Too Bad" ) ;
    }
    else {
      System . out . println ( "Case #" + ( t + 1 ) + ":" + games ) ;
    }
  }
  return N ;
}

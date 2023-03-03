public static void main ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  List < String > A = new ArrayList < String > ( ) ;
  for ( int h = 0 ;
  h < H ;
  h ++ ) {
    A . add ( Collections . singletonList ( input ) ) ;
  }
  int currentNode = 0 ;
  List < List < String >> visited = new ArrayList < List < String >> ( ) ;
  for ( int w = 0 ;
  w < W ;
  w ++ ) {
    for ( int h = 0 ;
    h < H ;
    h ++ ) {
      visited . add ( Arrays . asList ( "." ) ) ;
    }
  }
  Point [ ] search = {
    new Point ( 0 , 1 ) , new Point ( 1 , 0 ) }
    ;
    while ( currentNode != H - 1 && currentNode != W - 1 ) {
      visited . get ( currentNode ) . set ( currentNode , "#" ) ;
      List < int [ ] > tovisit = new ArrayList < int [ ] > ( ) ;
      for ( Point s : search ) {
        int nexth = currentNode + s . x , nextw = currentNode + s . y ;
        if ( 0 <= nexth && nexth <= H - 1 && 0 <= nextw && nextw <= W - 1 ) {
          if ( A . get ( nexth ) . get ( nextw ) . equals ( "#" ) && visited . get ( nexth ) . get ( nextw ) . equals ( "." ) ) {
            tovisit . add ( new int [ ] {
              nexth , nextw }
              ) ;
            }
          }
        }
        if ( tovisit . size ( ) == 1 ) {
          currentNode = tovisit . get ( 0 ) ;
        }
        else {
          System . out . println ( "Impossible" ) ;
          break ;
        }
      }
      else {
        visited . get ( currentNode ) . set ( currentNode , "#" ) ;
        boolean flag = true ;
        for ( int h = 0 ;
        h < H ;
        h ++ ) {
          for ( int w = 0 ;
          w < W ;
          w ++ ) {
            if ( A . get ( h ) . get ( w ) . equals ( visited . get ( h ) . get ( w ) ) ) {
              flag = false ;
              break ;
            }
          }
          if ( ! flag ) {
            System . out . println ( "Impossible" ) ;
            break ;
          }
        }
      }
      System . out . println ( "Possible" ) ;
    }
    
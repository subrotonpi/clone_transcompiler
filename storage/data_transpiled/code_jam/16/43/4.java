@ InputFunction public static Boolean collectSet ( char [ ] [ ] maze , int [ ] pos1 , int [ ] pos2 , int [ ] dir ) {
  int [ ] newpos = new int [ ] {
    pos1 [ 0 ] + dir [ 0 ] , pos1 [ 1 ] + dir [ 1 ] }
    ;
    if ( newpos == pos2 ) return true ;
    if ( ! ( 0 <= newpos [ 0 ] && 0 <= newpos [ 1 ] && 0 <= maze [ 0 ] . length ) ) return false ;
    int i ;
    int c ;
    for ( i = 0 ;
    i < t ;
    i ++ ) {
      System . out . printf ( "Case #%d:" , i + 1 ) ;
      c = Integer . parseInt ( input . nextLine ( ) ) ;
      int [ ] l = map ( Integer . parseInt , input . nextLine ( ) ) ;
      char [ ] sl = solve ( r , c , l ) ;
      if ( sl == null ) {
        System . out . println ( "IMPOSSIBLE" ) ;
        continue ;
      }
      System . out . println ( Arrays . toString ( sl ) ) ;
    }
    return true ;
  }
  
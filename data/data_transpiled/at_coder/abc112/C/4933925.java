public static int [ ] [ ] getCoordinates ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] xyhs = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    xyhs [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int anscx = 0 ;
  int anscy = 0 ;
  int ansh = 0 ;
  if ( n == 1 ) {
    anscx = xyhs [ 0 ] [ 0 ] ;
    anscy = xyhs [ 0 ] [ 1 ] ;
    ansh = 0 ;
  }
  else if ( Arrays . equals ( xyhs [ 2 ] , 0 ) ) {
    anscx = 0 ;
    anscy = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      anscx += xyhs [ i ] [ 0 ] ;
      anscy += xyhs [ i ] [ 1 ] ;
    }
    anscx /= n ;
    anscy /= n ;
    ansh = Math . abs ( xyhs [ 0 ] [ 0 ] - anscx ) + Math . abs ( xyhs [ 0 ] [ 1 ] - anscy ) ;
  }
  else {
    for ( int cx = 0 ;
    cx < 101 ;
    cx ++ ) {
      for ( int cy = 0 ;
      cy < 101 ;
      cy ++ ) {
        Set < Integer > hSet = new HashSet < Integer > ( ) ;
        hSet . add ( h + Math . abs ( xyhs [ cx ] [ 1 ] - xyhs [ cy ] [ 0 ] ) ) ;
        if ( hSet . size ( ) > 1 ) continue ;
        int h_ = Collections . min ( hSet ) . size ( ) ;
        if ( Arrays . equals ( hSet . toArray ( ) , Math . max ( h_ - Math . abs ( xyhs [ cx ] [ 1 ] - xyhs [ cy ] [ 1 ] ) , 0 ) ) ) {
          anscx = cx ;
          anscy = cy ;
          ansh = h_ ;
        }
      }
    }
  }
  System . out . println ( anscx + " " + anscy + " " + ansh ) ;
  return xyhs ;
}

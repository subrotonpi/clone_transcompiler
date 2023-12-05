private static final Map < Character , Integer > dirs = new HashMap < Character , Integer > ( ) {
  {
    put ( '^' , ( - 1 , 0 ) ) ;
    put ( 'v' , ( 1 , 0 ) ) ;
    put ( '<' , ( 0 , - 1 ) ) ;
    put ( '>' , ( 0 , 1 ) ) ;
  }
  private boolean hasAnother ( char [ ] [ ] mapa , int r , int c , int dr , int dc ) {
    int R = mapa . length ;
    int C = mapa [ 0 ] . length ;
    do {
      r += dr ;
      c += dc ;
      if ( r < 0 || r >= R || c < 0 || c >= C ) return false ;
      if ( mapa [ r ] [ c ] != '.' ) return true ;
    }
    while ( true ) ;
  }
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int test = 1 ;
  test <= T ;
  test ++ ) {
    R = Integer . parseInt ( input . nextLine ( ) ) ;
    C = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] [ ] mapa = new int [ R ] [ C ] ;
    for ( int z = 0 ;
    z < R ;
    z ++ ) mapa [ z ] = input . toCharArray ( ) ;
    int answer = 0 ;
    boolean impossible = false ;
    for ( int r = 0 ;
    r < R ;
    r ++ ) {
      for ( int c = 0 ;
      c < C ;
      c ++ ) {
        if ( mapa [ r ] [ c ] == '.' ) continue ;
        int dr = dirs [ mapa [ r ] [ c ] ] ;
        int dc = dirs [ mapa [ r ] [ c ] ] ;
        if ( hasAnother ( mapa , r , c , dr , dc ) ) continue ;
        boolean canSave = false ;
        for ( int x = 0 ;
        x < dirs . length ;
        x ++ ) {
          dr = dirs [ x ] [ x ] ;
          dc = dirs [ x ] [ x ] ;
          if ( hasAnother ( mapa , r , c , dr , dc ) ) canSave = true ;
        }
        if ( canSave ) answer ++ ;
        else impossible = true ;
      }
    }
    if ( impossible ) System . out . println ( "Case #" + test + ": IMPOSSIBLE" ) ;
    else System . out . println ( "Case #" + test + ": "
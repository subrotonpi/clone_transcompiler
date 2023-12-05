static final int [ ] [ ] getStrings ( ) {
  int h = Integer . parseInt ( input . readLine ( ) ) ;
  int w = Integer . parseInt ( input . readLine ( ) ) ;
  String [ ] s = new String [ h ] ;
  for ( int i = 0 ;
  i <= h ;
  i ++ ) {
    s [ i ] = input . readLine ( ) ;
  }
  boolean [ ] [ ] b = new boolean [ w ] [ w ] ;
  for ( int j = 0 ;
  j <= h ;
  j ++ ) {
    for ( int i = 0 ;
    i <= h ;
    i ++ ) {
      for ( int j = 0 ;
      j <= w ;
      j ++ ) {
        if ( s [ i ] [ j ] . equals ( "." ) ) {
          c ++ ;
        }
      }
    }
  }
  Queue < Integer > q = new ArrayDeque < > ( ) ;
  q . add ( new Integer [ ] {
    0 , 0 , 0 }
    ) ;
    b [ 0 ] [ 0 ] = true ;
    /* Add the i and j */
    for ( int i = 0 ;
    i <= h ;
    i ++ ) {
      for ( int j = 0 ;
      j <= w ;
      j ++ ) {
        if ( s [ i ] [ j ] . equals ( "." ) ) {
          b [ i ] [ j ] = true ;
          q . add ( new Integer [ ] {
            i , j , d }
            ) ;
          }
        }
      }
      boolean f = false ;
      while ( ! q . isEmpty ( ) ) {
        Integer [ ] qi = q . poll ( ) ;
        if ( qi [ 0 ] == h - 1 && qi [ 1 ] == w - 1 ) {
          f = true ;
          System . out . println ( c - qi [ 2 ] - 1 ) ;
          break ;
        }
        int i = qi [ 0 ] ;
        int j = qi [ 1 ] ;
        addq ( i + 1 , j , qi [ 2 ] + 1 ) ;
        addq ( i , j + 1 , qi [ 2 ] + 1 ) ;
        addq ( i - 1 , j , qi [ 2 ] + 1 ) ;
        addq ( i , j - 1 , qi [ 2 ] + 1 ) ;
      }
      if ( ! f ) {
        System . out . println ( - 1 ) ;
      }
      return b ;
    }
    
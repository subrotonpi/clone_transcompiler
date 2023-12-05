public static int N ( Scanner input ) {
  int [ ] par = new int [ N ] ;
  int [ ] [ ] roads = new int [ M ] [ ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int x = input . nextInt ( ) ;
    int y = input . nextInt ( ) ;
    int year = input . nextInt ( ) ;
    roads [ i ] = new int [ ] {
      x - 1 , y - 1 , year }
      ;
    }
    Arrays . sort ( roads , new Comparator < int [ ] > ( ) {
      @ Override public int compare ( int [ ] o1 , int [ ] o2 ) {
        return o1 [ 2 ] - o2 [ 2 ] ;
      }
    }
    ) ;
    int Q = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] [ ] qs = new int [ Q ] [ ] ;
    for ( int i = 0 ;
    i < Q ;
    i ++ ) {
      int x = input . nextInt ( ) ;
      int year = input . nextInt ( ) ;
      qs [ i ] = new int [ ] {
        x - 1 , year , i }
        ;
      }
      Arrays . sort ( qs , new Comparator < int [ ] > ( ) {
        @ Override public int compare ( int [ ] o1 , int [ ] o2 ) {
          return o1 [ 1 ] - o2 [ 1 ] ;
        }
      }
      ) ;
      /* root */
      if ( par [ 0 ] < 0 ) {
        return 0 ;
      }
      else {
        par [ 0 ] = root ( par [ 0 ] ) ;
        /* get the number of the other numbers */
        int rx = - par [ root ( par [ 0 ] ) ] ;
        int ry = - par [ root ( par [ 0 ] ) ] ;
        if ( rx != ry ) {
          if ( getnum ( rx ) < getnum ( ry ) ) {
            rx = ry ;
            ry = rx ;
          }
          par [ rx ] += par [ ry ] ;
          par [ ry ] = rx ;
        }
      }
      for ( int i = 0 ;
      i < Q ;
      i ++ ) {
        while ( ( roads . length > 0 ) && ( qs [ i ] [ 1 ] < roads [ roads . length - 1 ] [ 2 ] ) ) {
          int [ ] tmp = roads . length ;
          connect ( tmp [ 0 ] , tmp [ 1 ] ) ;
        }
        qs [ i ] [ 0 ] = getnum ( qs [ i ] [ 0 ] ) ;
      }
      Arrays . sort
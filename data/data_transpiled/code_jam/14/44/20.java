public static int t = Integer . parseInt ( Scanner in ) {
  int t = in . nextInt ( ) ;
  {
    HashMap < String , Integer > map = new HashMap < String , Integer > ( ) ;
    for ( String w : L ) {
      for ( int i = 0 ;
      i < w . length ( ) + 1 ;
      i ++ ) {
        map . put ( w . substring ( 0 , i ) , 1 ) ;
      }
    }
    return map . size ( ) ;
  }
  {
    int [ ] val ;
    int [ ] ids ;
    if ( ( ids = in . nextInt ( ) ) == 0 ) {
      return new int [ 0 ] ;
    }
    val = extract ( ids , 1 , L ) ;
    val [ 0 ] = L . get ( ids [ 0 ] ) ;
    return val ;
  }
  {
    int [ ] val = new int [ ] {
      0 }
      ;
      for ( int i = 0 ;
      i < part . length ;
      i ++ ) {
        val [ i ] = in . nextInt ( ) ;
      }
      int [ ] [ ] part = new int [ m ] [ ] ;
      for ( int i = 0 ;
      i < m ;
      i ++ ) {
        part [ i ] = in . nextInt ( ) ;
      }
      int [ ] [ ] L = new int [ n ] [ ] ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        L [ i ] = in . nextInt ( ) ;
      }
      int worst = 0 ;
      int count = 0 ;
      for ( int mask = 0 ;
      mask < n * m ;
      mask ++ ) {
        part = new int [ n ] [ ] ;
        for ( int j = 0 ;
        j < n ;
        j ++ ) {
          part [ j ] = new int [ m ] ;
        }
        for ( int j = 0 ;
        j < m ;
        j ++ ) {
          part [ mask % n ] [ j ] = j ;
          mask /= n ;
        }
        int val = check ( part , L ) ;
        if ( val > worst ) {
          worst = val ;
          count = 1 ;
        }
        else if ( val == worst ) {
          count ++ ;
        }
      }
      System . out . println ( "Case #" + cas + ": " + worst + " " + count ) ;
    }
    for ( int i = 0 ;
    i < t ;
    i ++ ) {
      solve ( i + 1 ) ;
    }
    return t ;
  }
  
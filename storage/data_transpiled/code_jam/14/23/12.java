@ VisibleForTesting static Iterable < String > permutations ( ) {
  int T = input . nextInt ( ) ;
  int N = 0 ;
  {
    List < String > stack = new ArrayList < > ( ) ;
    stack . add ( perm . substring ( 0 , 1 ) ) ;
    int len = perm . length ( ) ;
    while ( len > 0 ) {
      String v = perm . substring ( 0 , 1 ) ;
      while ( len > 0 && ! adj . get ( stack . size ( ) - 1 ) . contains ( v ) ) {
        len -- ;
      }
      if ( len == 0 ) {
        return false ;
      }
      stack . add ( v ) ;
      len = perm . length ( ) ;
    }
    return true ;
  }
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    String ans = null ;
    N = Integer . parseInt ( input . nextLine ( ) ) ;
    int M = Integer . parseInt ( input . nextLine ( ) ) ;
    String [ ] zips = new String [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      zips [ i ] = input . substring ( i , i + 1 ) ;
    }
    Set < String > adj = new HashSet < > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      adj . add ( adj . get ( e [ 0 ] ) ) ;
    }
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      int [ ] e = map . get ( i ) ;
      for ( int j = 0 ;
      j < e . length ;
      j ++ ) {
        e [ j ] = Integer . parseInt ( input . nextLine ( ) ) - 1 ;
        adj . get ( e [ j ] ) . add ( e [ 1 ] ) ;
        adj . get ( e [ j ] ) . add ( e [ 0 ] ) ;
      }
      int v = 0 ;
      for ( int w = 0 ;
      w < zips . length ;
      w ++ ) {
        int z = zips [ w ] . length ( ) ;
        if ( z <= zips [ v ] ) {
          v = w ;
        }
      }
      for ( String [ ] perm : permutations ( perm ) ) {
        if ( perm [ 0 ] . compareTo ( v ) != 0 ) {
          continue ;
        }
        if ( legal ( perm , adj ) ) {
          String concat = StringUtils . join ( zips , "" ) ;
          if ( ans == null || concat . compareTo ( ans ) <= 0 ) {
            ans = concat ;
          }
        }
      }
    }
    System
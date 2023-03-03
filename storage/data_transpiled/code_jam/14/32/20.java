@ VisibleForTesting static int [ ] repeat ( String word ) {
  final int MOD = 1000000000 + 7 ;
  int [ ] enc = new int [ 27 ] ;
  for ( int i = 0 ;
  i < word . length ( ) ;
  i ++ ) {
    String l = word . substring ( i , i + 1 ) ;
    if ( enc . length == 0 ) {
      enc [ i ] = l ;
    }
    else if ( enc [ enc . length - 1 ] . equals ( l ) ) {
      continue ;
    }
    else if ( ! enc [ i ] . equals ( l ) ) {
      enc [ i ] = l ;
    }
    else {
      return - 1 ;
    }
  }
  int [ ] test = new int [ 27 ] ;
  for ( int i = 0 ;
  i < 40 ;
  i ++ ) {
    String let = word . substring ( i , i + 1 ) ;
    String curr = let ;
    while ( count < 40 ) {
      if ( ! curr . equals ( curr ) ) {
        return 1 ;
      }
      curr = curr . substring ( i , i + 1 ) ;
      count ++ ;
    }
  }
  {
    int [ ] chck = new int [ 40 ] ;
    int count = 0 ;
    for ( int i = 0 ;
    i < 40 ;
    i ++ ) {
      String let = word . substring ( i , i + 1 ) ;
      String curr = let ;
      if ( ! curr . equals ( let ) ) {
        continue ;
      }
      chck [ curr ] = "found" ;
      int derp = 0 ;
      while ( curr . equals ( let ) ) {
        curr = curr . substring ( i , i + 1 ) ;
        if ( chck [ curr ] . equals ( let ) ) {
          derp = 1 ;
          break ;
        }
        chck [ curr ] = "found" ;
      }
      if ( derp == 0 ) {
        count ++ ;
      }
    }
  }
  int T = Integer . parseInt ( scanner . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < xrange ( T ) ;
  i ++ ) {
    int N = Integer . parseInt ( scanner . nextLine ( ) ) ;
    BitSet trainset = new BitSet ( N ) ;
    String read = scanner . nextLine ( ) ;
    for ( String k : read . split ( " " ) ) {
      trainset . set ( k ) ;
    }
    int [ ] starts = new int [ N ] ;
    int [ ] mids = new int [ N ] ;
    int [ ] ends = new int [ N ] ;
    int [ ] flat = new int [ N ] ;
    ptr = new BitSet ( )
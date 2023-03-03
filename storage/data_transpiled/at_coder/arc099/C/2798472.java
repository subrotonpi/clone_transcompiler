public static int [ ] [ ] parse ( String input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] ROAD = new int [ M ] [ M ] ;
  for ( int i = 0 ;
  i < ROAD . length ;
  i ++ ) {
    ROAD [ i ] = new int [ ] {
      Integer . parseInt ( input . nextLine ( ) ) }
      ;
    }
    final int [ ] [ ] NOROAD = new int [ N + 1 ] [ ] ;
    for ( int i = 1 ;
    i < NUMBERING . length ;
    i ++ ) {
      NOROAD [ i ] = NUMBERS [ i ] [ 0 ] ;
    }
    int [ ] [ ] count = new int [ N + 1 ] [ ] ;
    for ( int i = 0 ;
    i < count . length ;
    i ++ ) {
      count [ i ] = new int [ N + 1 ] ;
    }
    for ( int i = 0 ;
    i < count . length ;
    i ++ ) {
      count [ i ] [ 0 ] = new int [ N + 1 ] ;
    }
    for ( int i = 0 ;
    i < count . length ;
    i ++ ) {
      count [ i ] [ 0 ] = new int [ N + 1 ] ;
    }
    DP [ 0 ] = new int [ N + 1 ] ;
    for ( int i = 0 ;
    i < count . length ;
    i ++ ) {
      DP [ i ] [ 1 ] = count [ i ] [ 2 ] ;
    }
    for ( int i = 1 ;
    i < count . length ;
    i ++ ) {
      for ( int k = 0 ;
      k < count . length ;
      k ++ ) {
        DP [ i ] [ 0 ] = new int [ N + 1 ] ;
      }
    }
    int [ ] [ ] GroupSORT = new int [ N + 1 ] [ ] ;
    for ( int i = 0 ;
    i < Group . length ;
    i ++ ) {
      GroupSORT [ i ] [ 1 ] = group [ i ] [ 1 ] ;
    }
    Arrays . sort ( GroupSORT , new Comparator < Integer > ( ) {
      @ Override public int compare ( Integer o1 , Integer o2 ) {
        int a = o1 . intValue ( ) ;
        int b = o2 . intValue ( ) ;
        if ( a != b ) {
          group [ i ] [ 0 ] = Math . min ( a , b ) ;
        }
        return a ;
      }
    }
    ) ;
    NUMBERING = new int [
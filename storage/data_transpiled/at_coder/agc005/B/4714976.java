public static int [ ] [ ] ints ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] l = new int [ n ] ;
  int [ ] r = new int [ n ] ;
  Stack < Integer > s = new Stack < > ( ) ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    int x = a [ i ] ;
    int left = i ;
    while ( s . size ( ) > 0 && x < s . peek ( ) . intValue ( ) ) {
      left = s . peek ( ) . intValue ( ) ;
      s . pop ( ) ;
    }
    l [ i ] = left ;
    s . push ( new Integer [ ] {
      x , left }
      ) ;
    }
    s . clear ( ) ;
    for ( int i = n - 1 ;
    i >= 0 ;
    i -- ) {
      int right = i ;
      int x = a [ i ] ;
      while ( s . size ( ) > 0 && x < s . peek ( ) . intValue ( ) ) {
        right = s . peek ( ) . intValue ( ) ;
        s . pop ( ) ;
      }
      r [ i ] = right ;
      s . push ( x , right ) ;
    }
    r = r . toArray ( ) ;
    int ans = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      final int x = a [ i ] ;
      final int left = i ;
      final int right = i ;
      ans += x * ( right + 1 - i ) * ( i + 1 - left ) ;
    }
    System . out . println ( ans ) ;
    return l ;
  }
  
@ Nullable public static int from ( @ NotNull String input ) {
  int n = Integer . parseInt ( input ) , h = Integer . parseInt ( input ) ;
  int [ ] [ ] ab = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ab [ i ] = Integer . parseInt ( input ) ;
  }
  int [ ] [ ] abArray = new int [ ab . length ] [ ] ;
  for ( int i = 0 ;
  i < abArray . length ;
  i ++ ) {
    abArray [ i ] = ab [ i ] [ 0 ] ;
    abArray [ i ] [ 0 ] = ab [ i ] [ 1 ] ;
  }
  Arrays . sort ( abArray , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer a , Integer b ) {
      return a . compareTo ( b ) ;
    }
  }
  ) ;
  int aMax = abArray [ 0 ] [ 0 ] ;
  int cnt = 0 ;
  damage = 0 ;
  for ( int i = 0 ;
  i < abArray . length ;
  i ++ ) {
    int value = abArray [ i ] [ 0 ] ;
    char katana = abArray [ i ] [ 1 ] ;
    if ( h <= 0 ) {
      System . out . println ( cnt ) ;
      exit ( ) ;
    }
    if ( katana == 'a' ) {
      cnt += Math . ceil ( h / value ) ;
      break ;
    }
    else {
      h -= value ;
      cnt ++ ;
    }
  }
  return aMax ;
}

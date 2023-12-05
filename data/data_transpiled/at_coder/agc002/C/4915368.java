public static int [ ] [ ] getNegativeInstances ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int L = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int [ ] [ ] aArray = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    aArray [ i ] = new int [ ] {
      a [ i ] + a [ i + 1 ] , i }
      ;
    }
    Arrays . sort ( aArray , new Comparator < int [ ] > ( ) {
      @ Override public int compare ( int [ ] o1 , int [ ] o2 ) {
        return o1 [ 0 ] - o2 [ 0 ] ;
      }
    }
    ) ;
    if ( aArray [ 0 ] [ 0 ] >= L ) {
      int n = aArray [ 0 ] [ 1 ] ;
      System . out . println ( "Possible" ) ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        System . out . println ( i + 1 ) ;
      }
      for ( int i = 0 ;
      i < N - 2 - n ;
      i ++ ) {
        System . out . println ( N - 1 - i ) ;
      }
      System . out . println ( n + 1 ) ;
    }
    else {
      System . out . println ( "Impossible" ) ;
    }
    return aArray ;
  }
  
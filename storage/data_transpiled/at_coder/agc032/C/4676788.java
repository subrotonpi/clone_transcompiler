public static int dfs ( int v , int first , int depth ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] count = new int [ N ] ;
  int [ ] [ ] E = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    E [ i ] = new int [ N ] ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      int a = Integer . parseInt ( input . nextLine ( ) ) ;
      int b = Integer . parseInt ( input . nextLine ( ) ) ;
      E [ a - 1 ] [ b - 1 ] = new int [ b ] ;
      E [ b - 1 ] [ a - 1 ] = new int [ a ] ;
      count [ a - 1 ] ++ ;
      count [ b - 1 ] ++ ;
    }
  }
  int countSum = 0 ;
  int count4 = 0 ;
  int count6 = 0 ;
  int node = 0 ;
  boolean [ ] check = new boolean [ N ] ;
  for ( int i = 0 ;
  i < count . length ;
  i ++ ) {
    int temp = count [ i ] ;
    if ( temp % 2 == 1 ) {
      System . out . println ( "No" ) ;
      exit ( ) ;
    }
    else {
      if ( temp >= 4 ) {
        count4 ++ ;
        check [ i ] = true ;
        node = i ;
      }
      if ( temp >= 6 ) {
        count6 ++ ;
      }
      countSum += temp ;
    }
  }
  int ret ;
  if ( count4 >= 3 || count6 >= 1 ) {
    System . out . println ( "Yes" ) ;
  }
  else if ( count4 == 2 ) {
    ret = dfs ( node , node , 0 ) ;
    if ( ret > 0 ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
  else {
    System . out . println ( "No" ) ;
  }
  return ret ;
}

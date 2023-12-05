public static int [ ] [ ] a ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] a = new int [ 3 ] [ 3 ] ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    int [ ] aa = new int [ 3 ] ;
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) aa [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    a [ i ] = aa ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = a [ 0 ] [ i ] , y = a [ 1 ] [ i ] , z = a [ 2 ] [ i ] ;
    x = x - y ;
    z = z - y ;
    if ( i % 2 == 0 ) {
      if ( y % 6 != 2 ) {
        System . out . println ( "No" ) ;
        exit ( ) ;
      }
    }
    else {
      if ( y % 6 != 5 ) {
        System . out . println ( "No" ) ;
        exit ( ) ;
      }
    }
    y = 0 ;
    if ( ( x = a [ 0 ] [ i ] ) != ( - 1 , 0 , 1 ) && ( x = a [ 2 ] [ i ] ) != ( 1 , 0 , - 1 ) ) {
      System . out . println ( "No" ) ;
      exit ( ) ;
    }
  }
  int e = 0 , o = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i % 2 == 0 ) {
      if ( a [ 0 ] [ i ] > a [ 2 ] [ i ] ) e ++ ;
      else {
        if ( a [ 0 ] [ i ] > a [ 2 ] [ i ] ) o ++ ;
      }
    }
    e %= 2 ;
    o %= 2 ;
    int [ ] el = new int [ n ] ;
    int [ ] ol = new int [ n ] ;
    int [ ] bite = new int [ n ] ;
    int [ ] bito = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( ( j % 2 == 0 ) != 0 ) {
        el [ j ] = a [ 1 ] [ i ] / 6 + 1 ;
        bite [ j ] = 0 ;
      }
      else {
        ol [ j ] = a [ 1 ] [ i ] / 6 + 1 ;
        bito [ j ] = 0 ;
      }
    }
  }
  return
public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] [ ] a = new int [ n ] [ n ] ;
  int [ ] b = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int p = Integer . parseInt ( input ) ;
    int q = Integer . parseInt ( input ) ;
    a [ i ] = new int [ p ] ;
    a [ i ] [ 0 ] = 0 ;
    a [ i ] [ 1 ] = 1 ;
  }
  Arrays . sort ( a , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return o2 . compareTo ( o1 ) ;
    }
  }
  ) ;
  int result = 0 ;
  int [ ] l = new int [ n ] ;
  int flag = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( l [ a [ i ] [ 1 ] ] == 1 ) {
      flag = 1 ;
      break ;
    }
    else {
      l [ a [ i ] [ 1 ] ] = 1 ;
    }
  }
  int t = a [ 0 ] [ 2 ] ;
  int s = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s += a [ i ] [ 2 ] - a [ 0 ] [ 2 ] ;
  }
  if ( s == 0 ) {
    flag = 1 ;
  }
  if ( flag == 1 ) {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      result += a [ i ] [ 0 ] ;
    }
    System . out . println ( result ) ;
  }
  else {
    if ( a [ n - 1 ] [ 1 ] == a [ n ] [ 1 ] ) {
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        result += a [ i ] [ 0 ] ;
      }
      result += Math . min ( a [ n + 1 ] [ 0 ] - a [ n - 1 ] [ 0 ] , a [ n ] [ 0 ] - a [ n - 2 ] [ 0 ] ) ;
      System . out . println ( result ) ;
    }
    else {
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        result += a [ i ] [ 0 ] ;
      }
      result += a [ n ] [ 0 ] - a [ n - 1 ] [ 0 ] ;
      System . out . println ( result ) ;
    }
  }
}

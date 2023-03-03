public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  Arrays . sort ( a ) ;
  int m = a [ a . length - 1 ] ;
  int f = 1 ;
  if ( m % 2 == 1 ) {
    int s = m / 2 + 1 ;
    int count = 0 ;
    if ( n == 2 ) {
      if ( a [ 0 ] != 1 || a [ 1 ] != 1 ) {
        f = 0 ;
      }
    }
    else if ( a [ 0 ] != s || a [ 2 ] == s ) {
      f = 0 ;
    }
    else {
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        if ( a [ i ] < s ) {
          continue ;
        }
        else if ( a [ i ] == s ) {
          if ( count == 0 ) {
            count = 1 ;
          }
          else {
            count = 0 ;
            s ++ ;
          }
        }
        else {
          f = 0 ;
          break ;
        }
      }
      if ( count == 1 ) {
        f = 0 ;
      }
    }
  }
  else {
    int s = m / 2 + 1 ;
    int count = 0 ;
    if ( a [ 0 ] != s - 1 || a [ 1 ] == s - 1 ) {
      f = 0 ;
    }
    else {
      for ( int i = 1 ;
      i < n ;
      i ++ ) {
        if ( a [ i ] < s ) {
          continue ;
        }
        else if ( a [ i ] == s ) {
          if ( count == 0 ) {
            count = 1 ;
          }
          else {
            count = 0 ;
            s ++ ;
          }
        }
        else {
          f = 0 ;
          break ;
        }
      }
      if ( count == 1 ) {
        f = 0 ;
      }
    }
  }
  if ( f == 1 ) {
    System . out . println ( "Possible" ) ;
  }
  else {
    System . out . println ( "Impossible" ) ;
  }
}

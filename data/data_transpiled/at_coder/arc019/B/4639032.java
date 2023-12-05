public static void print ( String a ) {
  int n = a . length ( ) ;
  if ( n == 1 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  int res = 0 ;
  if ( n % 2 == 1 ) {
    int k = n / 2 ;
    boolean judge = true ;
    for ( int i = 0 ;
    i < k ;
    i ++ ) {
      if ( a . charAt ( i ) != a . charAt ( n - 1 - i ) ) {
        judge = false ;
        break ;
      }
    }
    if ( judge ) {
      res = 0 ;
    }
    else {
      res = 25 ;
    }
    a = a . substring ( 0 , k ) + a . substring ( k + 1 ) ;
    n -- ;
  }
  int d = 0 ;
  int k = n / 2 ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    if ( a . charAt ( i ) != a . charAt ( n - 1 - i ) ) {
      d ++ ;
    }
  }
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    if ( d >= 2 ) {
      res += 50 ;
    }
    else if ( d == 1 ) {
      if ( a . charAt ( i ) == a . charAt ( n - 1 - i ) ) {
        res += 50 ;
      }
      else {
        res += 48 ;
      }
    }
    else {
      res += 50 ;
    }
  }
  System . out . println ( res ) ;
}

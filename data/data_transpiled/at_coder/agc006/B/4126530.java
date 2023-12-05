public static void print ( int n , int x ) {
  if ( x == 1 || x == 2 * n - 1 ) {
    System . out . println ( "No" ) ;
  }
  else {
    ArrayList < Integer > numli = new ArrayList < Integer > ( ) ;
    for ( int i = 1 ;
    i <= 2 * n ;
    i ++ ) {
      numli . add ( i ) ;
    }
    int [ ] displayli = new int [ 2 * n - 1 ] ;
    if ( n == 2 ) {
      if ( x == 2 ) {
        System . out . println ( "Yes" ) ;
        for ( int i = 0 ;
        i < 3 ;
        i ++ ) {
          System . out . println ( i + 1 ) ;
        }
      }
      else {
        System . out . println ( "No" ) ;
      }
    }
    else {
      int k = 0 ;
      if ( x == 2 ) {
        for ( int i = - 3 ;
        i <= 1 ;
        i ++ ) {
          if ( Math . abs ( i ) % 2 == 1 ) {
            displayli [ n + i ] = x - i - 1 ;
            numli . remove ( x - i - 1 ) ;
          }
          else {
            displayli [ n + i ] = x + i + 1 ;
            numli . remove ( x + i + 1 ) ;
          }
        }
        for ( int i = 2 * n - 1 ;
        i <= n ;
        i ++ ) {
          if ( n - 3 <= i && i <= n ) {
          }
          else {
            displayli [ i ] = numli [ k ] ;
            k ++ ;
          }
        }
      }
      else if ( x == 2 * n - 2 ) {
        for ( int i = - 2 ;
        i <= 2 ;
        i ++ ) {
          if ( Math . abs ( i ) % 2 == 1 ) {
            displayli [ n + i ] = x - i - 1 ;
            numli . remove ( x - i - 1 ) ;
          }
          else {
            displayli [ n + i ] = x + i + 1 ;
            numli . remove ( x + i + 1 ) ;
          }
        }
        for ( int i = 2 * n - 1 ;
        i <= n ;
        i ++ ) {
          if ( n - 2 <= i && i <= n + 1 ) {
          }
          else {
            displayli [ i ] = numli [ k ] ;
            k ++ ;
          }
        }
      }
      else {
        for ( int i = - 3 ;
        i <= 2 ;
        i ++ ) {
          if ( Math . abs ( i ) % 2 == 1 ) {
            displayli [ n
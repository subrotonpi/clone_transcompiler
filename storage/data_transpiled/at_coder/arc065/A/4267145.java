public static void input ( Scanner s ) {
  char [ ] t = s . toCharArray ( ) ;
  int i = 0 ;
  int k = s . length ( ) ;
  while ( i <= k - 5 ) {
    if ( k - i >= 7 ) {
      if ( t [ i ] != 'r' ) {
        if ( t [ i ] == 'maerd' ) {
          i += 5 ;
        }
        else if ( t [ i ] == 'esare' ) {
          i += 5 ;
        }
        else {
          i = k + 1 ;
        }
      }
      else {
        if ( t [ i ] == 'resare' ) {
          i += 6 ;
        }
        else if ( t [ i ] == 'remaerd' ) {
          i += 7 ;
        }
        else {
          i = k + 1 ;
        }
      }
    }
    else if ( k - i == 6 ) {
      if ( t [ i ] == 'resare' ) {
        i = k ;
      }
      else {
        i = k + 1 ;
      }
    }
    else {
      if ( t [ i ] == 'esare' ) {
        i = k ;
      }
      else if ( t [ i ] == 'maerd' ) {
        i = k ;
      }
      else {
        i = k + 1 ;
      }
    }
  }
  if ( i == k ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}

public static String print ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int [ ] m = new int [ 3 ] ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    m [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  String ret = "YES" ;
  if ( m [ n ] == 0 ) {
    ret = "NO" ;
  }
  else {
    Arrays . sort ( m ) ;
    if ( n == 300 ) {
      if ( Arrays . binarySearch ( m , n ) < 0 ) {
        ret = "NO" ;
      }
    }
    else {
      int tmp = ( m [ 2 ] - m [ 1 ] ) * ( m [ 1 ] - m [ 0 ] ) ;
      if ( m [ 2 ] < n && tmp == 1 ) {
        ret = "NO" ;
      }
      else if ( n == 299 ) {
        if ( tmp == 4 ) {
          ret = "NO" ;
        }
        else if ( Math . max ( m [ 2 ] % 3 , m [ 1 ] % 3 ) == 2 && m [ 1 ] % 3 * m [ 0 ] % 3 == 0 ) {
          ret = "NO" ;
        }
        else if ( m [ 2 ] % 3 == 0 && m [ 2 ] - m [ 1 ] == 1 ) {
          ret = "NO" ;
        }
        else if ( m [ 1 ] % 3 == 0 && m [ 1 ] - m [ 0 ] == 1 ) {
          ret = "NO" ;
        }
      }
      else if ( n == 298 ) {
        if ( m [ 0 ] - m [ 1 ] == 1 && m [ 0 ] % 3 == 0 ) {
          ret = "NO" ;
        }
        else if ( m [ 2 ] % 3 == 1 && tmp == 4 ) {
          ret = "NO" ;
        }
        else if ( m [ 2 ] % 3 == 1 && m [ 1 ] % 3 == 0 && m [ 1 ] - m [ 0 ] == 1 ) {
          ret = "NO" ;
        }
      }
    }
  }
  System . out . println ( ret ) ;
  return ret ;
}

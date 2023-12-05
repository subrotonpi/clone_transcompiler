public static int [ ] getNegativeInstances ( ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ Integer . parseInt ( input . nextLine ( ) ) ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  a = a [ a . length - 1 ] ;
  int c = 2 ;
  int d = 2 ;
  int res = 1 ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    if ( d < a [ i ] ) {
      res = - 1 ;
      break ;
    }
    if ( i != k - 1 ) {
      if ( c % a [ i ] != 0 || d % a [ i ] != 0 ) {
        res = - 1 ;
        break ;
      }
      else {
        d = d + a [ i ] - 1 ;
        int p = c % a [ i + 1 ] ;
        int q = d % a [ i + 1 ] ;
        int c2 ;
        if ( p == 0 ) c2 = c ;
        else c2 = c + a [ i + 1 ] - p ;
        int d2 = d - q ;
        if ( c2 <= d2 ) {
          c = c2 ;
          d = d2 ;
        }
        else {
          res = - 1 ;
          break ;
        }
      }
    }
    else {
      d = d + a [ i ] - 1 ;
    }
  }
  if ( res == - 1 ) {
    System . out . println ( - 1 ) ;
  }
  else {
    System . out . println ( Integer . toString ( c ) + " " + Integer . toString ( d ) ) ;
  }
  return a ;
}

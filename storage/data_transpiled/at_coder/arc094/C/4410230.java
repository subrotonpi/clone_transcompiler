public static void solve ( int n , int [ ] a , int [ ] b ) {
  int x = x0 = 10 * 10 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( b [ i ] < a [ i ] ) {
      x = Math . min ( x , b [ i ] ) ;
    }
  }
  if ( x == x0 ) {
    return ;
  }
  else {
    return Arrays . stream ( a ) . mapToInt ( x ) . sum ( ) - x ;
  }
  {
    n = Integer . parseInt ( input ( ) ) ;
    a = new int [ n ] ;
    b = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      String ai = input ( ) ;
      String bi = input ( ) ;
      a [ i ] = Integer . parseInt ( ai ) ;
      b [ i ] = Integer . parseInt ( bi ) ;
    }
    System . out . println ( solve ( n , a , b ) ) ;
  }
}

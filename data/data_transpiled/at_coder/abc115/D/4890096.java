public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] , p = new int [ n ] ;
  a [ 0 ] = 1 ;
  p [ 0 ] = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = a [ i ] * 2 + 3 ;
    p [ i ] = p [ i ] * 2 + 1 ;
  }
  /*if(n == 0) {
  return x <= 0? 0 : 1;
  } else if(x <= 1 + a[n - 1]) {
  return f(n - 1, x - 1);
  } else {
  return p[n - 1] + 1 + f(n - 1, x - 2 - a[n - 1]);
  }*/
  System . out . println ( f ( n , x ) ) ;
}

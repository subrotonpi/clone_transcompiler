public static int mod ( int mod ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] x = new int [ n ] ;
  int [ ] y = new int [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    x [ i ] = i * ( n - i ) ;
  }
  Arrays . sort ( x ) ;
  Arrays . sort ( y ) ;
  int x_sum = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    x_sum += ( x [ i ] - x [ i - 1 ] ) * i * ( n - i ) ;
    x_sum = x_sum % mod ;
  }
  return x_sum ;
}

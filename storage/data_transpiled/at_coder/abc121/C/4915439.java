public static int [ ] [ ] src ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) , m = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] src = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    src [ i ] = src [ i ] [ 0 ] ;
  }
  Arrays . sort ( src ) ;
  int sumPay = 0 ;
  while ( true ) {
    int a = src [ 0 ] [ 0 ] ;
    int b = src [ 0 ] [ 1 ] ;
    if ( m > b ) {
      sumPay += a * b ;
      m -= b ;
    }
    else {
      sumPay += a * m ;
      break ;
    }
  }
}

public static int A = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . readLine ( ) ) ;
  int B = Integer . parseInt ( input . readLine ( ) ) ;
  int C = Integer . parseInt ( input . readLine ( ) ) ;
  int D = Integer . parseInt ( input . readLine ( ) ) ;
  int E = Integer . parseInt ( input . readLine ( ) ) ;
  int F = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] water = new int [ 31 ] ;
  for ( int i = 0 ;
  i < water . length ;
  i ++ ) {
    if ( A * i >= F ) {
      break ;
    }
    for ( int j = 0 ;
    j < 16 ;
    j ++ ) {
      if ( 100 * ( A * i + B * j ) < F ) {
        water [ i ] = 100 * ( A * i + B * j ) ;
      }
      else {
        break ;
      }
    }
  }
  Arrays . sort ( water ) ;
  int [ ] sugar = new int [ 2 ] ;
  for ( int i = 0 ;
  i < sugar . length ;
  i ++ ) {
    sugar [ i ] = 100 * ( A * i + B ) ;
  }
  sugar [ 0 ] = 100 * ( A * i + B ) ;
  return sugar [ 0 ] ;
}

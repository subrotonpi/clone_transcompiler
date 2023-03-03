public static int [ ] [ ] getNegativeInstances ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int x = Integer . parseInt ( input . readLine ( ) ) ;
  if ( n == 2 && x == 2 ) {
    print ( "Yes" , * Arrays . asList ( 1 , 2 , 3 ) , "\n" ) ;
    exit ( ) ;
  }
  int [ ] [ ] a = new int [ 2 * n - 1 ] [ ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) a [ i ] = new int [ 2 * n ] ;
  a [ i ] [ 0 ] = x ;
  int [ ] f = new int [ 2 * n ] ;
  f [ x ] = 1 ;
  try {
    if ( x > 0 ) {
      ++ i ;
    }
  }
  catch ( Exception e ) {
  }
  return a ;
}

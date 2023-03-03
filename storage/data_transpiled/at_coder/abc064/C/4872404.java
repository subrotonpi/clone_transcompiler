public static void print ( int n ) {
  int [ ] a = Integer . parseInt ( input . nextLine ( ) ) ;
  Map x = new HashMap ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int t = Math . min ( a [ i ] / 400 , 8 ) ;
    if ( x . keySet ( ) . contains ( t ) ) x . put ( t , 1 ) ;
    else x . put ( t , 1 ) ;
  }
  int m = 0 ;
  int l = x . keySet ( ) . size ( ) ;
  int ans [ ] ;
  if ( 8 >= m ) {
    ans = new int [ ] {
      Math . max ( 1 , l - 1 ) , l - 1 + x . get ( 8 ) }
      ;
    }
  }
  
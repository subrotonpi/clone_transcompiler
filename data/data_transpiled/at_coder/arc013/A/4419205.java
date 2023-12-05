public static void print ( int n , int m , int l ) {
  int p = Integer . parseInt ( input . nextLine ( ) ) ;
  int q = Integer . parseInt ( input . nextLine ( ) ) ;
  int r = Integer . parseInt ( input . nextLine ( ) ) ;
  int case1 = ( n / p ) * ( m / q ) * ( l / r ) ;
  int case2 = ( n / p ) * ( m / r ) * ( l / q ) ;
  int case3 = ( n / q ) * ( m / r ) ;
  int case4 = ( n / r ) * ( m / p ) * ( l / r ) ;
  int case5 = ( n / r ) * ( m / q ) * ( l / p ) ;
  int case6 = ( n / r ) * ( m / q ) ;
  System . out . println ( max ( case1 , case2 , case3 , case4 , case5 , case6 ) ) ;
}

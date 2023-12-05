public static void input ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int w = 10007 ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i == 2 ) {
      a [ i ] = 1 ;
    }
    else if ( i > 2 ) {
      a [ i ] = a [ i - 1 ] + a [ i - 2 ] + a [ i - 3 ] ;
      a [ i ] %= w ;
    }
  }
  System . out . println ( a [ n - 1 ] ) ;
}

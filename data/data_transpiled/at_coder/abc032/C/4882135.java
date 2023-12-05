public static final int [ ] getStdOut ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int k = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] line = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) line [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  boolean flag = false ;
  int stack = 1 ;
  int start = 0 ;
  int ans = 0 ;
  int answer = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( line [ i ] == 0 ) {
      System . out . println ( n ) ;
      exit ( ) ;
    }
    if ( stack * line [ i ] <= k ) {
      stack *= line [ i ] ;
      ans ++ ;
    }
    else {
      answer = Math . max ( answer , ans ) ;
      stack *= line [ i ] ;
      ans ++ ;
      while ( stack > k && start <= i ) {
        stack /= line [ start ] ;
        start ++ ;
        ans -- ;
      }
    }
  }
  answer = Math . max ( ans , answer ) ;
  System . out . println ( answer ) ;
  return line ;
}

public static int [ ] getStdOut ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int k = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int m = 0 ;
  m < n ;
  m ++ ) {
    a [ m ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] > 0 ) {
      sum += a [ i ] ;
    }
  }
  int sei = 0 ;
  int fu = 0 ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    if ( a [ i ] > 0 ) {
      sei += a [ i ] ;
    }
    else {
      fu += a [ i ] ;
    }
    if ( a [ i - k ] > 0 ) {
      sei -= a [ i - k ] ;
    }
    else {
      fu -= a [ i - k ] ;
    }
  }
  zen = sei + fu ;
  if ( zen > 0 ) {
    ansli [ k ] = sum + fu ;
  }
  else {
    ansli [ k ] = sum - sei ;
  }
  return ansli ;
}

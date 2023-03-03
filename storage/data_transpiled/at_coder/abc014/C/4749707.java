public static int [ ] getans ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] ans = new int [ 1000001 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    ans [ a ] ++ ;
    try {
      ans [ b + 1 ] -- ;
    }
    catch ( Exception e ) {
    }
  }
  for ( int i = 1 ;
  i < 1000001 ;
  i ++ ) {
    ans [ i ] += ans [ i - 1 ] ;
  }
  return ans ;
}

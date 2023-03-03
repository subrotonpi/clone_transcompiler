public static int [ ] getans ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] ans = new int [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    ans [ a - 1 ] ++ ;
    ans [ b - 1 ] ++ ;
  }
  for ( int a : ans ) {
    System . out . println ( a ) ;
  }
  return ans ;
}

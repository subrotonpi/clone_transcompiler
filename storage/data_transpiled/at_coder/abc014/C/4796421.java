public static int [ ] ints ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] ans = new int [ 1000002 ] ;
  int [ ] lis = new int [ 1000002 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    ans [ a ] ++ ;
    ans [ b + 1 ] -- ;
  }
  for ( int i = 0 ;
  i < 1000001 ;
  i ++ ) lis [ i ] = ans [ i ] ;
  lis [ 0 ] = lis [ i ] ;
  return lis ;
}

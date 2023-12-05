static final int [ ] range ( int n ) {
  int [ ] lis = new int [ 10 * 6 + 2 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    lis [ a ] ++ ;
    lis [ b + 1 ] -- ;
  }
  int [ ] ans = new int [ 10 * 6 + 1 ] ;
  ans [ 0 ] = lis [ 0 ] ;
  for ( int i = 1 ;
  i < ans . length ;
  i ++ ) {
    ans [ i ] += lis [ i ] + ans [ i - 1 ] ;
  }
  System . out . println ( max ( ans ) ) ;
}

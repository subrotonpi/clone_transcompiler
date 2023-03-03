public static int N = Integer . parseInt ( input ) {
  int [ ] t = new int [ 1000002 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    t [ a ] ++ ;
    t [ b + 1 ] -- ;
  }
  for ( int i = 0 ;
  i < 1000001 ;
  i ++ ) {
    t [ i + 1 ] += t [ i ] ;
  }
  System . out . println ( max ( t ) ) ;
  return 0 ;
}

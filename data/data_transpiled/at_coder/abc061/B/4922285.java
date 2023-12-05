public static int [ ] readInput ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] backet = new int [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    backet [ a - 1 ] ++ ;
    backet [ b - 1 ] ++ ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( backet [ i ] ) ;
  }
  return backet ;
}

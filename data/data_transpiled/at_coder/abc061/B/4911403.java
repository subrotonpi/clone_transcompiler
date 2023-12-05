public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] nodes = new int [ N ] ;
  for ( int i = 0 ;
  i <= M ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    nodes [ a - 1 ] ++ ;
    nodes [ b - 1 ] ++ ;
  }
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    System . out . println ( nodes [ i ] ) ;
  }
  return N ;
}

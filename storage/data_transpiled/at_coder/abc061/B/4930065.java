public static int [ ] [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] listN = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) listN [ i ] = 0 ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    listN [ a - 1 ] ++ ;
    listN [ b - 1 ] ++ ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) System . out . println ( listN [ i ] ) ;
  return listN ;
}

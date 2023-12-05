@ VisibleForTesting static void heapSort ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] Q = new int [ C + 1 ] ;
  int [ ] p = new int [ C + 1 ] ;
  for ( int i = 0 ;
  i < C ;
  i ++ ) {
    Q [ i ] = i ;
  }
  int ans = 0 ;
  for ( int x = s , y = t , z = c ;
  x < N ;
  x ++ , y ++ ) {
    while ( Q [ x ] < x || Q [ x ] == x == p [ z ] ) {
      p [ z ] = 0 ;
      heapSort ( Q ) ;
    }
    p [ z ] = y ;
    heapSort ( Q , y ) ;
    ans = Math . max ( ans , Q . length ) ;
  }
  System . out . println ( ans ) ;
}

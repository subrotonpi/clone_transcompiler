public static void BITree ( int n ) {
  int size = n ;
  tree = new int [ n + 1 ] ;
  int sum = 0 ;
  for ( int i = 0 ;
  i < size ;
  i ++ ) {
    sum += i ;
  }
  int sum = 0 ;
  for ( int i = 0 ;
  i < size ;
  i ++ ) {
    sum += i ;
    while ( i > 0 ) {
      s += tree [ i ] ;
      sum -= i & - i ;
    }
  }
  int add = 0 ;
  for ( int i = 0 ;
  i < size ;
  i ++ ) {
    while ( i <= size ) {
      tree [ i ] += sum ;
      sum += i ;
    }
  }
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int a [ ] = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    b [ i ] = b [ i ] ;
  }
  bitree ( N + 1 ) ;
}

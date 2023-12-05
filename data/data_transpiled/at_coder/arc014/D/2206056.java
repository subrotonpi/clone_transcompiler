@ SafeVarargs public static void binarySearch ( String ... strings ) {
  int A = Integer . parseInt ( input ( strings ) ) ;
  int N = Integer . parseInt ( input ( strings ) ) ;
  int M = Integer . parseInt ( input ( strings ) ) ;
  List < Integer > L = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L . add ( Integer . parseInt ( input ( strings ) ) ) ;
  }
  List < Integer > D = new ArrayList < > ( ) ;
  for ( int i = 1 ;
  i < L . size ( ) ;
  i ++ ) {
    D . add ( L . get ( i ) - 1 ) ;
  }
  Collections . sort ( D ) ;
  int [ ] E = new int [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    E [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    E [ i + 1 ] = D . get ( i ) + E [ i ] ;
  }
  List ans = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int x = Integer . parseInt ( input ( strings ) ) ;
    int y = Integer . parseInt ( input ( strings ) ) ;
    int j = bisect ( D , x + y ) ;
    int res = E [ j ] + ( N - j - 1 ) * ( x + y ) + Math . min ( L . get ( 0 ) - 1 , x ) + Math . min ( A - L . get ( L . get ( L . size ( ) - 1 ) - 1 ) , y ) + N ;
    ans . add ( res ) ;
  }
  System . out . println ( ans ) ;
}

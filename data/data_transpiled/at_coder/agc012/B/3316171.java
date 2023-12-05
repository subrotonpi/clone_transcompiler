public static void paint ( int N , int M ) {
  int [ ] [ ] G = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) G [ i ] = new int [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    a = a - 1 ;
    b = b - 1 ;
    G [ a ] [ b ] = b ;
    G [ b ] [ a ] = a ;
  }
  int Q = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] C = new int [ Q ] [ Q ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int v = Integer . parseInt ( input . readLine ( ) ) ;
    int d = Integer . parseInt ( input . readLine ( ) ) ;
    int c = Integer . parseInt ( input . readLine ( ) ) ;
    C [ i ] [ v - 1 ] = ( v > 1 ) ? ( v - 1 ) : ( d > 1 ) ? ( v - 1 ) : ( d > 1 ) ? ( v - 1 ) : ( d > 1 ) ? ( v - 1 ) : ( d > 1 ) ? ( v - 1 ) : ( d > 1 ) ? ( v - 1 ) : ( d > 1 ) ? ( v - 1 ) : ( d > 1 ) ? ( v - 1 ) : ( d > 1 ) ? ( v - 1 ) : ( d > 1 ) ? ( v - 1 ) : ( d > 1 ) ? ( v - 1 ) : ( d > 1 ) ? ( v - 1 ) : ( d > 1 ) ? ( v - 1 ) : ( d > 1 ) ? ( v - 1 ) : ( d > 1 ) ? ( v - 1 ) : ( d > 1 ) ? ( v - 1 ) : ( d > 1 ) ? ( v - 1 ) : ( d > 1 ) ? ( v - 1 ) : ( d > 1 ) ? ( v - 1 ) : ( d > 1 ) ? ( v - 1 ) : ( d > 1 ) ? ( v - 1 ) : ( d > 1 ) ? ( v - 1 ) : ( d > 1 ) ? ( v - 1 ) : ( d > 1 ) ? ( v
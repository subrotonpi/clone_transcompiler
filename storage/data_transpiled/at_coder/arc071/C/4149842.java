public static void input ( ) {
  String S = input . nextLine ( ) ;
  String T = input . nextLine ( ) ;
  int N = S . length ( ) ;
  int M = T . length ( ) ;
  int [ ] Ss = new int [ N + 1 ] ;
  int [ ] Ts = new int [ M + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int temp ;
    if ( S . charAt ( i ) == 'A' ) temp = 1 ;
    else temp = - 1 ;
    Ss [ i + 1 ] = Ss [ i ] + temp ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int temp ;
    if ( T . charAt ( i ) == 'A' ) temp = 1 ;
    else temp = - 1 ;
    Ts [ i + 1 ] = Ts [ i ] + temp ;
  }
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int a = ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    int b = ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    int c = ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    int d = ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    if ( ( Ss [ b ] - Ss [ a - 1 ] - Ts [ d ] + Ts [ c - 1 ] ) % 3 == 0 ) System . out . println ( "YES" ) ;
    else System . out . println ( "NO" ) ;
  }
}

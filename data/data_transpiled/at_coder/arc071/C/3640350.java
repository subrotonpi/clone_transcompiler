public static int [ ] inpl ( ) {
  return inpl ( ) ;
  String S = input . nextLine ( ) ;
  String T = input . nextLine ( ) ;
  int [ ] typeS = new int [ 1 + S . length ( ) ] ;
  int [ ] typeT = new int [ 1 + T . length ( ) ] ;
  typeS [ 0 ] = typeT [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    int ctr = 2 ;
    if ( S . charAt ( i ) == 'A' ) ctr = 1 ;
    typeS [ i + 1 ] = ( typeS [ i ] + ctr ) % 3 ;
  }
  for ( int i = 0 ;
  i < T . length ( ) ;
  i ++ ) {
    int ctr = 2 ;
    if ( T . charAt ( i ) == 'A' ) ctr = 1 ;
    typeT [ i + 1 ] = ( typeT [ i ] + ctr ) % 3 ;
  }
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int a = inpl ( ) ;
    int b = inpl ( ) ;
    int c = inpl ( ) ;
    int d = inpl ( ) ;
    if ( ( typeS [ b ] - typeS [ a - 1 ] ) % 3 == ( typeT [ d ] - typeT [ c - 1 ] ) % 3 ) System . out . println ( "YES" ) ;
    else System . out . println ( "NO" ) ;
  }
  return typeS ;
}

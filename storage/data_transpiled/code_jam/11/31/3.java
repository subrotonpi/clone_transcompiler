public static void main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int T = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int test = 1 ;
  test <= T ;
  test ++ ) {
    final int N = Integer . parseInt ( input . nextLine ( ) ) ;
    final int M = Integer . parseInt ( input . nextLine ( ) ) ;
    final String [ ] C = new String [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      C [ i ] = input . nextLine ( ) ;
    }
    boolean ok = true ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      for ( int j = 0 ;
      j < M ;
      j ++ ) {
        if ( C [ i ] . charAt ( j ) == '#' ) {
          if ( i + 1 >= N || j + 1 >= M || C [ i + 1 ] . charAt ( j ) != '#' || C [ i ] . charAt ( j + 1 ) != '#' || C [ i + 1 ] . charAt ( j + 1 ) != '#' ) {
            ok = false ;
            break ;
          }
          C [ i ] = C [ i ] . substring ( 0 , j ) + "/\\" + C [ i ] . substring ( j + 2 ) ;
          C [ i + 1 ] = C [ i + 1 ] . substring ( 0 , j ) + "\\/" + C [ i + 1 ] . substring ( j + 2 ) ;
        }
      }
      if ( ! ok ) break ;
    }
    System . out . println ( "Case #" + test + ":" ) ;
    if ( ! ok ) System . out . println ( "Impossible" ) ;
    else System . out . println ( Arrays . toString ( C ) ) ;
  }
}

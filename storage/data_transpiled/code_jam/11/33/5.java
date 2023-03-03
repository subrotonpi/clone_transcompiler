static void main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int T = input . nextInt ( ) ;
  for ( int test = 1 ;
  test <= T ;
  test ++ ) {
    final int N = Integer . parseInt ( input . nextLine ( ) ) ;
    final int L = input . nextInt ( ) ;
    final int H = input . nextInt ( ) ;
    final int [ ] v = Integer . parseInt ( input . nextLine ( ) ) ;
    assert v . length == N ;
    boolean found = false ;
    for ( int i = L ;
    i <= H ;
    i ++ ) {
      boolean ok = true ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        if ( ! v [ j ] % i == 0 && ! i % v [ j ] == 0 ) {
          ok = false ;
          break ;
        }
      }
      if ( ok ) {
        found = true ;
        System . out . println ( "Case #" + test + ": " + i ) ;
        break ;
      }
    }
    if ( ! found ) {
      System . out . println ( "Case #" + test + ": NO" ) ;
    }
  }
}

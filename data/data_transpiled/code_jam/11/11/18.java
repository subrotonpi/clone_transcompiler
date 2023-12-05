static final Scanner scanner = new Scanner ( System . in ) {
  @ Override public void next ( ) {
    final int T = Integer . parseInt ( scanner . nextLine ( ) ) ;
    for ( int i = 0 ;
    i < T ;
    i ++ ) {
      boolean possible = true ;
      String [ ] ss = scanner . nextLine ( ) . split ( "\\s+" ) ;
      final int N = Integer . parseInt ( ss [ 0 ] ) ;
      final int Pd = Integer . parseInt ( ss [ 1 ] ) ;
      final int Pg = Integer . parseInt ( ss [ 2 ] ) ;
      if ( Pg == 100 && Pd < 100 ) possible = false ;
      if ( Pg == 0 && Pd != 0 ) possible = false ;
      if ( N == 0 && Pd > 0 ) possible = false ;
      if ( 0 < N && N < 100 && possible ) {
        boolean found = false ;
        for ( int n = 1 ;
        n <= N ;
        n ++ ) {
          if ( n * Pd % 100 == 0 ) {
            found = true ;
            break ;
          }
        }
        possible = found ;
      }
      System . out . println ( "Case #" + ( i + 1 ) + ": " + ( possible ? "Possible" : "Broken" ) ) ;
    }
  }
}

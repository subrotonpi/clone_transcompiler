static final Scanner solve = new Scanner ( System . in ) {
  @ Override public void next ( ) {
    final Scanner scanner = new Scanner ( System . in ) ;
    scanner . nextLine ( ) ;
    if ( scanner . hasNextInt ( ) ) {
      System . out . println ( "specify input file" ) ;
      exit ( ) ;
    }
    final long numCases = scanner . nextLong ( ) ;
    for ( int caseNo = 0 ;
    caseNo < numCases ;
    caseNo ++ ) {
      scanner . nextLine ( ) ;
      scanner . nextLine ( ) ;
      scanner . nextLine ( ) ;
      scanner . nextLine ( ) ;
      scanner . nextLine ( ) ;
      scanner . nextLine ( ) ;
      scanner . nextLine ( ) ;
      scanner . nextLine ( ) ;
      scanner . nextLine ( ) ;
      scanner . close ( ) ;
      scanner . close ( ) ;
      scanner . close ( ) ;
      scanner . close ( ) ;
      scanner . close ( ) ;
      scanner . close ( ) ;
      scanner . close ( ) ;
      scanner . close ( ) ;
      scanner . close ( ) ;
      scanner . close ( ) ;
      scanner . close ( ) ;
      scanner . close ( ) ;
      scanner . close ( ) ;
      scanner . close ( ) ;
      scanner . close ( ) ;
      scanner . close ( ) ;
      scanner . close ( ) ;
      scanner . close ( ) ;
      scanner . close ( ) ;
      scanner . close ( ) ;
      scanner . close ( ) ;
    }
  }
  private static void solve ( ) {
    final int N = Integer . parseInt ( scanner . nextLine ( ) ) ;
    final int K = Integer . parseInt ( scanner . nextLine ( ) ) ;
    final int [ ] board = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    ++ i ) {
      board [ i ] = scanner . nextLine ( ) ;
    }
    assert N == board . length ;
    assert Arrays . equals ( board , scanner . nextLine ( ) ) ;
    int m = 0 ;
    for ( int i = 0 , j = 0 ;
    i < N ;
    ++ j ) {
      int [ ] diag = new int [ N - max ( i , j ) ] ;
      for ( int k = 0 ;
      k < diag . length ;
      ++ k ) diag [ j ] = board [ i + k ] [ j + k ] ;
      int mc = scanner . next ( ) ;
      m = Math . max ( mc , m ) ;
    }
  }
}

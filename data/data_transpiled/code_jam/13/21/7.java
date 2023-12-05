static void print ( ) throws IOException {
  final BufferedReader fin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final int T = Integer . parseInt ( fin . readLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    final int A = Integer . parseInt ( fin . readLine ( ) ) ;
    final int N = Integer . parseInt ( fin . readLine ( ) ) ;
    final List < Integer > motes = new LinkedList < Integer > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      motes . add ( Integer . parseInt ( fin . readLine ( ) ) ) ;
    }
    final int limit = motes . size ( ) ;
    final int limit1 = limit + 1 ;
    Collections . sort ( motes ) ;
    final int [ ] last = new int [ limit1 ] ;
    last [ 0 ] = A ;
    for ( int mote : motes ) {
      final int [ ] current = new int [ limit1 ] ;
      for ( int used = 0 , size = last . length ;
      used < size ;
      used ++ ) {
        int newsize = size ;
        for ( int moves = used ;
        moves < limit1 ;
        moves ++ ) {
          if ( newsize > mote ) {
            current [ moves ] = Math . max ( current [ moves ] , newsize + mote ) ;
          }
          newsize = newsize * 2 - 1 ;
        }
        if ( used < limit ) {
          current [ used + 1 ] = Math . max ( current [ used + 1 ] , size ) ;
        }
      }
      last = current ;
    }
    int best = 0 ;
    for ( int used = 0 , size = last . length ;
    used < size ;
    used ++ ) {
      if ( last [ used ] > 0 ) {
        best = last [ used ] ;
        break ;
      }
    }
    System . out . println ( "Case #" + testCase + ": " + best ) ;
  }
}

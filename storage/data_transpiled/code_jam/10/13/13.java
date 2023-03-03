@ task ( task = "C" ) public static void main ( String TASK ) {
  System . out . println ( "Precalculation..." ) ;
  final int NUM = 1000001 ;
  int [ ] top = new int [ NUM ] ;
  int [ ] btm = new int [ NUM ] ;
  int cbtm = 0 ;
  for ( int i = 1 ;
  i < NUM ;
  i ++ ) {
    if ( top [ cbtm ] < i ) cbtm ++ ;
    btm [ i ] = cbtm ;
    top [ i ] = cbtm + i ;
  }
  System . out . println ( "Precalculation done." ) ;
  try {
    BufferedReader in = new BufferedReader ( new FileReader ( TASK + ".in" ) ) ;
    PrintWriter out = new PrintWriter ( TASK + ".out" , true ) ;
    int cases = Integer . parseInt ( in . readLine ( ) ) ;
    for ( int ncase = 0 ;
    ncase < cases ;
    ncase ++ ) {
      int A1 = ( Integer ) in . readLine ( ) ;
      int A2 = ( Integer ) in . readLine ( ) ;
      int B1 = ( Integer ) in . readLine ( ) ;
      int B2 = ( Integer ) in . readLine ( ) ;
      int lost = 0 ;
      System . out . println ( "Now:" + ncase + 1 ) ;
      for ( int i = A1 ;
      i <= A2 ;
      i ++ ) {
        int b = Math . max ( B1 , btm [ i - 1 ] + 1 ) ;
        int t = Math . min ( B2 , top [ i - 1 ] + 1 ) ;
        lost += Math . max ( 0 , t - b + 1 ) ;
      }
      out . println ( "Case #" + ( ncase + 1 ) + ": " + ( ( A2 - A1 + 1 ) * ( B2 - B1 + 1 ) - lost ) ) ;
    }
  }
  catch ( IOException e ) {
    e . printStackTrace ( ) ;
  }
  finally {
    try {
      in . close ( ) ;
    }
    catch ( IOException e ) {
      e . printStackTrace ( ) ;
    }
  }
  System . out . println ( "Ready" ) ;
}

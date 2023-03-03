public static void memoized ( final Runnable runnable ) {
  final Map < Integer , Integer > mem = new HashMap < Integer , Integer > ( ) ;
  final int LG = AI . gen - 1 ;
  final Set < Integer > threats = ( Set < Integer > last ) -> {
    if ( last . nbs . isEmpty ( ) ) {
      mem . put ( last . nbs . isEmpty ( ) , runnable ) ;
    }
    return mem . get ( last . nbs . isEmpty ( ) ? last . nbs : last . nbs ) ;
  }
  ;
  final String TASK = "D" ;
  class Planet {
    int ncase ;
    public Planet {
      int nc = ncase + 1 ;
      public Planet {
        int C = LG ;
        public Planet {
          int T = Math . max ( Math . max ( Math . max ( Math . max ( Math . max ( Math . max ( Math . min ( Math . min ( N , NZ ) ) , NZ ) ) , NZ ) , NZ ) , NZ ) ) ;
          return C ;
        }
      }
    }
    public String toString ( ) {
      return "<Planet #" + ncase + ">" ;
    }
    public boolean update ( int gen ) {
      if ( gen != NZ && gen < NZ ) {
        return false ;
      }
      else {
        gen = NZ ;
        return true ;
      }
    }
  }
  System . out . println ( "Calculation..." ) ;
  try {
    BufferedReader in = new BufferedReader ( new FileReader ( TASK + ".in" ) ) ;
    PrintWriter out = new PrintWriter ( TASK + ".out" , true ) ;
    int cases = Integer . parseInt ( in . readLine ( ) ) ;
    for ( int ncase = 0 ;
    ncase < cases ;
    ncase ++ ) {
      System . out . println ( "Test #" + ncase + "" ) ;
      int P = ( Integer ) in . readLine ( ) ;
      int W = ( Integer ) in . readLine ( ) ;
      Planet [ ] planets = new Planet [ Range . N ] ;
      for ( int i = 0 ;
      i < Planet . N ;
      i ++ ) {
        planets [ i ] = new Planet ( i ) ;
      }
      Planet earth = planets [ 0 ] ;
      Planet AI = planets [ 1 ] ;
      for ( String s : in . readLine ( ) . split ( " " ) ) {
        int x = ( Integer ) in . readLine ( ) . split (
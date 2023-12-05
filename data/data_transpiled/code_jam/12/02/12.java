static final List < Integer > ints = new ArrayList < Integer > ( ) {
  {
    for ( String line : System . console ( ) . readLine ( ) . split ( " " ) ) {
      for ( String word : line . split ( " " ) ) {
        add ( Integer . parseInt ( word ) ) ;
      }
    }
    return null ;
  }
  public static void getInt ( ) {
    int T = Integer . parseInt ( "" ) ;
    for ( int t = 0 ;
    t < T ;
    t ++ ) {
      int N = Integer . parseInt ( "" ) ;
      int S = Integer . parseInt ( "" ) ;
      int p = Integer . parseInt ( "" ) ;
      int total = 0 ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        int val = Integer . parseInt ( "" + i ) ;
        if ( val > 3 * p - 3 ) total = total + 1 ;
        else if ( val > 3 * p - 5 && S > 0 && val > 0 ) {
          total = total + 1 ;
          S = S - 1 ;
        }
      }
      System . out . println ( "Case #" + ( t + 1 ) + ": " + total + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " ;
    }
    
static final String solve ( String in , String out ) throws IOException {
  final String in = in . substring ( 0 , in . length ( ) - 1 ) ;
  final String outp = in . substring ( in . lastIndexOf ( "." ) + 1 ) + ".out" ;
  @ SuppressWarnings ( {
    "rawtypes" , "unchecked" }
    ) final Comparator < Tuple > unhappiness = new Comparator < Tuple > ( ) {
      @ Override public int compare ( Tuple o1 , Tuple o2 ) {
        int res = 0 ;
        for ( Tuple c : o1 . v1 ) {
          Tuple t1 = c . v1 ;
          Tuple t2 = c . v2 ;
          int dx = Math . abs ( t1 . x - t2 . x ) ;
          int dy = Math . abs ( t1 . y - t2 . y ) ;
          if ( dx == 0 && dy == 1 ) res ++ ;
          if ( dx == 1 && dy == 0 ) res ++ ;
        }
        return res ;
      }
    }
    ;
    @ SuppressWarnings ( {
      "rawtypes" , "unchecked" }
      ) final Comparator < Tuple > solve = new Comparator < Tuple > ( ) {
        @ Override public int compare ( Tuple o1 , Tuple o2 ) {
          return Math . min ( unhappiness . compare ( o1 , o2 ) , n ) ;
        }
      }
      ;
      try ( BufferedReader in = new BufferedReader ( new FileReader ( in ) ) , PrintWriter out = new PrintWriter ( out ) ) {
        int cases = Integer . parseInt ( in ) ;
        for ( int c = 0 ;
        c < cases ;
        c ++ ) {
          int r = Integer . parseInt ( in . readLine ( ) ) ;
          int cc = Integer . parseInt ( in . readLine ( ) ) ;
          int n = in . readLine ( ) ;
          out . println ( "Case #" + ( c + 1 ) + ": " + solve . compare ( r , cc , n ) ) ;
        }
      }
    }
    
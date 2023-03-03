public static final String getUpperCaseString ( ) throws IOException {
  BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  int T = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    int N = Integer . parseInt ( br . readLine ( ) ) ;
    int M = Integer . parseInt ( br . readLine ( ) ) ;
    int [ ] [ ] grassLengths = new int [ N ] [ N ] ;
    for ( int nn = 0 ;
    nn < N ;
    nn ++ ) {
      grassLengths [ nn ] [ nn ] = Integer . parseInt ( br . readLine ( ) ) ;
    }
    int [ ] xMax = new int [ M ] ;
    int [ ] yMax = new int [ N ] ;
    for ( int xx = 0 ;
    xx < M ;
    xx ++ ) {
      for ( int yy = 0 ;
      yy < N ;
      yy ++ ) {
        int height = grassLengths [ yy ] [ xx ] ;
        xMax [ xx ] = Math . max ( xMax [ xx ] , height ) ;
        yMax [ yy ] = Math . max ( yMax [ yy ] , height ) ;
      }
    }
    boolean impossible = false ;
    for ( int xx = 0 ;
    xx < M ;
    xx ++ ) {
      for ( int yy = 0 ;
      yy < N ;
      yy ++ ) {
        int height = grassLengths [ yy ] [ xx ] ;
        if ( ( xMax [ xx ] > height ) && ( yMax [ yy ] > height ) ) {
          impossible = true ;
        }
      }
    }
    System . out . println ( "Case #" + ( t + 1 ) + ":" + ( impossible ? "NO" : "YES" ) ) ;
  }
  return null ;
}

public static void readInput ( BufferedReader inp ) throws IOException {
  PrintStream outp = new PrintStream ( "output.txt" ) ;
  int T = Integer . parseInt ( inp . readLine ( ) ) ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    int N = Integer . parseInt ( inp . readLine ( ) ) ;
    int K = Integer . parseInt ( inp . readLine ( ) ) ;
    String [ ] S = Arrays . stream ( inp . readLine ( ) . trim ( ) . replace ( "." , "" ) . replaceAll ( "\\s+" , "" ) ) . map ( x -> x . substring ( 0 , N ) ) . toArray ( ) ;
    int [ ] [ ] ls = new int [ N ] [ 2 ] ;
    int [ ] [ ] rs = new int [ N ] [ 2 ] ;
    int [ ] [ ] ts = new int [ N ] [ 2 ] ;
    Set < String > fins = new HashSet < String > ( ) ;
    for ( String s : S ) {
      int [ ] bs = new int [ 2 ] ;
      bs [ 0 ] = '0' ;
      int [ ] lsn = new int [ 2 ] ;
      int [ ] [ ] rsn = new int [ 2 ] ;
      for ( int y = 0 ;
      y < N ;
      y ++ ) {
        if ( bs [ 1 ] == s . charAt ( y ) ) {
          bs [ 0 ] ++ ;
        }
        else {
          bs [ 0 ] = 1 ;
          bs [ 1 ] = s . charAt ( y ) ;
        }
        if ( ts [ y ] [ 1 ] == s . charAt ( y ) ) {
          ts [ y ] [ 0 ] ++ ;
        }
        else {
          ts [ y ] [ 0 ] = 1 ;
          ts [ y ] [ 1 ] = s . charAt ( y ) ;
        }
        if ( y == 0 ) {
          lsn [ 0 ] = new int [ ] {
            1 , s . charAt ( y ) }
            ;
          }
          else if ( ls [ y - 1 ] [ 1 ] == s . charAt ( y ) ) {
            lsn [ 0 ] = new int [ ] {
              ls [ y - 1 ] [ 0 ] + 1 , s . charAt ( y ) }
              ;
            }
            else {
              lsn [ 0 ] = new int [ ] {
                1 , s . charAt ( y ) }
                ;
              }
              if ( y == N - 1 ) {
                rsn [ 1 ] = new int [ ] {
                  1 , s . charAt ( y ) }
                  ;
                }
                else
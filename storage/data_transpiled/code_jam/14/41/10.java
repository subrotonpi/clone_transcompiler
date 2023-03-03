@ Sys public static void Sys ( ) throws IOException {
  int T = Integer . parseInt ( stdin . readLine ( ) ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    int N = Integer . parseInt ( stdin . readLine ( ) ) , X = Integer . parseInt ( stdin . readLine ( ) ) ;
    List < Integer > S = new ArrayList < > ( ) ;
    for ( String word : stdin . readLine ( ) . split ( " " ) ) {
      S . add ( Integer . parseInt ( word ) ) ;
    }
    int y0 = 0 ;
    int y1 = N / 2 + 1 ;
    while ( y1 - y0 > 1 ) {
      int y = ( y1 + y0 ) / 2 ;
      if ( Arrays . binarySearch ( S . get ( i ) + S . get ( 2 * y - 1 - i ) , X ) >= 0 ) y0 = y ;
      else y1 = y ;
    }
    System . out . println ( "Case #" + t + ":" + ( N - y0 ) ) ;
  }
}

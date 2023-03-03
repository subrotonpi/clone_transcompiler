public static void try ( BufferedReader br ) {
  int cases = Integer . parseInt ( br . readLine ( ) ) ;
  String [ ] lines = br . readLine ( ) . split ( " " ) ;
  for ( int i = 0 ;
  i < cases ;
  i ++ ) {
    String k = lines [ i ] . trim ( ) ;
    String c = lines [ i ] . trim ( ) ;
    String s = lines [ i ] . trim ( ) ;
    k = Integer . parseInt ( k ) ;
    c = Integer . parseInt ( c ) ;
    s = Integer . parseInt ( s ) ;
    if ( c * s < k ) {
      System . out . println ( "Case #" + ( i + 1 ) + ": IMPOSSIBLE" ) ;
    }
    else {
      int [ ] nums = new int [ c * s ] ;
      for ( int j = 0 ;
      j < k ;
      j += c ) {
        int n = j ;
        for ( int l = 1 ;
        l < c ;
        l ++ ) {
          n *= k ;
          n += Math . min ( j + l , k - 1 ) ;
        }
        nums [ j ] = n + 1 ;
      }
      System . out . println ( "Case #" + ( i + 1 ) + ": " + Arrays . toString ( nums ) ) ;
    }
  }
}

public static final String getSortingOutput ( ) throws IOException {
  File file = new File ( "A-large.in" ) ;
  BufferedReader in = new BufferedReader ( new FileReader ( file ) ) ;
  PrintWriter out = new PrintWriter ( file ) ;
  int Cases = Integer . parseInt ( in . readLine ( ) ) ;
  for ( int T = 0 ;
  T < Cases ;
  T ++ ) {
    Arrays . stream ( in . readLine ( ) . split ( "\\s+" ) ) . forEach ( j -> {
      int N = Integer . parseInt ( j ) ;
      int K = Integer . parseInt ( j ) ;
      int [ ] [ ] C = new int [ N ] [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        C [ i ] [ 0 ] = Integer . parseInt ( j ) ;
      }
      Arrays . sort ( C ) ;
      Arrays . sort ( C ) ;
      int maxR = 0 ;
      int side = 0 ;
      for ( int i = 0 ;
      i < K - 1 ;
      i ++ ) {
        maxR = Math . max ( maxR , C [ i ] [ 0 ] ) ;
        side += C [ i ] [ 2 ] ;
      }
      int cura = maxR * maxR + side ;
      int maxA = cura ;
      for ( int i = K - 1 ;
      i < N ;
      i ++ ) {
        maxA = Math . max ( maxA , cura + C [ i ] [ 2 ] + Math . max ( 0 , C [ i ] [ 0 ] * C [ i ] [ 0 ] - maxR * maxR ) ) ;
      }
      String ret = String . valueOf ( Math . PI * maxA ) ;
      ret = "Case #" + ( T + 1 ) + ": " + ret ;
      System . out . println ( ret ) ;
      out . println ( ret ) ;
    }
    ) ;
  }
  in . close ( ) ;
  out . close ( ) ;
}

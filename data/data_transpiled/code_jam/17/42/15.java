static void loadFile ( ) throws IOException {
  final String inname = "input.txt" ;
  final String outname = "output.txt" ;
  try ( BufferedReader br = new BufferedReader ( new FileReader ( inname ) ) ) {
    int cases = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int tc = 1 ;
    tc <= cases ;
    tc ++ ) {
      String [ ] line = br . readLine ( ) . split ( "\\s+" ) ;
      final int N = Integer . parseInt ( line [ 0 ] ) ;
      final int C = Integer . parseInt ( line [ 1 ] ) ;
      final int M = Integer . parseInt ( line [ 2 ] ) ;
      final int Cnum [ ] = new int [ C ] ;
      final int Nnum [ ] = new int [ N ] ;
      for ( int i = 0 ;
      i < M ;
      i ++ ) {
        line = br . readLine ( ) . split ( "\\s+" ) ;
        final int p = Integer . parseInt ( line [ 0 ] ) ;
        final int b = Integer . parseInt ( line [ 1 ] ) ;
        Nnum [ p - 1 ] ++ ;
        Cnum [ b - 1 ] ++ ;
      }
      final int Nsum [ ] = new int [ N + 1 ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        Nsum [ i + 1 ] = Nsum [ i ] + Nnum [ i ] ;
      }
      int y = 0 ;
      for ( int i = 0 ;
      i < C ;
      i ++ ) {
        if ( Cnum [ i ] > y ) y = Cnum [ i ] ;
      }
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        final int a = Math . ceil ( Nsum [ i + 1 ] / ( i + 1 ) ) ;
        if ( a > y ) y = a ;
      }
      int z = 0 ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        if ( Nnum [ i ] > y ) z += Nnum [ i ] - y ;
      }
      System . out . println ( "Case #" + tc + ": " + y + " " + z ) ;
    }
  }
}

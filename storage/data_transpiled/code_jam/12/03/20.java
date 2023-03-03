static void f = new BufferedReader ( new FileReader ( "C-small-attempt0.in" ) ) throws IOException {
  PrintWriter g = new PrintWriter ( new FileWriter ( "Csm.txt" ) ) ;
  int T = Integer . parseInt ( f . readLine ( ) . trim ( ) ) ;
  {
    int [ ] sh = new int [ 1 ] ;
    int [ ] n1 = new int [ N - 1 ] ;
    for ( int j = 0 ;
    j < sh . length ;
    j ++ ) sh [ j ] = 1 ;
    int [ ] j10 = new int [ sh . length ] ;
    for ( int j = 0 ;
    j < sh . length ;
    j ++ ) j10 [ j ] = 10 * sh [ j ] ;
    int [ ] r10 = new int [ sh . length ] ;
    for ( int j = 0 ;
    j < sh . length ;
    j ++ ) r10 [ j ] = 10 ;
    int res = 0 ;
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      s = f . readLine ( ) . trim ( ) ;
      int A = Integer . parseInt ( s [ 0 ] ) ;
      int B = Integer . parseInt ( s [ 1 ] ) ;
      int N = s [ 0 ] . length ( ) ;
      res = solve ( A , B , N ) ;
      g . println ( ) ;
    }
  }
}

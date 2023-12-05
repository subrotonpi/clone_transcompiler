public static void fin ( File file ) throws IOException {
  File fout = new File ( file , "largeA.in" ) ;
  FileWriter fw = new FileWriter ( file , true ) ;
  for ( int tc = 0 ;
  tc < xrange ( Integer . parseInt ( fin . readLine ( ) ) ) ;
  tc ++ ) {
    int R = Integer . parseInt ( fin . readLine ( ) ) ;
    int C = Integer . parseInt ( fin . readLine ( ) ) ;
    int W = Integer . parseInt ( fin . readLine ( ) ) ;
    int ans = ( R - 1 ) * ( C / W ) ;
    int tmp = C ;
    while ( tmp >= W * 2 ) {
      ans ++ ;
      tmp -= W ;
    }
    ans += Math . min ( tmp , W + 1 ) ;
    System . out . println ( "Case #" + ( tc + 1 ) + ": " + ans ) ;
    fw . write ( "Case #" + ( tc + 1 ) + ": " + ans + "\n" ) ;
  }
}

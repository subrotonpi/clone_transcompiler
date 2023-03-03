public static void read ( File fin ) throws IOException {
  BufferedReader br = new BufferedReader ( new FileReader ( fin ) ) ;
  int n = Integer . parseInt ( br . readLine ( ) ) ;
  PrintWriter fout = new PrintWriter ( new BufferedWriter ( new FileWriter ( "b.out" ) ) ) ;
  for ( int i = xrange ( 1 , n + 1 ) ;
  i <= n ;
  i ++ ) {
    int p = Integer . parseInt ( br . readLine ( ) ) ;
    int k = Integer . parseInt ( br . readLine ( ) ) ;
    int l = Integer . parseInt ( br . readLine ( ) ) ;
    int [ ] freqs = ArrayUtil . toIntArray ( freqs ) ;
    if ( p * k < l ) {
      print ( fout , "Case #" + i + ": Impossible" ) ;
    }
    else {
      Arrays . sort ( freqs , ( a , b ) -> b - a ) ;
    }
  }
}

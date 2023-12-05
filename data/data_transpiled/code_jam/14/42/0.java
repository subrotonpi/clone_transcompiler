public static final void main ( String args [ ] ) throws IOException {
  BufferedReader fin = new BufferedReader ( new FileReader ( args [ 0 ] ) ) ;
  PrintWriter fout = new PrintWriter ( new FileWriter ( "p2.out" ) ) ;
  int T = Integer . parseInt ( fin . readLine ( ) ) ;
  for ( int i : xrange ( T ) ) {
    int N = Integer . parseInt ( fin . readLine ( ) ) ;
    int [ ] A = ArrayUtil . toIntArray ( fin . readLine ( ) . split ( " " ) ) ;
    int ans = 0 ;
    for ( int j : xrange ( A . length ) ) {
      int l = 0 ;
      int r = 0 ;
      for ( int k : xrange ( A . length ) ) {
        if ( A [ k ] > A [ j ] ) {
          if ( k < j ) {
            l ++ ;
          }
          else {
            r ++ ;
          }
        }
      }
      ans += Math . min ( l , r ) ;
    }
    fout . println ( "Case #" + ( i + 1 ) + ": " + ans ) ;
  }
  fout . println ( ) ;
}

public static final InputSupplier < BufferedReader > IO_GENERATOR = new InputSupplier < BufferedReader > ( ) {
  @ Override public BufferedReader getInput ( ) {
    return new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  }
  @ Override public void main ( BufferedReader io ) throws IOException {
    int a = Integer . parseInt ( io . readLine ( ) ) ;
    List < Integer > l = Lists . newArrayList ( Integer . parseInt ( io . readLine ( ) ) ) ;
    Collections . sort ( l , Collections . reverseOrder ( ) ) ;
    int m = Integer . parseInt ( l . get ( 1 ) ) ;
    int pre = l . get ( 0 ) ;
    int num = 1 ;
    for ( int val : l . subList ( 1 , l . size ( ) ) ) {
      if ( pre > m * 2 ) {
        break ;
      }
      else {
        num ++ ;
        pre = val ;
        m = m - val ;
      }
    }
  }
}

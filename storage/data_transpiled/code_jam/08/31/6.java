private static void solve ( ) throws IOException {
  BufferedReader br = new BufferedReader ( new FileReader ( "A-large.in" ) ) ;
  PrintWriter g = new PrintWriter ( new BufferedWriter ( new FileWriter ( "A.out" ) ) ) ;
  int N = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int P = Integer . parseInt ( br . readLine ( ) ) ;
    int K = Integer . parseInt ( br . readLine ( ) ) ;
    int L = Integer . parseInt ( br . readLine ( ) ) ;
    int [ ] ns = ArrayUtil . toIntArray ( br . readLine ( ) ) ;
    Arrays . sort ( ns ) ;
    Arrays . reverse ( ns ) ;
    print ( ns ) ;
  }
  System . out . println ( ) ;
}

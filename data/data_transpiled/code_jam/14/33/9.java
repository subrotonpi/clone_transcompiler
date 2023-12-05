private static void solve ( ) throws IOException {
  BufferedReader br = new BufferedReader ( new FileReader ( "C-small-attempt2.in.txt" ) ) ;
  int T = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    Arrays . stream ( br . readLine ( ) . split ( " " ) ) . forEach ( k -> {
      int N = Integer . parseInt ( k ) ;
      int M = Integer . parseInt ( k ) ;
      int K = Integer . parseInt ( k ) ;
      int a = Math . min ( N , M ) ;
      int b = Math . max ( N , M ) ;
      if ( a == 1 || a == 2 ) {
        System . out . printf ( "Case #%i:%n" , t + 1 ) ;
      }
      else if ( a == 3 ) {
        if ( b == 3 ) {
          if ( K <= 4 ) {
            res = K ;
          }
          else {
            res = K - 1 ;
          }
        }
        else if ( b == 4 ) {
          if ( K <= 4 ) {
            res = K ;
          }
          else if ( K <= 7 ) {
            res = K - 1 ;
          }
          else {
            res = K - 2 ;
          }
        }
        else if ( b == 5 ) {
          if ( K <= 4 ) {
            res = K ;
          }
          else if ( K <= 7 ) {
            res = K - 1 ;
          }
          else if ( K <= 10 ) {
            res = K - 2 ;
          }
          else {
            res = K - 3 ;
          }
        }
        else {
          if ( K <= 4 ) {
            res = K ;
          }
          else if ( K <= 7 ) {
            res = K - 1 ;
          }
          else if ( K <= 10 ) {
            res = K - 2 ;
          }
          else {
            res = K - 3 ;
          }
        }
        System . out . printf ( "Case #%i:%n" , t + 1 ) ;
      }
      ) ;
    }
  }
  solve ( ) ;
}

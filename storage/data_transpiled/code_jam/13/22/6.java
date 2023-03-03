static final double ncr ( int n , int r ) throws IOException {
  return Math . factorial ( n ) / Math . factorial ( r ) / Math . factorial ( n - r ) ;
  /* probability for height */
  double ways = 0 ;
  for ( int i = height ;
  i <= diamonds ;
  i ++ ) {
    ways += ncr ( diamonds , i ) ;
  }
  /* probability for height */
  double ratio = 0 ;
  BufferedReader fin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  int T = Integer . parseInt ( fin . readLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    int N = Integer . parseInt ( fin . readLine ( ) ) ;
    int X = Integer . parseInt ( fin . readLine ( ) ) ;
    int Y = Integer . parseInt ( fin . readLine ( ) ) ;
    int seq = ( Math . abs ( X ) + Y ) / 2 ;
    int remaining = N ;
    for ( int i = 0 ;
    i < seq ;
    i ++ ) {
      diamonds = i * 4 + 1 ;
      remaining -= diamonds ;
    }
    int sidelen = seq * 2 + 1 ;
    int diamonds = seq * 4 + 1 ;
    double prob = 0.0 ;
    if ( remaining >= diamonds ) {
      prob = 1.0 ;
    }
    else if ( remaining <= 0 ) {
      prob = 0.0 ;
    }
    else {
      if ( X == 0 ) {
        prob = 0.0 ;
      }
      else {
        if ( remaining - ( sidelen - 1 ) > Y ) {
          prob = 1.0 ;
        }
        else {
          prob = probability ( Y + 1 , remaining ) ;
        }
      }
    }
    System . out . println ( "Case #" + testCase + ": " + prob ) ;
  }
  return ratio ;
}

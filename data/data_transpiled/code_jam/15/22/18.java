public static int solve ( int r , int c , int n ) throws IOException {
  BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  int T = Integer . parseInt ( br . readLine ( ) ) ;
  {
    int t ;
    int sp = r * c - n ;
    int total = 2 * r * c - r - c ;
    if ( r > c ) {
      int t = r ;
      r = c ;
      c = t ;
    }
    if ( r == 1 ) {
      if ( sp >= c / 2 ) {
        return 0 ;
      }
      else {
        return total - 2 * sp ;
      }
    }
    int thres1 = ( int ) Math . ceil ( ( r - 2 ) * ( c - 2 ) / 2.0 ) ;
    int thres2 = ( int ) Math . ceil ( r * c / 2.0 ) - 2 ;
    if ( sp >= Math . floor ( r * c / 2.0 ) ) {
      return 0 ;
    }
    else if ( sp <= thres1 ) {
      return total - 4 * sp ;
    }
    else if ( sp <= thres2 ) {
      return total - 4 * thres1 - 3 * ( sp - thres1 ) ;
    }
    else {
      return 2 ;
    }
  }
  {
    int sp = r * c - n ;
    int total = 2 * r * c - r - c ;
    if ( r > c ) {
      int t = r ;
      r = c ;
      c = t ;
    }
    if ( r == 1 ) {
      if ( sp >= Math . ceil ( c / 2.0 ) ) {
        return 0 ;
      }
      else {
        return total - 2 * sp ;
      }
    }
    int thres1 = ( int ) Math . ceil ( ( r - 2 ) * ( c - 2 ) / 2.0 ) ;
    int thres1_p = ( int ) Math . floor ( ( r - 2 ) * ( c - 2 ) / 2.0 ) ;
    int thres2 = ( int ) Math . ceil ( ( r - 2 ) * ( c - 2 ) / 2.0 ) + r + c - 6 ;
    int thres3 = ( int ) Math . ceil ( ( r - 2 ) * ( c - 2 ) / 2.0 ) + r + c - 2 ;
    if ( sp >= Math . floor ( r * c / 2.0 ) ) {
      return 0 ;
    }
    else if ( sp <= thres1 ) {
      return total - 4 * sp ;
    }
    else if ( sp <= thres2 ) {
      return total - 4 * thres1 - 3 * ( sp - thres1_p ) ;
    }
  }
}

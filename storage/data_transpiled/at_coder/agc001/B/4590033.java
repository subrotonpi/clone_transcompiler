static final Scanner stdin = new Scanner ( System . in ) {
  int ni = 0 ;
  int na = 0 ;
  int nn = 0 ;
  int ns = 0 ;
  int n = 0 , x = 0 ;
  @ Override public int loop ( int a , int b ) {
    int h = Math . max ( a , b ) ;
    int w = Math . min ( a , b ) ;
    if ( h % w == 0 ) {
      return ( int ) ( ( 2 * h / w - 1 ) * w ) ;
    }
    else {
      int m = h % w ;
      int q = h / w ;
      return 2 * q * w + loop ( m , w ) ;
    }
  }
}

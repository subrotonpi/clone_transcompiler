static final Scanner readline = new Scanner ( System . in ) {
  private int nextInt ( ) {
    return nextInt ( ) ;
  }
  private int c ( int n , int k ) {
    if ( n < k ) return 0 ;
    int r = 1 ;
    k = Math . min ( k , n - k ) ;
    for ( int i = 1 ;
    i <= k ;
    i ++ ) {
      r = r * n / i ;
      n -- ;
    }
    return r ;
  }
  public static void main ( String [ ] args ) {
    int ncase = Integer . parseInt ( readLine . nextLine ( ) ) ;
    for ( int testCase = 0 ;
    testCase < ncase ;
    testCase ++ ) {
      int n = Integer . parseInt ( readLine . nextLine ( ) ) ;
      int A = Integer . parseInt ( readLine . nextLine ( ) ) ;
      int B = Integer . parseInt ( readLine . nextLine ( ) ) ;
      int C = Integer . parseInt ( readLine . nextLine ( ) ) ;
      int D = Integer . parseInt ( readLine . nextLine ( ) ) ;
      int x0 = Integer . parseInt ( readLine . nextLine ( ) ) ;
      int y0 = Integer . parseInt ( readLine . nextLine ( ) ) ;
      int M = Integer . parseInt ( readLine . nextLine ( ) ) ;
      int ans = 0 ;
      List < Tree > trees = new ArrayList < Tree > ( ) ;
      Map < Integer , Integer > kind = new HashMap < Integer , Integer > ( ) ;
      int x = x0 , y = y0 ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        trees . add ( new Tree ( x , y ) ) ;
        int k = x % 3 , y = y % 3 ;
        if ( ! kind . containsKey ( k ) ) kind . put ( k , 0 ) ;
        kind . put ( k , ++ ans ) ;
        x = ( A * x + B ) % M ;
        y = ( C * y + D ) % M ;
      }
      for ( int ki = 0 ;
      ki < kind . size ( ) ;
      ki ++ ) {
        for ( int kj = ki ;
        kj < kind . size ( ) ;
        kj ++ ) {
          for ( int kk = kj ;
          kk < kind . size ( ) ;
          kk ++ ) {
            List < Integer > keys = kind . keySet ( ) ;
            Integer i = keys . get ( ki ) ;
            Integer j = keys . get ( kj ) ;
            Integer k = keys . get ( kk ) ;
            int cx3 = i . intValue ( ) + j . intValue ( ) + k
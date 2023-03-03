@ GwtIncompatible ( "java.util.concurrent.atomic.ThreadPoolExecutor" ) public static int [ ] solve ( final int [ ] upper , final int [ ] lower , final int G ) {
  final int [ ] uarr = new int [ upper . length - 1 ] ;
  final int [ ] larr = new int [ upper . length - 1 ] ;
  for ( int i = 0 ;
  i < uarr . length ;
  i ++ ) {
    uarr [ i ] = 0 ;
    System . err . println ( "SOLVE" + i + ":" + i ) ;
  }
  final int T = Integer . MAX_VALUE ;
  final int [ ] inputs = new int [ T ] ;
  for ( int i = 0 ;
  i < input . length ;
  i ++ ) {
    int cnum = i ;
    int L = Integer . MAX_VALUE ;
    int U = Integer . MIN_VALUE ;
    for ( int j = 0 ;
    j < L ;
    j ++ ) {
      int A = Integer . MAX_VALUE ;
      for ( int j = 0 ;
      j < A ;
      j ++ ) {
        int B = Integer . MIN_VALUE ;
        for ( int j = 0 ;
        j < B ;
        j ++ ) {
          inputs [ i ] = input [ j ] ;
        }
      }
    }
    if ( false ) {
      ForkJoinPool pool = new ForkJoinPool ( ) ;
      List < Integer > output = pool . invokeAll ( new Callable < List < Integer >> ( ) {
        public List < Integer > call ( ) throws Exception {
          return input ;
        }
      }
      ) ;
      for ( int i = 0 ;
      i < output . length ;
      i ++ ) {
        System . err . println ( "Case #" + ( i + 1 ) + ":" ) ;
        for ( Integer a : output ) {
          System . err . println ( a ) ;
        }
      }
    }
  }
  for ( int i = 0 ;
  i < input . length ;
  i ++ ) {
    int W = uarr . length - 1 ;
    uarr [ W ] = upper [ i ] ;
    larr [ W ] = lower [ i ] ;
    final int [ ] dd = new int [ W ] ;
    for ( int i = 0 ;
    i < uarr . length ;
    i ++ ) {
      int mid = uarr [ i ] - larr [ i ] ;
      int area = sum ( ( dd [ i ] + dd [ i + 1 ] ) * 0.5 ) ;
      if ( pp < mid ) {
        ll = mid ;
      }
      else {
        uu = mid ;
      }
    }
    out [ i ] = ( ll + uu
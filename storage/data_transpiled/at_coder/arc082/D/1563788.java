static final long [ ] getSortedLongArray ( int oX , int K ) {
  int oX = Integer . parseInt ( input ( ) ) ;
  int K = Integer . parseInt ( input ( ) ) ;
  long [ ] r = new long [ K ] ;
  /* calc time */
  long [ ] last = new long [ ] {
    0 , oX , 0 , 0 , oX }
    ;
    List < Long > res = new ArrayList < > ( ) ;
    res . add ( last ) ;
    for ( int i = 0 ;
    i < r . length ;
    i ++ ) {
      long [ ] tr = r [ i ] ;
      long sep1 = last [ i ] , sep2 = last [ i ] , X = last [ i ] , Y = last [ i ] , Z = last [ i ] ;
      long dt = tr [ i ] == 0 ? 0 : tr [ i ] - r [ i - 1 ] ;
      if ( i % 2 == 0 ) {
        X = Math . max ( 0 , X - dt ) ;
        Y = Y - dt ;
        Z = Math . max ( 0 , Z - dt ) ;
        sep1 = Math . max ( sep1 , - Y ) ;
      }
      else {
        X = Math . min ( oX , X + dt ) ;
        Y = Y + dt ;
        Z = Math . min ( oX , Z + dt ) ;
        sep2 = Math . min ( sep2 , oX - Y ) ;
      }
      last = new long [ ] {
        sep1 , sep2 , X , Y , Z }
        ;
        res . add ( last ) ;
      }
      int Q = Integer . parseInt ( input ( ) ) ;
      int rIndex = 0 ;
      r [ 0 ] = 0 ;
      r [ 1 ] = 10000000000 ;
      for ( int i = 0 ;
      i < Q ;
      i ++ ) {
        /* calc time */
        long tmp = rIndex % 2 != 0 ? 1 : - 1 ;
        /* calc time */
        long t = Long . parseLong ( input ( ) ) ;
        long a = Long . parseLong ( input ( ) ) ;
        while ( r [ rIndex ] < t ) {
          if ( r [ rIndex + 1 ] > t ) break ;
          rIndex ++ ;
        }
        long sep1 = res [ rIndex ] ;
        long sep2 = res [ rIndex ] ;
        long X = Long . parseLong ( input ( ) ) ;
        long Y = Long . parseLong ( input ( ) ) ;
        long Z = Long .
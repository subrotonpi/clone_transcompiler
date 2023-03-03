static final String getExample ( ) {
  final String className = "java.util.concurrent.atomic.AtomicInteger" ;
  final double INF = Double . MAX_VALUE ;
  System . setProperty ( className , "java.util.concurrent.atomic.AtomicInteger" ) ;
  final double [ ] dy = {
    0 , - 1 , 0 , 1 }
    ;
    final double [ ] dx = {
      1 , 0 , - 1 , 0 }
      ;
      final int N = Integer . parseInt ( input ( ) ) ;
      final List < Integer > l = new ArrayList < Integer > ( N ) ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        final int m = Integer . parseInt ( input ( ) ) ;
        final int d = Integer . parseInt ( input ( ) ) ;
        l . add ( new Integer ( m ) ) ;
      }
      final GregorianCalendar cal = new GregorianCalendar ( 2012 ) ;
      cal . set ( Calendar . YEAR , 1 ) ;
      cal . set ( Calendar . MONTH , 1 ) ;
      cal . set ( Calendar . DAY_OF_MONTH , 1 ) ;
      int ans = 0 ;
      int n = 0 , r = 0 ;
      while ( cal . get ( ) == 2012 ) {
        switch ( cal . get ( Calendar . DAY_OF_WEEK ) ) {
          case 5 : case 6 : if ( l . contains ( new Integer ( cal . get ( Calendar . MONTH ) ) ) ) {
            r ++ ;
            n ++ ;
          }
          break ;
          case 7 : if ( l . contains ( new Integer ( cal . get ( Calendar . MONTH ) ) ) ) {
            n ++ ;
          }
          break ;
          default : if ( r == 0 ) {
            n = 0 ;
          }
          else {
            n ++ ;
            r -- ;
          }
        }
        cal . add ( Calendar . DATE , 1 ) ;
        ans = Math . max ( ans , n ) ;
      }
      System . out . println ( ans ) ;
      if ( className . equals ( className ) ) {
        return className ;
      }
      return className ;
    }
    
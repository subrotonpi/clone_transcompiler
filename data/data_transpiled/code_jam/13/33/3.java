public static void input ( ) {
  T = input . nextInt ( ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    int N = input . nextInt ( ) ;
    int [ ] d = new int [ N ] , n = new int [ N ] , w = new int [ N ] , e = new int [ N ] , s = new int [ N ] , dd = new int [ N ] , dp = new int [ N ] , ds = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) Arrays . fill ( d , i ) ;
    Arrays . fill ( n , i ) ;
    Arrays . fill ( w , i ) ;
    Arrays . fill ( e , i ) ;
    Arrays . fill ( s , i ) ;
    Arrays . fill ( dd , i ) ;
    Arrays . fill ( dp , i ) ;
    Arrays . fill ( ds , i ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) Arrays . fill ( s , i ) ;
    Arrays . fill ( dp , i ) ;
    Arrays . fill ( ds , i ) ;
    List < Pair > q = new ArrayList < > ( ) ;
    Map < Integer , Integer > wall = new HashMap < > ( ) ;
    Map < Integer , Integer > changes = new HashMap < > ( ) ;
    for ( int i = - 600 ;
    i <= 600 ;
    i ++ ) {
      wall . put ( i , 0 ) ;
      changes . put ( i , 0 ) ;
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) for ( int j = 0 ;
    j < n [ i ] ;
    j ++ ) q . add ( new Pair ( d [ i ] + dd [ i ] * j , i , j ) ) ;
    Collections . sort ( q ) ;
    int succ = 0 ;
    int lastDay = 0 ;
    for ( Pair a : q ) {
      Arrays . fill ( a . first , a . second ) ;
      int day = a . second ;
      int tr = a . first + 1 ;
      int dt = a . second + 1 ;
      if ( day != lastDay ) {
        for ( int i = - 600 ;
        i <= 600 ;
        i ++ ) {
          wall . put ( i , Math . max ( wall . get ( i ) , changes . get ( i ) ) ) ;
          changes . put ( i , wall . get ( i ) ) ;
        }
      }
      int cw = w . get ( tr ) + dp . get
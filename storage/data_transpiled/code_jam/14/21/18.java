static final Scanner input = new Scanner ( System . in ) {
  final int T = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < xrange ( T ) ;
  i ++ ) {
    System . out . print ( "Case #" + ( i + 1 ) + ": " ) ;
    final int n = Integer . parseInt ( input . nextLine ( ) ) ;
    final List < Pair < Character , Integer >> strs = new ArrayList < > ( ) ;
    boolean flag = false ;
    for ( final int i = xrange ( n ) ;
    i < n ;
    i ++ ) {
      final String line = input . nextLine ( ) ;
      if ( flag ) continue ;
      final List < Pair < Character , Integer >> x = new ArrayList < > ( ) ;
      char now = 0 ;
      int count = 0 ;
      for ( final char ch : line . toCharArray ( ) ) {
        if ( ch != now ) {
          if ( now != null ) x . add ( new Pair < > ( now , count ) ) ;
          now = ch ;
          count = 1 ;
        }
        else count ++ ;
      }
      if ( strs . size ( ) > 0 ) {
        if ( strs . get ( 0 ) . size ( ) != x . size ( ) ) {
          flag = true ;
          continue ;
        }
        for ( int j = 0 ;
        j < xrange ( x . size ( ) ) ;
        j ++ ) {
          if ( strs . get ( 0 ) . get ( j ) . toString ( ) . compareTo ( x . get ( 0 ) . toString ( ) ) != 0 ) {
            flag = true ;
            break ;
          }
        }
        if ( flag ) continue ;
        strs . add ( x ) ;
      }
      else strs . add ( x ) ;
    }
    if ( flag ) System . out . println ( "Fegla Won" ) ;
    else {
      int tot = 0 ;
      for ( int i = 0 ;
      i < xrange ( strs . get ( 0 ) . size ( ) ) ;
      i ++ ) {
        final List < String > a = new ArrayList < > ( ) ;
        for ( int j = 0 ;
        j < xrange ( strs . size ( ) ) ;
        j ++ ) {
          a . add ( strs . get ( j ) . get ( i ) . toString ( ) ) ;
        }
        Collections . sort ( a ) ;
        final String mid = a . get ( a . size ( ) / 2 ) ;
        tot += Math . abs ( a . get ( a . size ( ) - 1 ) ) ;
        
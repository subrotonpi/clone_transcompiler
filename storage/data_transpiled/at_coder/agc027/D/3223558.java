@ VisibleForTesting static LinkedHashMap < String , Integer > map ( String input ) {
  final double INF = Double . MAX_VALUE ;
  final double mod = 10 * 9 + 7 ;
  {
    final List < Integer > ans = Lists . newArrayList ( ) ;
    for ( String s : input . split ( " " ) ) {
      ans . add ( Integer . parseInt ( s ) ) ;
    }
    final List < String > inpl = Lists . newArrayList ( ) ;
    for ( String s : input . split ( " " ) ) {
      ans . add ( s ) ;
    }
    final int N = Integer . parseInt ( input . substring ( 0 , N ) ) ;
    {
      while ( b != 0 ) {
        a = b ;
        b = a % b ;
      }
    }
    final int lcm = a * b / gcd ( a , b ) ;
    {
      final int n = n ;
      final List < Integer > list = new ArrayList < > ( ) ;
      for ( int i = 2 ;
      i <= n ;
      i ++ ) {
        list . add ( i ) ;
      }
      for ( int d : list ) {
        list . remove ( d ) ;
      }
      return list ;
    }
    final List < Integer > Primes = hurui ( 8000 ) ;
    final int [ ] pn = new int [ N ] ;
    for ( int p : Primes ) {
      pn [ p ] = p ;
    }
    final int [ ] [ ] ans = new int [ N ] [ N ] ;
    for ( int y = 0 ;
    y < N ;
    y ++ ) {
      int pl ;
      int mn ;
      if ( y % 2 == 0 ) {
        xx = 0 ;
      }
      else {
        xx = 1 ;
      }
      for ( int x : xx ) {
        pl = ( y + x ) / 2 ;
        mn = ( y - x ) / 2 + N + ( N - 1 ) / 2 ;
        ans [ y ] [ x ] = pn [ pl ] * pn [ mn ] ;
      }
    }
    final boolean ed = true ;
    for ( int y = 0 ;
    y < N ;
    y ++ ) {
      for ( int x = 0 ;
      x < N ;
      x ++ ) {
        if ( ans [ y ] [ x ] == 0 ) {
          int tmp = 1 ;
          if ( x > 0 ) tmp = lcm ( tmp , ans [ y ] [ x - 1 ] ) ;
          if ( x < N - 1 ) tmp = lcm ( tmp , ans [ y ] [ x + 1 ] ) ;
          if ( y > 0 ) tmp = lcm ( tmp , ans [ y
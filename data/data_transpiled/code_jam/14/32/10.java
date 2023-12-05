static final Scanner scanner = new Scanner ( System . in ) {
  final String [ ] letters = Strings . toLowerCaseArray ( ) ;
  final long Mod = 1000000007 ;
  final int tests = scanner . nextInt ( ) ;
  for ( int test = 0 ;
  test < tests ;
  test ++ ) {
    final int n = scanner . nextInt ( ) ;
    final String [ ] a = scanner . nextLine ( ) . split ( " " ) ;
    long res = 1 ;
    for ( final String l : letters ) {
      int b = 0 ;
      String sb = "" ;
      int e = 0 ;
      String se = "" ;
      int m = 0 ;
      String sm = "" ;
      long tres = 1 ;
      for ( int i = 0 ;
      i < a . length ;
      i ++ ) {
        if ( a [ i ] != null && a [ i ] . contains ( l ) ) {
          final String s = a [ i ] ;
          if ( s . charAt ( 0 ) == l && s . charAt ( s . length ( ) - 1 ) == l ) {
            m ++ ;
            sm += s ;
            tres = tres * m % Mod ;
            a [ i ] = "" ;
          }
          else if ( ( s . charAt ( 0 ) == l ) && ( s . charAt ( s . length ( ) - 1 ) == l ) ) {
            b ++ ;
            sb += s ;
            a [ i ] = "" ;
          }
          else if ( ( s . charAt ( s . length ( ) - 1 ) == l ) && ( s . charAt ( s . length ( ) - 1 ) == l ) ) {
            e ++ ;
            se += s ;
            a [ i ] = "" ;
          }
        }
        if ( b > 1 || e > 1 ) {
          tres = 0 ;
        }
      }
      if ( se + sm + sb != null ) {
        a [ i ] = se + sm + sb ;
        res = res * tres % Mod ;
      }
    }
    for ( final String l : letters ) {
      int cur = 0 ;
      for ( final String s : a ) {
        if ( s . contains ( l ) ) {
          cur ++ ;
        }
      }
      if ( cur > 1 ) {
        res = 0 ;
      }
    }
    int k = 1 ;
    final Map < String , Long > map = Maps . newHashMap ( ) ;
    for ( int i = 0 ;
    i < a . length ;
    i ++ ) {
      if ( a [ i ] != null ) {
        res = res * k % Mod ;
        k ++ ;
        final String [ ] ts =
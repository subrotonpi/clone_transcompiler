public static void main ( String [ ] args ) {
  try {
    final Scanner scanner = new Scanner ( System . in ) ;
    final int N = scanner . nextInt ( ) ;
    final int [ ] [ ] opp = new int [ N ] [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      opp [ i ] [ i ] = scanner . nextInt ( ) ;
    }
    final int [ ] wp_n = new int [ N ] ;
    final HashMap < Integer , Integer > G = new HashMap < > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      opp [ i ] [ i ] = scanner . nextInt ( ) ;
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      wp_n [ i ] = 0 ;
    }
    final HashMap < Integer , Integer > wp = new HashMap < > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      final String l = scanner . nextLine ( ) ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        if ( l . charAt ( j ) != '.' ) {
          opp [ i ] [ j ] = j ;
          G . put ( i , j , Integer . parseInt ( l . substring ( j , j + 1 ) ) ) ;
          wp_n [ i ] += Integer . parseInt ( l . substring ( j + 1 ) ) ;
        }
      }
    }
    final Fraction [ ] wp = new Fraction [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) wp [ i ] = new Fraction [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) wp [ i ] [ i ] = new Fraction ( wp_n [ i ] , wp [ i ] . size ( ) ) ;
    final Fraction [ ] owp = new Fraction [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) owp [ i ] = new Average ( new Fraction [ N ] {
      wp [ i ] - G . get ( j , i ) , wp [ i ] . size ( ) - 1 }
      ) ;
      final Fraction [ ] oowp = new Fraction [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) oowp [ i ] = new Average ( new Fraction [ N ] {
        wp [ i ] , owp [ i ] , owp [ i ] , oowp [ i ] }
        ) ;
      }
      catch (
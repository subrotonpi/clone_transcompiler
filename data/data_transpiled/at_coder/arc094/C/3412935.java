@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static int [ ] [ ] ints ( int x ) {
  int [ ] [ ] ints = new int [ N ] [ N ] ;
  int i = 0 ;
  int INF = Integer . MAX_VALUE ;
  final String YES = "YES" ;
  final String YES = "Yes" ;
  final String YES = "Yes" ;
  final String NO = "NO" ;
  final String NO = "No" ;
  final String NO = "No" ;
  final String NO = "No" ;
  final String NO = "NO" ;
  final int [ ] dy4 = {
    0 , 1 , 0 , - 1 }
    , dx4 = {
      1 , 0 , - 1 , 0 }
      ;
      final int [ ] dy8 = {
        0 , - 1 , 0 , 1 , 1 , - 1 , - 1 , 1 }
        ;
        final int [ ] dx8 = {
          0 , - 1 , 0 , 1 , 1 , - 1 , - 1 , - 1 }
          ;
          final int [ ] [ ] ints = new int [ N ] [ N ] ;
          for ( int y = 0 ;
          y < N ;
          y ++ ) {
            ints [ y ] = Integer . parseInt ( input ( ) ) ;
          }
          final int [ ] A = new int [ N ] [ N ] ;
          final int [ ] B = new int [ N ] ;
          int total = 0 ;
          for ( int y = 0 ;
          y < N ;
          y ++ ) {
            ints [ y ] = Integer . parseInt ( input ( ) ) ;
          }
          for ( int y = 0 ;
          y < N ;
          y ++ ) {
            ints [ y ] = Integer . parseInt ( input ( ) ) ;
          }
          for ( int y = 0 ;
          y < N ;
          y ++ ) {
            ints [ y ] = Integer . parseInt ( input ( ) ) ;
          }
          for ( int y = 0 ;
          y < N ;
          y ++ ) {
            ints [ y ] = Integer . parseInt ( input ( ) ) ;
          }
          for ( int y = 0 ;
          y < N ;
          y ++ ) {
            ints [ y ] = Integer . parseInt ( input ( ) ) ;
          }
          for ( int y = 0 ;
          y < N ;
          y ++ ) {
            ints [ y ] = Integer . parseInt ( input ( ) ) ;
          }
          for ( int z = 0 ;
          z < N ;
          z ++ ) {
            ints [ z ] = Integer . parseInt ( input ( ) ) ;
          }
          return ints ;
        }
        
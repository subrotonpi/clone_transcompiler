static final String print ( ) {
  final double INF = Double . MAX_VALUE ;
  final double MOD = 10 * 9 + 7 ;
  /* LI */
  final int [ ] LI_ = new int [ ] {
    Integer . MAX_VALUE - 1 }
    ;
    /* LS */
    final int [ ] LS = new int [ ] {
      Integer . MAX_VALUE }
      ;
      /* II */
      final int [ ] II = new int [ ] {
        Integer . MAX_VALUE }
        ;
        /* SI */
        final Scanner scanner = new Scanner ( System . in ) ;
        /* main */
        final int n = scanner . nextInt ( ) ;
        final double a = scanner . nextDouble ( ) ;
        final double b = scanner . nextDouble ( ) ;
        final double c = scanner . nextDouble ( ) ;
        final double d = scanner . nextDouble ( ) ;
        final int [ ] base = new int [ ] {
          - INF }
          ;
          /* base */
          final int near = scanner . nextInt ( ) ;
          final double l = scanner . nextDouble ( ) ;
          final double r = scanner . nextDouble ( ) ;
          final double x = b - l <= r - b ? l : r ;
          if ( n % 2 != 0 ) {
            final double tmp = ( ( n + 1 ) / 2 - 1 ) * ( d - c ) ;
            if ( x - tmp <= b && b <= x + tmp ) {
              res = "YES" ;
            }
            else {
              res = "NO" ;
            }
          }
          else {
            final double tmp = ( n / 2 - 1 ) * ( d - c ) + ( d - c ) / 2 ;
            if ( ( d - c ) % 2 != 0 ) {
              if ( a <= b ) {
                if ( x - tmp <= b && b <= x + tmp + 1 ) {
                  res = "YES" ;
                }
                else {
                  res = "NO" ;
                }
              }
              else {
                if ( x - tmp <= b && b <= x + tmp ) {
                  res = "NO" ;
                }
              }
            }
            else {
              if ( x - tmp <= b && b <= x + tmp ) {
                res = "YES" ;
              }
              else {
                if ( x - tmp <= b && b <= x + tmp ) {
                  res = "NO" ;
                }
              }
            }
          }
          System . out . println ( Main . format ( Main . format ( Main . format ( Main . format ( Main . format ( Main . format ( Main . format ( Main . format ( Main . format ( Main . format ( Main ( Main . format ( Main ) ) ) ) ) )
static final double INF = Double . MAX_VALUE ;
final double MOD = 10 * 9 + 7 ;
{
  final int n = Integer . parseInt ( System . in ) ;
  final int k = Integer . parseInt ( System . in ) ;
  final int [ ] LI_ = {
    Integer . parseInt ( System . in ) - 1 }
    ;
    final int [ ] LF = {
      Double . parseDouble ( System . in ) }
      ;
      final int [ ] LS = {
        Integer . parseInt ( System . in ) }
        ;
        final int II = Integer . parseInt ( System . in ) ;
        final int SI = input . nextInt ( ) ;
        {
          final int n = LI ;
          final int k = MOD ;
          final TreeMap < Integer , Integer > G = new TreeMap < Integer , Integer > ( ) ;
          final int [ ] AB = {
            LI_ }
            ;
            for ( int a = 0 ;
            a < n - 1 ;
            a ++ ) {
              final int b = AB [ a ] ;
              G . put ( a , b ) ;
              G . put ( b , a ) ;
            }
          }
          {
            final int n = LI ;
            final int k = MOD ;
            final TreeMap < Integer , Integer > G = new TreeMap < Integer , Integer > ( ) ;
            final int [ ] AB = {
              LI_ }
              ;
              for ( int a = 0 ;
              a < n ;
              a ++ ) {
                final int b = AB [ a ] ;
                G . put ( a , b ) ;
                G . put ( b , a ) ;
              }
            }
            {
              final int [ ] q = new int [ n ] ;
              for ( int s = 0 ;
              s < ss . length ;
              s ++ ) {
                q [ s ] = new Integer ( s ) ;
              }
              final int [ ] visited = new int [ n ] ;
              visited [ ss [ 0 ] ] = visited [ ss [ ss . length - 1 ] ] = 1 ;
              while ( q . length > 0 ) {
                final int v = q [ 0 ] ;
                final int d = q [ 1 ] ;
                if ( d >= t ) {
                  continue ;
                }
                for ( final int to : G . get ( v ) ) {
                  if ( visited [ to ] != 0 ) {
                    continue ;
                  }
                  visited [ to ] = 1 ;
                  q [ 0 ] = to ;
                  q [ 1 ] = to ;
                }
              }
              return n - Arrays . stream ( visited ) . sum ( ) ;
            }
          }
          
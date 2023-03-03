static final double INF = Double . MAX_VALUE ;
final double MOD = 10 * 9 + 7 ;
{
  final int [ ] LI = new int [ ] {
    Integer . MAX_VALUE }
    ;
    final int [ ] LI_ = new int [ ] {
      Integer . MAX_VALUE - 1 }
      ;
      final int [ ] LS = new int [ ] {
        Integer . MAX_VALUE }
        ;
        final int II = Integer . parseInt ( System . in ) ;
        final int SI = input . nextInt ( ) ;
        {
          final int n = LI [ 0 ] ;
          final int m = LI [ 1 ] ;
          final TreeMap < Integer , Integer > G = new TreeMap < > ( ) ;
          final TreeSet < Integer > S = new TreeSet < > ( ) ;
          for ( int i = 0 ;
          i < m ;
          i ++ ) {
            final int a = LI_ [ i ] ;
            final int b = LI_ [ i ] ;
            G . put ( a , b ) ;
            G . put ( b , a ) ;
            S . put ( a , b ) ;
            S . add ( b ) ;
            S . add ( a ) ;
          }
          final int [ ] res = new int [ ] {
            0 , G . get ( 0 ) . intValue ( ) }
            ;
            final Set < Integer > visited = new HashSet < > ( ) ;
            visited . add ( res [ 0 ] ) ;
            final Set < Integer > needs = S . get ( res [ 0 ] ) | S . get ( res [ res . length - 1 ] ) - visited ;
            while ( needs . size ( ) > 0 ) {
              final int v = needs . remove ( ) ;
              if ( visited . contains ( v ) ) continue ;
              visited . add ( v ) ;
              if ( S . get ( res [ 0 ] ) . contains ( v ) ) res [ res . length - 1 ] = v ;
              else res [ res . length - 1 ] = v ;
              needs = ( S . get ( res [ 0 ] ) | S . get ( res [ res . length - 1 ] ) ) - visited ;
            }
            System . out . println ( res . length ) ;
            System . out . println ( ( int ) res [ res . length - 1 ] ) ;
          }
        }
        
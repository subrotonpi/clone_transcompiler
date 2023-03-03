@ ExpectWarning ( "Case #" + ( t < 2 ) + ": " + ( t < 3 ) ) ;
final int [ ] [ ] quat_mult_table = {
  {
    0 , 1 , 2 , 3 }
    , {
      1 , 4 , 3 , 6 }
      , {
        2 , 7 , 4 , 1 }
        , {
          3 , 2 , 5 , 4 }
        }
        ;
        /* multiply a and b into a and b */
        final int sign_a = a / 4 ;
        final int absA = a % 4 ;
        final int sign_b = b / 4 ;
        final int absB = b % 4 ;
        /* next states */
        final int [ ] [ ] answer = {
          ( quat_mult_table [ absA ] [ absB ] + 4 * sign_a + 4 * sign_b ) % 8 }
          ;
          /* compose two combinations */
          final Map < Integer , Set < Integer >> first = new HashMap < > ( ) ;
          for ( final Integer state : first . keySet ( ) ) {
            answer [ state ] = new HashSet < > ( ) ;
            for ( final Integer halfstate : first . get ( state ) ) {
              for ( final Integer endstate : second . get ( halfstate ) ) {
                answer [ state ] . add ( endstate ) ;
              }
            }
            /* repeat two combinations */
            final Map < Integer , Set < Integer >> second = new HashMap < > ( ) ;
            for ( final Integer halfstate : second . keySet ( ) ) {
              answer [ halfstate ] . clear ( ) ;
              for ( final Integer halfstate : first . get ( halfstate ) ) {
                for ( final Integer endstate : second . get ( halfstate ) ) {
                  answer [ halfstate ] . add ( endstate ) ;
                }
              }
            }
            /* repeat three combinations */
            if ( times == 1 ) return what ;
            final Map < Integer , Set < Integer >> half = repeat ( what , singlePass , times / 2 ) ;
            final Map < Integer , Set < Integer >> answer = compose ( half , half ) ;
            if ( times % 2 != 0 ) answer = compose ( answer , singlePass ) ;
            /* repeat three combinations */
            final int T = Integer . parseInt ( input . nextLine ( ) ) ;
            for ( int t = 1 ;
            t <= T ;
            t ++ ) {
              final int L = Integer . parseInt ( input . nextLine ( ) ) ;
              final
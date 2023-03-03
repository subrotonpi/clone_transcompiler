static final String [ ] args = new String [ ] {
}
;
final String [ ] [ ] split = new String [ 2 ] [ 2 ] ;
int T = Integer . parseInt ( fdInput . readLine ( ) . trim ( ) ) ;
for ( int i = 0 ;
i < T ;
++ i ) {
  if ( S % 2 == 0 ) {
    return new String [ ] {
      new String [ ] {
        S / 2 - 1 , count }
        , new String [ ] {
          S / 2 , count }
        }
        ;
      }
    }
    {
      final Map < Integer , Integer > segs = new HashMap < Integer , Integer > ( ) ;
      for ( Map . Entry < Integer , Integer > s : segs . entrySet ( ) ) {
        for ( Map . Entry < Integer , Integer > z : divide ( s . getValue ( ) , s . getValue ( ) ) ) {
          temp . put ( z . getKey ( ) , temp . get ( z . getKey ( ) ) + z . getValue ( ) ) ;
        }
      }
      segs = temp ;
    }
    final Set < Map . Entry < Integer , Integer >> intervals = segs . entrySet ( ) ;
    intervals . sort ( ) ;
    intervals . reverse ( ) ;
    for ( Map . Entry < Integer , Integer > l : intervals ) {
      final int maxInterval = l . getValue ( ) ;
      if ( K <= maxInterval ) {
        maxInterval = l . getValue ( ) ;
        break ;
      }
      else {
        K -= maxInterval ;
      }
    }
    {
      final List < String > ret = new ArrayList < String > ( ) ;
      final Map < Integer , Integer > segs = new HashMap < Integer , Integer > ( ) ;
      for ( int k = 0 ;
      k < N ;
      ++ k ) {
        final int maxL = Collections . max ( segs . keySet ( ) ) ;
        final int ls = maxL / 2 , rs = maxL / 2 - ( maxL % 2 == 0 ? 1 : 0 ) ;
        ret . add ( new String [ ] {
          ls , rs }
          ) ;
          segs . get ( maxL ) -- ;
          if ( segs . get ( maxL ) == 0 ) {
            segs . remove ( maxL ) ;
          }
          segs . put ( ls , segs . get ( ls ) + 1 ) ;
          segs . put ( rs , segs . get ( rs ) + 1 ) ;
        }
        return ret . toArray ( new String [ 0 ] ) ;
      }
      
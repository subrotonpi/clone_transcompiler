static boolean solve ( int L , int R , int Seq ) {
  final int me = Integer . parseInt ( System . in ) ;
  final int mi = Integer . parseInt ( System . in ) ;
  final int mj = Integer . parseInt ( System . in ) ;
  final int mk = Integer . parseInt ( System . in ) ;
  final int [ ] m = new int [ ] {
    mi , mj , mk }
    ;
    {
      int current = me ;
      final int [ ] target = {
        mi , mj }
        ;
        int currenttarget = 0 ;
        int noprogress = 0 ;
        for ( int r = xrange ( R ) ;
        r < L ;
        r ++ ) {
          for ( int s = 0 ;
          s < Seq ;
          s ++ ) {
            if ( m [ s ] != null ) {
              current = current * m [ s ] ;
              if ( Arrays . equals ( current , target [ currenttarget ] ) ) {
                currenttarget = currenttarget + 1 ;
                current = me ;
                noprogress = 0 ;
              }
              if ( currenttarget >= target . length ) {
                break ;
              }
            }
          }
          if ( currenttarget >= target . length ) {
            break ;
          }
          noprogress = noprogress + 1 ;
          if ( noprogress > 8 ) {
            break ;
          }
        }
        if ( currenttarget < target . length ) {
          return false ;
        }
        current = me ;
        for ( int s = 0 ;
        s < Seq ;
        s ++ ) {
          if ( m [ s ] != null ) {
            current = current * m [ s ] ;
          }
        }
        if ( Arrays . equals ( current , current * ( R % 8 ) , mi * mj * mk ) ) {
          return true ;
        }
        return false ;
      }
      if ( __name__ == "__main__" ) {
        final int T = Integer . parseInt ( System . in ) ;
        for ( int t = 0 ;
        t < T ;
        t ++ ) {
          int l = Integer . parseInt ( System . in ) ;
          int r = Integer . parseInt ( System . in ) ;
          int s = Integer . parseInt ( System . in ) ;
          System . out . println ( "Case #" + t + 1 + ": " + ( solve ( l , r , s ) ? "YES" : "NO" ) ) ;
        }
      }
      return false ;
    }
    
static final Scanner TRIES_NUMBER = new Scanner ( System . in ) {
  @ Override public String nextLine ( ) {
    return nextLine ( ) ;
  }
  @ Override public int [ ] nextLine ( ) {
    return new int [ ] {
      Integer . parseInt ( nextLine ( ) ) }
      ;
    }
    @ Override public int [ ] nextLine ( ) {
      return new int [ ] {
        Integer . parseInt ( nextLine ( ) ) }
        ;
      }
      @ Override public int [ ] nextLine ( ) {
        return new int [ ] {
          Integer . parseInt ( nextLine ( ) . trim ( ) ) }
          ;
        }
        @ Override public int [ ] nextLine ( ) {
          return new int [ ] {
            Integer . parseInt ( nextLine ( ) . trim ( ) ) }
            ;
          }
          @ Override public int [ ] nextLine ( ) {
            int n , k , b , t ;
            int [ ] x = Ints . toArray ( nextLine ( ) ) ;
            int [ ] v = Ints . toArray ( nextLine ( ) ) ;
            int [ ] times = new int [ x . length ] ;
            for ( int i = 0 ;
            i < x . length ;
            i ++ ) times [ i ] = ( b - x [ i ] ) ;
            boolean ok = swaps ( times , k - 1 ) ;
            return true ;
          }
        }
        
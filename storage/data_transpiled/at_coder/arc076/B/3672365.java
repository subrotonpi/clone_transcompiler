static final int [ ] [ ] getHoles ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] p = new int [ n ] [ ] ;
  int [ ] [ ] d = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    p [ i ] = new int [ ] {
      Integer . parseInt ( input . nextLine ( ) ) , Integer . parseInt ( input . nextLine ( ) ) }
      ;
    }
    int [ ] xSorted = new int [ n ] ;
    Arrays . sort ( xSorted , new Comparator < int [ ] > ( ) {
      public int compare ( int [ ] o1 , int [ ] o2 ) {
        return o1 [ 0 ] - o2 [ 0 ] ;
      }
    }
    ) ;
    int [ ] ySorted = new int [ ] {
      Integer . parseInt ( input . nextLine ( ) ) , Integer . parseInt ( input . nextLine ( ) ) }
      ;
      for ( int i = 0 ;
      i < n - 1 ;
      i ++ ) {
        d [ xSorted [ i ] [ 2 ] ] [ i ] = new int [ ] {
          xSorted [ i + 1 ] [ 0 ] - xSorted [ i ] [ 0 ] , xSorted [ i + 1 ] [ 2 ] }
          ;
          d [ xSorted [ i ] [ 2 ] ] [ i ] = new int [ ] {
            xSorted [ i + 1 ] [ 0 ] - xSorted [ i ] [ 0 ] , xSorted [ i ] [ 2 ] }
            ;
            d [ xSorted [ i ] [ 2 ] ] [ i ] = new int [ ] {
              ySorted [ i + 1 ] [ 1 ] - ySorted [ i ] [ 1 ] , ySorted [ i ] [ 2 ] }
              ;
            }
            int [ ] h = new int [ n ] ;
            for ( int i = 0 ;
            i < d [ 0 ] . length ;
            i ++ ) {
              h [ i ] = d [ 0 ] [ i ] ;
            }
            used [ 0 ] = true ;
            int cost = 0 ;
            while ( h . length > 0 ) {
              int [ ] q = new int [ n ] ;
              for ( int i = 0 ;
              i < n ;
              i ++ ) {
                q = new int [ ] {
                  i }
                  ;
                  if ( used [ q ] ) continue ;
                  used [ q ] = true ;
                  cost += q [ 0 ] ;
                  for ( int r : d [ q ] [ 1 ] ) {
                    h [
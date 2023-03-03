public static int [ ] [ ] a ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] a = new int [ n ] [ m ] ;
  int [ ] [ ] b = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a1 = Integer . parseInt ( input . nextLine ( ) ) ;
    int b1 = Integer . parseInt ( input . nextLine ( ) ) ;
    a [ i ] = new int [ ] {
      a1 , b1 }
      ;
    }
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      int c = Integer . parseInt ( input . nextLine ( ) ) ;
      int d = Integer . parseInt ( input . nextLine ( ) ) ;
      b [ i ] = new int [ ] {
        c , d }
        ;
      }
      for ( int [ ] a_ : a ) {
        int [ ] e = new int [ a . length ] ;
        for ( int [ ] b_ : b ) {
          int ans = Math . abs ( a_ [ 0 ] - b_ [ 0 ] ) + Math . abs ( a_ [ 1 ] - b_ [ 1 ] ) ;
          e [ i ] = ans ;
        }
        System . out . println ( e [ e . length - 1 ] ) ;
      }
      return a ;
    }
    
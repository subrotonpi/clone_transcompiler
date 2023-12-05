public static int [ ] [ ] convert ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] T = new int [ n ] ;
  for ( String t : input . split ( " " ) ) T [ 0 ] = Integer . parseInt ( t ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] [ ] drinks = new int [ n ] [ m ] ;
  int [ ] diffs = new int [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int p = Integer . parseInt ( input ) ;
    int x = Integer . parseInt ( input ) ;
    drinks [ i ] = new int [ ] {
      p , x }
      ;
    }
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      int [ ] drink = drinks [ i ] ;
      int diff = T [ drink [ 0 ] - 1 ] - drink [ 1 ] ;
      System . out . println ( Arrays . toString ( T ) - diff ) ;
    }
    return drinks ;
  }
  
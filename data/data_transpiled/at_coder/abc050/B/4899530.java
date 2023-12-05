public static int [ ] [ ] getDrinks ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] T = new int [ n ] ;
  for ( String t : input . nextLine ( ) . split ( " " ) ) {
    T [ 0 ] = Integer . parseInt ( t ) ;
  }
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] drinks = new int [ m ] [ ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int p = Integer . parseInt ( input . nextLine ( ) ) ;
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    drinks [ i ] = new int [ ] {
      p , x }
      ;
    }
    for ( int [ ] drink : drinks ) {
      int diff = T [ drink [ 0 ] - 1 ] - drink [ 1 ] ;
      System . out . println ( Arrays . toString ( T ) - diff ) ;
    }
    return drinks ;
  }
  
public static void Shop ( ) {
  {
    int N = Integer . parseInt ( input . nextLine ( ) ) ;
    int M = Integer . parseInt ( input . nextLine ( ) ) ;
    A [ ] = new int [ N ] ;
    B [ ] = new int [ N ] ;
    Shop [ ] shops = new Shop [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int a = Integer . parseInt ( input . nextLine ( ) ) ;
      int b = Integer . parseInt ( input . nextLine ( ) ) ;
      A [ i ] = a ;
      B [ i ] = b ;
      shops [ i ] = new Shop ( a , b ) ;
    }
    Arrays . sort ( shops ) ;
    int ans = 0 ;
    int restCount = M ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( restCount <= shops [ i ] . num ) {
        ans += shops [ i ] . yen * restCount ;
        break ;
      }
      ans += shops [ i ] . yen * shops [ i ] . num ;
      restCount -= shops [ i ] . num ;
    }
    System . out . println ( ans ) ;
  }
  if ( getClass ( ) . isClass ( ) ) {
    solve ( ) ;
  }
}

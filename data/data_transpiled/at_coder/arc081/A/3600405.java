public static void lfl ( HashMap < Integer , Integer > lfl ) {
  int l1 = 0 ;
  int l2 = 0 ;
  int n = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( lfl . containsKey ( a [ i ] ) ) {
      lfl . put ( a [ i ] , ++ 1 ) ;
    }
    else {
      lfl . put ( a [ i ] , 1 ) ;
    }
    if ( lfl . get ( a [ i ] ) >= 2 ) {
      if ( l1 < a [ i ] ) {
        l2 = l1 ;
        l1 = a [ i ] ;
        lfl . get ( a [ i ] ) - = 2 ;
      }
      else if ( l2 < a [ i ] ) {
        l2 = a [ i ] ;
        lfl . get ( a [ i ] ) - = 2 ;
      }
    }
  }
  System . out . println ( l1 * l2 ) ;
}

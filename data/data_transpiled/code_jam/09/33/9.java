public static int t = Integer . parseInt ( Scanner in ) {
  HashMap < Integer , Integer > memoriz = new HashMap < Integer , Integer > ( ) ;
  {
    int p = in . nextInt ( ) ;
    int q = in . nextInt ( ) ;
    int [ ] cells = new int [ p ] ;
    for ( int i = 0 ;
    i < p ;
    ++ i ) {
      cells [ i ] = in . nextInt ( ) ;
    }
    int min = 0 ;
    if ( memoriz . containsKey ( new Integer ( cells [ 0 ] ) ) ) {
      return memoriz . get ( new Integer ( cells [ 0 ] ) ) ;
    }
    for ( int i = 0 ;
    i < cells . length ;
    ++ i ) {
      if ( cells [ i ] <= end && cells [ i ] >= start ) {
        if ( min == 0 || solve ( p , cells , start , i - 1 ) + solve ( p , cells , i + 1 , end ) + end - start < min ) {
          min = solve ( p , cells , start , i - 1 ) + solve ( p , cells , i + 1 , end ) + end - start ;
        }
      }
    }
    if ( min == 0 ) {
      memoriz . put ( new Integer ( cells [ 0 ] ) , 0 ) ;
      return 0 ;
    }
    else {
      memoriz . put ( new Integer ( cells [ 0 ] ) , min ) ;
      return min ;
    }
  }
  for ( int i = 0 ;
  i < t ;
  ++ i ) {
    int p = in . nextInt ( ) ;
    int q = in . nextInt ( ) ;
    List < Integer > cells = new LinkedList < Integer > ( ) ;
    for ( int j = 0 ;
    j < p ;
    ++ j ) {
      cells . add ( in . nextInt ( ) ) ;
    }
    memoriz . put ( new Integer ( cells [ 0 ] ) , memoriz . get ( new Integer ( cells [ 0 ] ) ) ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + solve ( p , cells , 1 , p ) ) ;
  }
  return t ;
}

public static int [ ] getNegativeInstances ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  char [ ] sArray = new char [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    sArray [ i ] = input . charAt ( i ) ;
  }
  char [ ] sArray = {
    0 , 0 , 0 , 0 , 0 }
    ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      switch ( sArray [ i ] ) {
        case 'M' : sArray [ 0 ] ++ ;
        break ;
        case 'A' : sArray [ 1 ] ++ ;
        break ;
        case 'R' : sArray [ 2 ] ++ ;
        break ;
        case 'C' : sArray [ 3 ] ++ ;
        break ;
        case 'H' : sArray [ 4 ] ++ ;
        break ;
      }
    }
    final int counter = 0 ;
    int [ ] sListNegated = new int [ 5 ] ;
    for ( int i = 0 ;
    i < 5 ;
    i ++ ) {
      if ( sArray [ i ] != 0 ) {
        counter ++ ;
        sListNegated [ i ] = sArray [ i ] ;
      }
    }
    switch ( counter ) {
      case 3 : System . out . println ( 0 ) ;
      break ;
      case 3 : System . out . println ( sListNegated [ 0 ] * sListNegated [ 1 ] * sListNegated [ 2 ] ) ;
      break ;
      case 4 : System . out . println ( sListNegated [ 0 ] * sListNegated [ 1 ] * sListNegated [ 2 ] + sListNegated [ 0 ] * sListNegated [ 1 ] * sListNegated [ 3 ] + sListNegated [ 0 ] * sListNegated [ 2 ] * sListNegated [ 3 ] + sListNegated [ 1 ] * sListNegated [ 2 ] * sListNegated [ 3 ] ) ;
      break ;
      case 5 : System . out . println ( sListNegated [ 0 ] * sListNegated [ 1 ] * sListNegated [ 2 ] + sListNegated [ 0 ] * sListNegated [ 1 ] * sListNegated [ 3 ] + sListNegated [ 0 ] * sListNegated [ 2 ] * sListNegated [ 4 ] + sListNegated [ 0 ] * sListNegated [ 3 ] * sListNegated [ 4 ] + sListNegated [ 1 ] *
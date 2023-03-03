public static void input ( ) {
  String s = input . nextLine ( ) ;
  double [ ] a = {
    1 , 0 , 0 , 0 }
    ;
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      switch ( s . charAt ( i ) ) {
        case 'A' : a [ 1 ] += a [ 0 ] ;
        break ;
        case 'B' : a [ 2 ] += a [ 1 ] ;
        break ;
        case 'C' : a [ 3 ] += a [ 2 ] ;
        break ;
        default : a = new double [ 4 ] ;
        for ( int j = 1 ;
        j < 4 ;
        j ++ ) a [ j ] = a [ j ] * 3 + a [ j - 1 ] ;
      }
      a = new double [ 4 ] ;
    }
    System . out . println ( a [ 3 ] ) ;
  }
  
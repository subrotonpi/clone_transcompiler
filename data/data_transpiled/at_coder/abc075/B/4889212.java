static final String [ ] [ ] getStrings ( int i , int j ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int H = input . nextInt ( ) ;
  final int W = input . nextInt ( ) ;
  final char [ ] [ ] grid = new char [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) grid [ i ] = new char [ W ] ;
  for ( int i = 0 ;
  i < W ;
  i ++ ) grid [ i ] [ j ] = input . nextLine ( ) . replace ( "\n" , "" ) ;
  final int [ ] dir4 = new int [ ] {
    ( 0 , 1 ) , ( 0 , - 1 ) , ( 1 , 0 ) , ( - 1 , 0 ) }
    ;
    final int [ ] dir8 = new int [ ] {
      ( 0 , 1 ) , ( 0 , - 1 ) , ( 1 , 0 ) , ( - 1 , 0 ) , ( - 1 , - 1 ) , ( 1 , - 1 ) , ( - 1 , 1 ) , ( 1 , 1 ) }
      ;
      for ( int i = 0 ;
      i < H ;
      i ++ ) for ( int j = 0 ;
      j < W ;
      j ++ ) {
        if ( grid [ i ] [ j ] != '.' ) continue ;
        int cnt = 0 ;
        for ( int [ ] d : dir8 ) {
          final int nx = i + d [ 0 ] ;
          final int ny = j + d [ 1 ] ;
          if ( ! ( 0 <= nx && nx < H ) ) continue ;
          if ( ! ( 0 <= ny && ny < W ) ) continue ;
          if ( grid [ nx ] [ ny ] == '#' ) cnt ++ ;
        }
        grid [ i ] [ j ] = String . valueOf ( cnt ) ;
      }
      System . out . println ( ( char [ ] [ ] ) grid [ i ] ) ;
      return grid ;
    }
    
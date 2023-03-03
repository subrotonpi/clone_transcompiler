public static void main ( ) {
  {
    dirs = new ArrayList < Integer > ( ) ;
    next = new ArrayList < Tree > ( ) ;
  }
  int T = input . nextInt ( ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    int sum = 0 ;
    Tree root = new Tree ( ) ;
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int m = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      String [ ] line = input . nextLine ( ) . split ( "/" ) ;
      Tree tmp = root ;
      for ( int j = 0 ;
      j < line . length ;
      j ++ ) {
        if ( ! tmp . dirs . contains ( line [ j ] ) ) {
          tmp . dirs . add ( line [ j ] ) ;
          tmp . next . add ( new Tree ( ) ) ;
        }
        tmp = tmp . next . get ( tmp . dirs . indexOf ( line [ j ] ) ) ;
      }
    }
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      String [ ] line = input . nextLine ( ) . split ( "/" ) ;
      Tree tmp = root ;
      for ( int j = 0 ;
      j < line . length ;
      j ++ ) {
        if ( ! tmp . dirs . contains ( line [ j ] ) ) {
          sum ++ ;
          tmp . dirs . add ( line [ j ] ) ;
          tmp . next . add ( new Tree ( ) ) ;
        }
        tmp = tmp . next . get ( tmp . dirs . indexOf ( line [ j ] ) ) ;
      }
    }
    System . out . println ( "Case #" + ( t + 1 ) + ": " + sum ) ;
  }
}

static final Scanner getScanner ( ) {
  final Scanner ns = new Scanner ( System . in ) ;
  final NumberParser ni = new NumberParser ( ns ) ;
  final NumberParser nm = new NumberParser ( ni ) ;
  final NumberParser nms = new NumberParser ( ni ) ;
  final NumberParser nl = new NumberParser ( nms ) ;
  final int n = nm . nextInt ( ) ;
  final int m = nm . nextInt ( ) ;
  final int [ ] a = nl . nextInt ( ) ;
  final int [ ] lis = {
    0 , 2 , 5 , 5 , 4 , 5 , 6 , 3 , 7 , 6 }
    ;
    final int [ ] dp = new int [ n + 1 ] ;
    dp [ 0 ] = - 1 ;
    for ( int i = 1 ;
    i <= n ;
    i ++ ) {
      for ( int j = 0 ;
      j < a . length ;
      j ++ ) {
        if ( a [ i ] - lis [ j ] >= 0 ) {
          dp [ i ] = Math . max ( dp [ i ] , dp [ i - lis [ j ] ] * 10 + j ) ;
        }
      }
    }
    System . out . println ( dp [ n ] ) ;
    return ns ;
  }
  
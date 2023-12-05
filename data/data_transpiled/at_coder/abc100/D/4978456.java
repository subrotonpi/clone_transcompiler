public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] X = new int [ 8 ] [ 8 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    int z = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] calc = {
      x + y + z , - x + y + z , x - y + z , - x - y + z , x + y - z , - x + y - z , x - y - z }
      ;
      for ( int j = 0 ;
      j < 8 ;
      j ++ ) {
        X [ j ] [ i ] = calc [ j ] ;
      }
    }
    int answer = 0 ;
    for ( int i = 0 ;
    i < 8 ;
    i ++ ) {
      int a = Arrays . binarySearch ( X [ i ] , calc ) ;
      answer = Math . max ( a , answer ) ;
    }
    System . out . println ( answer ) ;
    return answer ;
  }
  
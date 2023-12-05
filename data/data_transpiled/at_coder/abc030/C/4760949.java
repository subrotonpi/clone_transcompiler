public static int [ ] [ ] getNegativeInstances ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int X = Integer . parseInt ( input . readLine ( ) ) ;
  int Y = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  int [ ] B = new int [ M ] ;
  char case = 'A' ;
  int i = 0 ;
  int a = 0 ;
  int b = 0 ;
  int ans = 0 ;
  while ( ( i = input . readLine ( ) ) != - 1 ) {
    if ( case == 'A' ) {
      while ( i > A [ a ] ) {
        a ++ ;
        if ( a >= N ) {
          System . out . println ( ans / 2 ) ;
          exit ( ) ;
        }
      }
      i = A [ a ] + X ;
      ans ++ ;
      case = 'B' ;
    }
    if ( case == 'B' ) {
      while ( i > B [ b ] ) {
        b ++ ;
        if ( b >= M ) {
          System . out . println ( ans / 2 ) ;
          exit ( ) ;
        }
      }
      i = B [ b ] + Y ;
      ans ++ ;
      case = 'A' ;
    }
  }
  return A ;
}

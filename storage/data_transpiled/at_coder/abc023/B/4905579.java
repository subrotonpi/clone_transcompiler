public static void print ( int n ) {
  String s = input . nextLine ( ) ;
  if ( n % 2 == 0 ) {
    System . out . println ( - 1 ) ;
    exit ( ) ;
  }
  char [ ] D = {
    'b' , 'c' , 'c' , 'a' , 'a' , 'b' }
    ;
    char [ ] t = {
      'b' , 'a' , 'c' }
      ;
      int ans = n / 2 ;
      for ( int i = 0 ;
      i < s . length ( ) - 1 ;
      i ++ ) {
        char c1 = s . charAt ( i ) ;
        char c2 = s . charAt ( i + 1 ) ;
        if ( ! D [ c1 ] == c2 ) {
          ans = - 1 ;
          break ;
        }
        if ( D [ c1 ] != c2 ) {
          ans = - 1 ;
          break ;
        }
      }
      if ( t [ ans % 3 ] != s . charAt ( 0 ) ) {
        ans = - 1 ;
      }
      System . out . println ( ans ) ;
    }
    
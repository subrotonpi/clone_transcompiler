public static int R = Integer . parseInt ( input ) {
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int Y = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  long md = 1000000007 ;
  /* combi */
  if ( n <= 0 || n < k ) {
    return 0 ;
  }
  int [ ] upper = {
    1 , 1 }
    ;
    for ( int stratum = 2 ;
    stratum <= n ;
    stratum ++ ) {
      int [ ] combination = {
        1 }
        ;
        for ( int i = upper . length - 1 , j = upper . length ;
        i >= upper . length ;
        i -- , j -- ) {
          combination [ i ] = ( i + j ) % md ;
        }
        combination [ upper . length - 1 ] = 1 ;
        upper = Arrays . copyOf ( combination , combination . length ) ;
      }
      /* stuff */
      int stuff = D + L ;
      int whole = combi ( X * Y , stuff ) ;
      int ud_1 = combi ( X * ( Y - 1 ) , stuff ) * 2 ;
      int rl_1 = combi ( ( X - 1 ) * Y , stuff ) * 2 ;
      int ud_2 = combi ( X * ( Y - 2 ) , stuff ) ;
      int rl_2 = combi ( ( X - 2 ) * Y , stuff ) ;
      int ru_2 = combi ( ( X - 1 ) * ( Y - 1 ) , stuff ) * 4 ;
      int ud_3 = combi ( ( X - 1 ) * ( Y - 2 ) , stuff ) * 2 ;
      int rl_3 = combi ( ( X - 2 ) * ( Y - 1 ) , stuff ) * 2 ;
      int rlud_4 = X * Y != 1 ? combi ( ( X - 2 ) * ( Y - 2 ) , stuff ) : 0 ;
      whole = whole - ( ud_1 + rl_1 ) + ( ud_2 + rl_2 + ru_2 ) - ( ud_3 + rl_3 ) + rlud_4 ;
      int pos = ( R - X + 1 ) * ( C - Y + 1 ) ;
      int ans = pos * whole * combi ( D + L , D ) ;
      System . out . println ( ans % md ) ;
    }
    
@ Sys public static void System ( ) {
  String input = System . getProperty ( "input" ) ;
  int y = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int d = Integer . parseInt ( input ) ;
  String ans = Integer . toString ( y + 1 ) + "/01/01" ;
  boolean flag = true ;
  int n [ ] = {
    31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 }
    ;
    if ( y % 400 == 0 || ( y % 100 != 0 && y % 4 == 0 ) ) {
      n [ 1 ] = 29 ;
    }
    for ( int i = m ;
    i < 13 ;
    i ++ ) {
      if ( y % i == 0 ) {
        for ( int j = 1 ;
        j <= n [ i - 1 ] ;
        j ++ ) {
          if ( i == m && j < d ) {
            continue ;
          }
          if ( y % ( i * j ) == 0 ) {
            if ( flag ) {
              flag = false ;
              ans = Integer . toString ( y ) + "/" + i + "/" + j ;
            }
            break ;
          }
        }
      }
    }
    System . out . println ( ans ) ;
  }
  
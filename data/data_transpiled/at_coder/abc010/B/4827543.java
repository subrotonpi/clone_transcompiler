public static void n ( ) {
  int [ ] c = {
    0 , 1 , 0 , 1 , 2 , 3 , 0 , 1 , 0 }
    ;
    int ans = 0 ;
    for ( int b : map . get ( ) ) {
      ans += c [ b - 1 ] ;
    }
    System . out . println ( ans ) ;
  }
  
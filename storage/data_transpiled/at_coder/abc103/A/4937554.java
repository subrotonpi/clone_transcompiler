public static int a ( ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = {
    a , b , c }
    ;
    Arrays . sort ( A ) ;
    int ans = 0 ;
    for ( int i = 0 ;
    i < A . length - 1 ;
    i ++ ) {
      ans += A [ i + 1 ] - A [ i ] ;
    }
    System . out . println ( ans ) ;
    return ans ;
  }
  
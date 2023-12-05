public static int a ( ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ ] {
    a , b , c }
    ;
    int ans = 0 ;
    if ( max ( A ) % 2 == 1 ) {
      ans = A [ 0 ] * A [ 1 ] ;
    }
    System . out . println ( ans ) ;
    return ans ;
  }
  
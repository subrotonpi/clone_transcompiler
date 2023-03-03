public static int getA ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( 1 <= A && B <= 100 && C <= 100 ) {
    if ( A != B != C ) {
      if ( A > B > C ) {
        System . out . println ( 1 ) ;
        System . out . println ( 2 ) ;
        System . out . println ( 3 ) ;
      }
      else if ( A > C > B ) {
        System . out . println ( 1 ) ;
        System . out . println ( 3 ) ;
        System . out . println ( 2 ) ;
      }
      else if ( B > A > C ) {
        System . out . println ( 2 ) ;
        System . out . println ( 1 ) ;
        System . out . println ( 3 ) ;
      }
      else if ( B > C > A ) {
        System . out . println ( 3 ) ;
        System . out . println ( 1 ) ;
        System . out . println ( 2 ) ;
      }
      else if ( C > B > A ) {
        System . out . println ( 3 ) ;
        System . out . println ( 2 ) ;
        System . out . println ( 1 ) ;
      }
      else if ( C > A > B ) {
        System . out . println ( 2 ) ;
        System . out . println ( 3 ) ;
        System . out . println ( 1 ) ;
      }
    }
  }
  return 0 ;
}

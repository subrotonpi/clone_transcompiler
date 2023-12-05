public static void aI ( int aO , int aT , int aJ , int aL , int aS , int aZ ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  int z = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = aO ;
  if ( x == 0 ) {
    ans += y / 2 * 2 + z / 2 * 2 ;
  }
  else {
    ans += ( x - 1 ) * 3 ;
    y -= x - 1 ;
    z -= x - 1 ;
    ans += Math . max ( 3 + ( z - 1 ) / 2 * 2 + ( y - 1 ) / 2 * 2 , z / 2 * 2 + y / 2 * 2 ) ;
  }
  System . out . println ( ans ) ;
}

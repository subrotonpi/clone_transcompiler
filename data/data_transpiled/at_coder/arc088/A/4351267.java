public static int X , Y = Integer . parseInt ( input . nextLine ( ) ) {
  int ans = 1 ;
  int i = X ;
  while ( ( i * 2 <= Y ) ) {
    i *= 2 ;
    ans ++ ;
  }
  System . out . println ( ans ) ;
  return ans ;
}

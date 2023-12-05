public static void n ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int k = Integer . parseInt ( input ( ) ) ;
  int [ ] x = new int [ n ] ;
  for ( String item : input ( ) . split ( " " ) ) {
    x [ i ] = Integer . parseInt ( item ) ;
  }
  int ans = 0 ;
  for ( int x_ : x ) {
    ans += Math . min ( Math . abs ( x_ - 0 ) , Math . abs ( x_ - k ) ) * 2 ;
  }
  System . out . println ( ans ) ;
}

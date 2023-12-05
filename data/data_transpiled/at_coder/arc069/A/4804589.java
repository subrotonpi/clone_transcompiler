public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int ans = 0 ;
  ans += Math . min ( N , M / 2 ) ;
  ans += ( M - Math . min ( N , M / 2 ) * 2 ) / 4 ;
  System . out . println ( ans ) ;
}

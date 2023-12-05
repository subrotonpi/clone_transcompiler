public static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] sums = new int [ n + 1 ] ;
  int sum = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    sum += a [ i ] ;
    sums [ i ] = sum ;
  }
  HashMap < String , Integer > dic = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    dic . computeIfAbsent ( String . valueOf ( sums [ i ] % m ) , k -> 0 ) ;
    dic . put ( String . valueOf ( sums [ i ] % m ) , ++ k ) ;
  }
  for ( String key : dic . keySet ( ) ) {
    int k = dic . get ( key ) ;
    if ( k > 1 ) ans += k * ( k - 1 ) / 2 ;
  }
  System . out . println ( ans ) ;
}

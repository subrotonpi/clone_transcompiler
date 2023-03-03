public static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > [ ] AB = new List [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) AB [ i ] = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) AB [ i ] . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int ans = 0 ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    int a = AB [ i ] . get ( 0 ) + ans ;
    int b = AB [ i ] . get ( 1 ) ;
    int tmp ;
    if ( a % b == 0 ) tmp = 0 ;
    else tmp = b - ( a % b ) ;
    ans += tmp ;
  }
  System . out . println ( ans ) ;
}

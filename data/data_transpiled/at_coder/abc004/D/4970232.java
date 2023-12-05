public static int getR ( ) {
  int R = Integer . parseInt ( input . readLine ( ) ) ;
  int G = Integer . parseInt ( input . readLine ( ) ) ;
  int B = Integer . parseInt ( input . readLine ( ) ) ;
  int ans = 10 * 15 ;
  for ( int i = - 400 ;
  i <= 401 ;
  i ++ ) {
    int tmp = 0 ;
    int g = i + G - 1 ;
    for ( int j = i ;
    j <= g ;
    j ++ ) tmp += Math . abs ( j ) ;
    int r = Math . min ( i - 1 , - 100 + ( R - 1 ) / 2 ) ;
    for ( int j = r - R + 1 ;
    j <= r ;
    j ++ ) tmp += Math . abs ( j + 100 ) ;
    int b = Math . max ( g + 1 , 100 - ( B - 1 ) / 2 ) ;
    for ( int j = b ;
    j <= b + B ;
    j ++ ) tmp += Math . abs ( j - 100 ) ;
    ans = Math . min ( ans , tmp ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}

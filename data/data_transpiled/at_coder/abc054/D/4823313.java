public static int mod = 1777777777 ;
int n = Integer . parseInt ( input . readLine ( ) ) ;
int ma = Integer . parseInt ( input . readLine ( ) ) ;
int mb = Integer . parseInt ( input . readLine ( ) ) ;
int [ ] [ ] d = new int [ 100 ] [ 100 ] ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  int a = Integer . parseInt ( input . readLine ( ) ) ;
  int b = Integer . parseInt ( input . readLine ( ) ) ;
  int c = Integer . parseInt ( input . readLine ( ) ) ;
  int x = a ;
  int y = b ;
  for ( int j = 100 - a - 1 ;
  j >= 0 ;
  j -- ) {
    for ( int k = 100 - b - 1 ;
    k >= 0 ;
    k -- ) {
      if ( d [ j ] [ k ] != mod ) d [ j ] [ k ] = Math . min ( d [ j ] [ k ] , c ) ;
    }
  }
}
int ans = mod ;
for ( int i = 0 ;
i < 100 ;
i ++ ) {
  if ( i % ma == 0 && mb * i / ma < 100 ) ans = Math . min ( ans , d [ i ] [ mb * i / ma ] ) ;
}
System . out . println ( ans == mod ) ;
return ans ;
}

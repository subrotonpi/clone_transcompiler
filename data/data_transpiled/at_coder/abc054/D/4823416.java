public static int mod = 1777777777 ;
int n = Integer . parseInt ( input . readLine ( ) ) , ma = Integer . parseInt ( input . readLine ( ) ) , mb = Integer . parseInt ( input . readLine ( ) ) ;
int [ ] [ ] d = new int [ 100 ] [ 100 ] ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  int a = Integer . parseInt ( input . readLine ( ) ) , b = Integer . parseInt ( input . readLine ( ) ) , c = Integer . parseInt ( input . readLine ( ) ) ;
  for ( int j = 100 - a - 1 ;
  j >= 0 ;
  j -- ) {
    for ( int k = 100 - b - 1 ;
    k >= 0 ;
    k -- ) {
      d [ j + a ] [ k + b ] = Math . min ( d [ j + a ] [ k + b ] , d [ j ] [ k ] + c ) ;
    }
  }
  d [ a ] [ b ] = Math . min ( d [ a ] [ b ] , c ) ;
}
int ans = mod ;
for ( int i = 0 ;
i < 100 ;
i ++ ) {
  if ( i % ma == 0 && mb * i / ma < 100 ) ans = Math . min ( ans , d [ i ] [ mb * i / ma ] ) ;
}
return ans ;
}

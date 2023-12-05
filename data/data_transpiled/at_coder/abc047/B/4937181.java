public static int w = 0 , h = 0 , n = 0 ;
int w0 = 0 , h0 = 0 ;
for ( ;
;
) {
  int x = Integer . parseInt ( input . readLine ( ) ) ;
  int y = Integer . parseInt ( input . readLine ( ) ) ;
  int a = Integer . parseInt ( input . readLine ( ) ) ;
  switch ( a ) {
    case 1 : w0 = Math . max ( x , w0 ) ;
    break ;
    case 2 : w = Math . min ( x , w ) ;
    break ;
    case 3 : h0 = Math . max ( y , h0 ) ;
    break ;
    case 4 : h = Math . min ( y , h ) ;
    break ;
  }
}
int ans ;
if ( w <= w0 ) ans = 0 ;
else if ( h <= h0 ) ans = 0 ;
else ans = Math . abs ( w - w0 ) * Math . abs ( h - h0 ) ;
return ans ;
}

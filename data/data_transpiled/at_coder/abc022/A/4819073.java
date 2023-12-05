public static int ans = 0 ;
int n = Integer . parseInt ( input ) ;
int s = Integer . parseInt ( input ) ;
int t = Integer . parseInt ( input ) ;
int w = Integer . parseInt ( input ) ;
for ( int i = 0 ;
i < n - 1 ;
i ++ ) {
  if ( s <= w && w <= t ) ans ++ ;
  w += Integer . parseInt ( input ) ;
}
if ( s <= w && w <= t ) ans ++ ;
return ans ;
}

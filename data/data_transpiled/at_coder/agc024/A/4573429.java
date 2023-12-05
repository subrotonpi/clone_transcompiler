public static int a , int b , int c , int k ;
int ans ;
ans = a - b ;
if ( k % 2 == 0 ) ans = a - b ;
else ans = b - a ;
if ( Math . abs ( ans ) > 10 * 18 ) ans = "Unfair" ;
System . out . println ( ans ) ;
return ans ;
}

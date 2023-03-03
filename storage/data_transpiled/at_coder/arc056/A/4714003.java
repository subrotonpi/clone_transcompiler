public static int a , int b , int k , int l ;
int ans = 0 ;
ans = b * ( k / l ) + a * ( k % l ) ;
ans = b * ( k / l + 1 ) ;
return ans ;
}

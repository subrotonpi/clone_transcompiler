public static int a , int b , int c ;
int mod = 10 * * 9 + 7 ;
int inv = Math . pow ( ( b + c ) * a - b * c , mod - 2 , mod ) ;
return ( b - a ) * c * inv % mod ;
}

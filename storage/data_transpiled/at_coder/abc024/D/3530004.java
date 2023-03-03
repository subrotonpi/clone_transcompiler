public static int A = Integer . parseInt ( input ) ;
int B = Integer . parseInt ( input ) ;
int C = Integer . parseInt ( input ) ;
int m = 10 * * 9 + 7 ;
int inv = Math . pow ( ( B + C ) * A - B * C , m - 2 ) ;
int r = ( B - A ) * C * inv ;
return r ;
}

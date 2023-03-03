public static int A = Integer . parseInt ( input ) ;
int B = Integer . parseInt ( input ) ;
int C = Integer . parseInt ( input ) ;
int modulo = 10 * * 9 + 7 ;
int AB = ( A * B ) % modulo ;
int BC = ( B * C ) % modulo ;
int CA = ( C * A ) % modulo ;
int y = ( ( BC - AB ) * Math . pow ( ( CA - BC + AB ) , modulo - 2 , modulo ) ) % modulo ;
int x = ( ( BC - CA ) * Math . pow ( ( AB - BC + CA ) , modulo - 2 , modulo ) ) % modulo ;
return x + y ;
}

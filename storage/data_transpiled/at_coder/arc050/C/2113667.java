public static int A , int B , int M ;
int M ;
/* do a */
int r = M % M ;
/* do b */
int a = A ;
int b = B ;
int c = A ;
int d = B ;
/* do c */
int p = B ;
int q = A ;
/* do s */
int s = B ;
/* do s */
int S = pow ( 10 , x , M ) , 1 , 0 , 1 ;
int R = 1 , 0 , 0 , 1 ;
while ( n > 0 ) {
  if ( ( n & 1 ) != 0 ) {
    R = mul ( R , S ) ;
  }
  S = mul ( S , S ) ;
  n >>= 1 ;
}
/* do s */
return R >> 1 ;
}

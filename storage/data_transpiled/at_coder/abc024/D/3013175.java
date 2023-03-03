public static int A = Integer . parseInt ( input ) ;
int B = Integer . parseInt ( input ) ;
int C = Integer . parseInt ( input ) ;
int MOD = 10 * 9 + 7 ;
/* bit the remainder of the input */
List < Integer > res = new ArrayList < > ( ) ;
while ( x > 0 ) {
  res . add ( x % 2 ) ;
  x /= 2 ;
}
Collections . reverse ( res ) ;
/* inv the remainder of the input */
int p = 1 ;
for ( int i = 0 ;
i < p ;
i ++ ) {
  res = res . multiply ( res . mod ( MOD * x ) ) . pow ( p ) % MOD ;
}
int r = ( B * C - A * C ) % MOD * inv ( ( A * ( B + C ) - B * C ) ) % MOD ;
System . out . println ( r + " " + c ) ;
return r ;
}

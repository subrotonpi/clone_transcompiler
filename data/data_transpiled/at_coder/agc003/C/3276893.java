, n = Integer . numberOfTrailingZeros , a = Integer . numberOfTrailingZeros , b = new HashMap < > ( ) ;
int c = 0 ;
for ( int i = 0 , t = a . length ;
i < t ;
i ++ ) {
  b . put ( a . get ( i ) , i % 2 ) ;
}

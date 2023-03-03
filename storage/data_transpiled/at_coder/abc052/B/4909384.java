public static int x = 0 ;
int N = Integer . parseInt ( input ) ;
String S = input ;
int [ ] ans = new int [ N ] ;
ans [ 0 ] = x ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  if ( S . charAt ( i ) == 'I' ) x ++ ;
  else x -- ;
  ans [ i ] = x ;
}
System . out . println ( max ( ans ) ) ;
return ans [ N ] ;
}

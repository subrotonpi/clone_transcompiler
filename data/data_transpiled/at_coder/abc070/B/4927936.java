public static int A , B , C , D = map ( Integer . parseInt , input ) ;
int ans = 0 ;
for ( int i = 0 ;
i < 101 ;
i ++ ) {
  if ( A < i && B <= i && C < i && D <= i ) {
    ans ++ ;
  }
}
return ans ;
}

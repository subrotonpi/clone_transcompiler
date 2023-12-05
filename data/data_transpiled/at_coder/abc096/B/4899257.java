public static int A , int B , int C ;
int K ;
K = Integer . parseInt ( input . nextLine ( ) ) ;
int ans ;
ans = A + B + C - m ;
for ( int i = 0 ;
i < K ;
i ++ ) {
  m *= 2 ;
}
ans += m ;
System . out . println ( ans ) ;
return ans ;
}

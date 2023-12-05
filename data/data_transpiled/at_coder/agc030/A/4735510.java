public static int A , int B , int C = map ( Integer . parseInt , input ( ) ) ;
int ans = min ( C , A + B + 1 ) ;
ans += B ;
System . out . println ( ans ) ;
return ans ;
}

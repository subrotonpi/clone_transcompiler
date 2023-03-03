public static int A , int B , int C , int K ;
int ans ;
ans = Integer . parseInt ( input . nextLine ( ) ) ;
if ( ( K % 2 ) == 0 ) ans = A - B ;
else ans = B - A ;
System . out . println ( ans ) ;
return ans ;
}

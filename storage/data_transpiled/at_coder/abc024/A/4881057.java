public static int A , int B , int C , int K ;
int S , T ;
S = Integer . parseInt ( input . nextLine ( ) ) ;
T = Integer . parseInt ( input . nextLine ( ) ) ;
ans = 0 ;
if ( K <= ( S + T ) ) {
  ans = ( A * S ) + ( B * T ) - ( C * ( S + T ) ) ;
}
else {
  ans = ( A * S ) + ( B * T ) ;
}
return ans ;
}

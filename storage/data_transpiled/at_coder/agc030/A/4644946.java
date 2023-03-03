public static int A , int B , int C ;
int ans ;
A = input . nextInt ( ) ;
B = input . nextInt ( ) ;
C = input . nextInt ( ) ;
if ( C > B + A ) {
  ans = A + B + B + 1 ;
}
else {
  ans = B + C ;
}
return ans ;
}

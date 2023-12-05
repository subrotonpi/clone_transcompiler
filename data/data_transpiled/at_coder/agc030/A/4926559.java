public static int A , int B , int C ;
int NpoisunCookie ;
int beautifulCookie ;
A = input . nextInt ( ) ;
B = input . nextInt ( ) ;
C = input . nextInt ( ) ;
NpoisunCookie = A + B ;
beautifulCookie = B + C ;
if ( C <= A + B ) {
  System . out . println ( beautifulCookie ) ;
}
else {
  System . out . println ( C - ( C - ( A + B ) ) + B + 1 ) ;
}
return NpoisunCookie ;
}

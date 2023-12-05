public static int A , int B , int C , int K ;
int ans ;
if ( K % 2 == 0 ) {
  ans = ( A - B ) ;
}
else {
  A = B + C ;
  B = A + C ;
  C = A + B ;
  ans = ( A - B ) ;
}
if ( Math . abs ( ans ) > 10 * 18 ) {
  System . out . println ( "Unfair" ) ;
}
else {
  System . out . println ( ans ) ;
}
return ans ;
}

public static int A , int B , int C ;
int ans = 0 ;
while ( ! ( A % 2 != 0 || B % 2 != 0 || C % 2 != 0 ) ) {
  A = B / 2 + C / 2 ;
  B = A / 2 + C / 2 ;
  C = A / 2 + B / 2 ;
  if ( ( A == B ) && ( C == C ) ) {
    System . out . println ( - 1 ) ;
    exit ( ) ;
  }
  ans ++ ;
}

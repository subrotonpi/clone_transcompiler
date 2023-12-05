public static int A , int B , int C ;
int Ans = 0 ;
for ( String s : input . split ( " " ) ) {
  if ( A == B && B == C ) {
    if ( A % 2 == 1 || B % 2 == 1 || C % 2 == 1 ) {
      System . out . println ( "0" ) ;
    }
    else {
      System . out . println ( "-1" ) ;
    }
    exit ( ) ;
  }
  for ( int i = 0 ;
  i < 100000 ;
  i ++ ) {
    if ( A % 2 == 1 || B % 2 == 1 || C % 2 == 1 ) {
      Ans = i ;
      break ;
    }
    int a = A / 2 ;
    int b = B / 2 ;
    int c = C / 2 ;
    A = b + c ;
    B = c + a ;
    C = a + b ;
  }
  System . out . println ( Ans ) ;
}

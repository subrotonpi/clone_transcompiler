static final int N = Integer . parseInt ( input . nextLine ( ) ) ;
int H = Integer . parseInt ( input . nextLine ( ) ) ;
int A = Integer . parseInt ( input . nextLine ( ) ) ;
int B = Integer . parseInt ( input . nextLine ( ) ) ;
int C = Integer . parseInt ( input . nextLine ( ) ) ;
int D = Integer . parseInt ( input . nextLine ( ) ) ;
int E = Integer . parseInt ( input . nextLine ( ) ) ;
int money = - 1 ;
for ( int i = 0 ;
i < N + 1 ;
i ++ ) {
  int X = i ;
  double YY = ( ( N - X ) * E - H - B * X ) / ( D + E ) ;
  double Y = Math . ceil ( YY ) ;
  if ( Y == YY ) Y ++ ;
  if ( Y < 0 ) Y = 0 ;
  if ( money == - 1 ) money = A * X + C * Y ;
  else {
    if ( A * X + C * Y < money ) money = A * X + C * Y ;
  }
}
System . out . println ( money ) ;
}

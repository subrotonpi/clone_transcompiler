public static int A , B , C ;
int ans ;
String input = "" ;
input = input . nextLine ( ) ;
if ( A % 2 == 1 || B % 2 == 1 || C % 2 == 1 ) {
  System . out . println ( 0 ) ;
}
else if ( A == B == C ) {
  System . out . println ( - 1 ) ;
}
else {
  /* if (A/B > 0) return A + B + C */
  if ( A / B != 0 ) return A + B + C ;
}
A = Base_10_to_n ( A , 2 ) . substring ( 0 , A . length ( ) - 1 ) ;
B = Base_10_to_n ( B , 2 ) . substring ( 0 , B . length ( ) - 1 ) ;
C = Base_10_to_n ( C , 2 ) . substring ( 0 , C . length ( ) - 1 ) ;
ans = 0 ;
for ( int i = 0 ;
i < Math . min ( A . length ( ) , B . length ( ) , C . length ( ) ) ;
i ++ ) {
  if ( A . charAt ( i ) == B . charAt ( i ) == C . charAt ( i ) ) ans ++ ;
  else break ;
}
System . out . println ( ans ) ;
return ans ;
}

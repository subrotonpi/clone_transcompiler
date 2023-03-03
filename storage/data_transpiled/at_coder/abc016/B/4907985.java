public static int A , int B , int C ;
int A = Integer . parseInt ( input . nextLine ( ) ) ;
int B = Integer . parseInt ( input . nextLine ( ) ) ;
int C = Integer . parseInt ( input . nextLine ( ) ) ;
if ( A + B == A - B == C ) System . out . println ( "?" ) ;
else if ( A + B == C ) System . out . println ( "+" ) ;
else if ( A - B == C ) System . out . println ( "-" ) ;
else System . out . println ( "!" ) ;
return A ;
}

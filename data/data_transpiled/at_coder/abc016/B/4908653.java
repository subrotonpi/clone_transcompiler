public static int A , int B , int C ;
int i ;
i = Integer . parseInt ( input . nextLine ( ) ) ;
if ( A + B != C && A - B != C ) System . out . println ( "!" ) ;
else if ( A + B == C && A - B == C ) System . out . println ( "?" ) ;
else if ( A + B == C ) System . out . println ( "+" ) ;
else System . out . println ( "-" ) ;
return i ;
}

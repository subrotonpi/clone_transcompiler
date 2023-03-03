public static int A , int B , int C , int D ;
int A , B , C , D ;
A = Integer . parseInt ( input . nextLine ( ) ) ;
B = Integer . parseInt ( input . nextLine ( ) ) ;
C = Integer . parseInt ( input . nextLine ( ) ) ;
D = Integer . parseInt ( input . nextLine ( ) ) ;
if ( ( A + B ) > ( C + D ) ) {
  System . out . println ( "Left" ) ;
}
else if ( ( A + B ) < ( C + D ) ) {
  System . out . println ( "Right" ) ;
}
else {
  System . out . println ( "Balanced" ) ;
}
return A + B ;
}

public static int A , int B , int C ;
int i ;
i = Integer . parseInt ( input . nextLine ( ) ) ;
if ( A >= B && A >= C ) {
  System . out . println ( A * 10 + B + C ) ;
}
else if ( B >= A && B >= C ) {
  System . out . println ( B * 10 + A + C ) ;
}
else {
  System . out . println ( C * 10 + A + B ) ;
}
return i ;
}

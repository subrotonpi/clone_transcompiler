public static int A , B ;
A = Integer . parseInt ( input . nextLine ( ) ) ;
B = Integer . parseInt ( input . nextLine ( ) ) ;
if ( B % A == 0 ) {
  System . out . println ( ( int ) ( B / A ) ) ;
}
else {
  System . out . println ( ( int ) ( B / A ) + 1 ) ;
}
return A ;
}

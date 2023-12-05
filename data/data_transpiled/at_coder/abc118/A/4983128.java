public static int A , B ;
A = Integer . parseInt ( input . nextLine ( ) ) ;
B = Integer . parseInt ( input . nextLine ( ) ) ;
if ( B % A == 0 ) {
  System . out . println ( A + B ) ;
}
else {
  System . out . println ( B - A ) ;
}
return A ;
}

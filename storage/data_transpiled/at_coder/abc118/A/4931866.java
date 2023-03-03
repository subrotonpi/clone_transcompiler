public static int A , B ;
A = Integer . parseInt ( input . nextLine ( ) . split ( " " ) [ 0 ] ) ;
B = Integer . parseInt ( input . nextLine ( ) . split ( " " ) [ 1 ] ) ;
if ( B % A == 0 ) {
  System . out . println ( A + B ) ;
}
else {
  System . out . println ( B - A ) ;
}
return A ;
}

public static int A = Integer . parseInt ( input ) ;
int B = Integer . parseInt ( input ) ;
if ( ( A == B ) && ( B == A ) ) {
  System . out . println ( 0 ) ;
}
else {
  System . out . println ( B - A % B ) ;
}
return B ;
}

public static List < Integer > nums = new ArrayList < > ( Collections . list ( input . stream ( ) . map ( Integer :: parseInt ) . collect ( Collectors . toList ( ) ) ) ) ;
int n = nums . get ( 0 ) * nums . get ( 1 ) ;
if ( nums . get ( 2 ) % 2 != 0 ) {
  System . out . println ( n ) ;
}
else {
  System . out . println ( 0 ) ;
}
return nums ;
}

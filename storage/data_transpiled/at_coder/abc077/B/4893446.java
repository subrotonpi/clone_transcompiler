public static int N = Integer . parseInt ( input . readLine ( ) . trim ( ) ) ;
for ( int i = N ;
i > 0 ;
i -- ) {
  int kai = ( int ) Math . pow ( i , 0.5 ) ;
  if ( i == kai * kai ) {
    System . out . println ( i ) ;
    exit ( ) ;
  }
}

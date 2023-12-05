private static void solve ( ) {
  int N = input . nextInt ( ) ;
  int [ ] ar = Arrays . stream ( input . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  List < Integer > diffs = Arrays . stream ( ar ) . map ( a -> a - b ) . collect ( toList ( ) ) ;
  int eat1 = Integer . valueOf ( Math . max ( diffs . get ( 0 ) , 0 ) ) ;
  int rate = Math . max ( diffs . get ( 0 ) + 1 , 0 ) ;
  int eat2 = Integer . valueOf ( Math . min ( diffs . get ( 0 ) , rate ) ) ;
  for ( int i = ar . length - 1 ;
  i >= 0 ;
  i -- ) {
    int a = solve ( ) ;
    int b = solve ( ) ;
    System . out . printf ( "Case #%d: %d %d%n" , t , a , b ) ;
  }
}

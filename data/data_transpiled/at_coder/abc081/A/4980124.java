public static void input ( Scanner numbers ) {
  int [ ] num_list = new int [ numbers . nextInt ( ) ] ;
  for ( int i : numbers ) {
    num_list [ i ] = ( int ) i ;
  }
  System . out . println ( sum ( num_list ) ) ;
}

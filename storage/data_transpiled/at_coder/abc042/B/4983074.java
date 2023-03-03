public static void print ( int N , int L ) {
  int [ ] N = new int [ N ] ;
  for ( int i = 0 ;
  i < N . length ;
  i ++ ) N [ i ] = input . nextInt ( ) ;
  ArrayList < Integer > N_s = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N . length ;
  i ++ ) N . add ( input . nextInt ( ) ) ;
  System . out . println ( N_s ) ;
}

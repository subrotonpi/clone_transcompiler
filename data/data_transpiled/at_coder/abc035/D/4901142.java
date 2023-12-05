@ Test public static void d_treasure_hunt ( int N , int M , int T , int A , int [ ] From_list , int [ ] To_list , int [ ] Weight_list ) {
  Scanner scanner = new Scanner ( System . in ) ;
  int [ ] graph = scanner . nextLine ( ) . split ( " " ) ;
  int [ ] graph_rev = scanner . nextLine ( ) . split ( " " ) ;
  int [ ] forward = new int [ graph . length ] , backward = new int [ graph . length ] ;
  for ( int i = 0 ;
  i < forward . length ;
  i ++ ) {
    forward [ i ] = graph [ i ] ;
    backward [ i ] = graph [ i ] ;
  }
  return max ( a * ( T - ( int ) ( forward [ 0 ] + backward [ 0 ] ) ) , b * ( T - ( int ) ( forward [ 1 ] + backward [ 1 ] ) ) ) ;
}

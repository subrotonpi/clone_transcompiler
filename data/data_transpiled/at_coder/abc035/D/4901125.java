@ Test public static void dTreasureHunt ( int N , int M , int T , int [ ] A , int [ ] From_list , int [ ] To_list , int [ ] Weight_list ) {
  Scanner scanner = new Scanner ( System . in ) ;
  int [ ] graph = scanner . nextLine ( ) . split ( " " ) ;
  int [ ] graphRev = scanner . nextLine ( ) . split ( " " ) ;
  int [ ] forward = scanner . nextLine ( ) . split ( " " ) ;
  int [ ] backward = scanner . nextLine ( ) . split ( " " ) ;
  return Math . max ( A [ i ] * ( T - ( int ) forward [ i ] + backward [ i ] ) , 0 ) ;
}

public static void main ( int N , int A , int B ) {
  Scanner input = new Scanner ( System . in ) ;
  int [ ] X = input . nextLine ( ) . split ( " " ) ;
  int hirou = 0 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int length = X [ i + 1 ] - X [ i ] ;
    if ( length * A <= B ) {
      hirou += length * A ;
    }
    else {
      hirou += B ;
    }
  }
  System . out . println ( hirou ) ;
}

public static String bSpecialJuryPrize ( int N , int K , int [ ] X ) {
  final List < Pair < Integer , Integer >> heap = new ArrayList < > ( ) ;
  for ( int k = 0 ;
  k < K ;
  k ++ ) {
    heap . add ( new Pair < > ( - X [ k ] , k + 1 ) ) ;
  }
  heapify ( heap ) ;
  StringBuilder ans = new StringBuilder ( ) ;
  ans . append ( Integer . toString ( N ) ) ;
  return ans . toString ( ) ;
}

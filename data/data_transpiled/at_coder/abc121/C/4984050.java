@ System public static void main ( String input ) {
  final PriorityQueue < String > hq = null ;
  String NM = input ;
  NM = NM . split ( " " ) ;
  N = Integer . parseInt ( NM [ 0 ] ) ;
  M = Integer . parseInt ( NM [ 1 ] ) ;
  hq = new PriorityQueue < String > ( ) ;
  AB = new HashMap < String , Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String temp = input ;
    temp = temp . split ( " " ) ;
    AB . put ( Integer . parseInt ( temp [ 0 ] ) , Integer . parseInt ( temp [ 1 ] ) ) ;
    heapify ( hq , ( int ) ( temp [ 0 ] ) , ( int ) ( temp [ 1 ] ) ) ;
  }
  int cost = 0 ;
  int amount = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int temp = heapify ( hq ) ;
    if ( amount + temp [ 1 ] < M ) {
      amount += temp [ 1 ] ;
      cost += temp [ 0 ] * temp [ 1 ] ;
    }
    else {
      int temp1 = M - amount ;
      cost += temp [ 0 ] * temp1 ;
      break ;
    }
  }
  System . out . println ( cost ) ;
}

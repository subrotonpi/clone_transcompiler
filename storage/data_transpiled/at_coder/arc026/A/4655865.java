public static void main ( String input , int N , int A , int B ) {
  int numDy = Math . min ( N , 5 ) ;
  System . out . println ( A * ( N - numDy ) + B * numDy ) ;
}

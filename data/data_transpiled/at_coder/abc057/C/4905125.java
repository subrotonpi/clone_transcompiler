public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int minimum = 10 * 9 ;
  List < Integer > num = new ArrayList < > ( ) ;
  for ( int i = 1 ;
  i <= ( int ) ( N * 0.5 ) ;
  i ++ ) {
    if ( N % i == 0 ) num . add ( i ) ;
  }
  for ( int i : num ) {
    int A = i ;
    int B = N / i ;
    minimum = minimum > Integer . toString ( max ( A , B ) ) . length ( ) ? Integer . toString ( max ( A , B ) ) . length ( ) : minimum ;
  }
  System . out . println ( minimum ) ;
}

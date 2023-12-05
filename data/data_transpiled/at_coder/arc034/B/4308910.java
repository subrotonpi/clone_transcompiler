public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > answers = new ArrayList < > ( ) ;
  for ( int n = Math . max ( N - 153 , 1 ) ;
  n <= N ;
  n ++ ) {
    String s = Integer . toString ( n ) ;
    int sumOfDigits = Integer . valueOf ( s ) . intValue ( ) ;
    if ( ( n + sumOfDigits ) == N ) {
      answers . add ( n ) ;
    }
  }
  System . out . println ( answers . size ( ) ) ;
  for ( int answer : answers ) {
    System . out . println ( answer ) ;
  }
}

static final double ceil ( ) {
  String s = "123456789" ;
  int N = Integer . parseInt ( input ( ) ) ;
  String ans = s . charAt ( ( N - 1 ) % 9 ) * Math . ceil ( N / 9 ) ;
  System . out . println ( ans ) ;
}

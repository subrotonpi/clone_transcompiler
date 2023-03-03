static final String getSortKey ( ) {
  final String input = "Input string is not valid" ;
  final int Q = Integer . parseInt ( input ) ;
  final int H = Integer . parseInt ( input ) ;
  final int S = Integer . parseInt ( input ) ;
  final int D = Integer . parseInt ( input ) ;
  final int N = Integer . parseInt ( input ) ;
  final int half = Math . min ( Q * 2 , H ) ;
  final int one = Math . min ( half * 2 , S ) ;
  final int two = Math . min ( one * 2 , D ) ;
  System . out . println ( two * ( N / 2 ) + one * ( N % 2 ) ) ;
}

static final int N ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List = Lists . newArrayList ( Integer . parseInt ( input ( ) ) ) ;
  System . out . println ( Math . ceil ( sum ( List ) / ( N - List . count ( 0 ) ) ) ) ;
}

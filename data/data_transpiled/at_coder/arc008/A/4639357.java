static final void print ( ) {
  String input = System . console ( ) . readLine ( ) ;
  int N = Integer . parseInt ( input ) ;
  System . out . println ( min ( ( N / 10 ) * 100 + ( N % 10 ) * 15 , ( N / 10 + 1 ) * 100 ) ) ;
}

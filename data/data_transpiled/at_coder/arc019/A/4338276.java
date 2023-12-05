static final void setIn ( ) {
  System . setIn ( "" ) ;
  Scanner input = new Scanner ( System . in ) ;
  Map < Character , String > map = Maps . newHashMap ( ) ;
  map . put ( 'O' , '0' ) ;
  map . put ( 'D' , '0' ) ;
  map . put ( 'I' , '1' ) ;
  map . put ( 'Z' , '2' ) ;
  map . put ( 'S' , '5' ) ;
  map . put ( 'B' , '8' ) ;
  String s = input . next ( ) ;
  StringBuffer ans = new StringBuffer ( ) ;
  for ( int i = s . length ( ) - 1 ;
  i >= 0 ;
  i -- ) {
    char c = s . charAt ( i ) ;
    if ( ( c >= '0' ) && ( c <= '9' ) ) {
      ans . append ( c ) ;
    }
    else {
      ans . append ( map . get ( c ) ) ;
    }
  }
  System . out . println ( ans ) ;
}

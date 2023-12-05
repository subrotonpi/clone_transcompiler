private static HashMap < String , String > wDic = new HashMap < String , String > ( ) {
  private static final long serialVersionUID = - 574370526379268839L ;
  {
    for ( int i = 0 ;
    i < Integer . MAX_VALUE ;
    i ++ ) {
      String s = input . next ( ) ;
      wDic . put ( s . substring ( 0 , s . length ( ) - 1 ) , s ) ;
    }
  }
}

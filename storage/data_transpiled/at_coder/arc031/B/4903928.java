static final void search ( int x , int y ) {
  System . setSecurityManager ( new SecurityManager ( ) {
    @ Override public void checkExit ( int answer ) {
      if ( y < 0 || y >= 10 || x < 0 || x >= 10 ) {
        return ;
      }
      if ( a [ x ] [ y ] == 'x' ) {
        return ;
      }
      if ( r [ x ] [ y ] == 'o' ) {
        return ;
      }
      r [ x ] [ y ] = 'o' ;
      search ( x + 1 , y ) ;
      search ( x - 1 , y ) ;
      search ( x , y + 1 ) ;
    }
  }
  ) ;
}

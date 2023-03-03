public static void hoge ( ) {
  hoge = new LinkedList < > ( ) ;
  input . nextLine ( ) ;
  int flag = 0 ;
  while ( true ) {
    if ( ( hoge . size ( ) == 0 ) && flag == 0 ) {
      System . out . println ( "YES" ) ;
      break ;
    }
    else if ( ( hoge . size ( ) == 0 ) && flag == 1 ) {
      System . out . println ( "NO" ) ;
      break ;
    }
    else if ( ( hoge . get ( 0 ) == 'o' ) || ( hoge . get ( 0 ) == 'k' ) || ( hoge . get ( 0 ) == 'u' ) ) {
      hoge . clear ( ) ;
      hoge . add ( hoge . get ( 1 ) ) ;
    }
    else if ( ( hoge . size ( ) >= 2 ) && ( hoge . get ( 0 ) == 'c' ) && ( hoge . get ( 1 ) == 'h' ) ) {
      hoge . clear ( ) ;
      hoge . add ( hoge . get ( 2 ) ) ;
    }
    else {
      flag = 1 ;
      hoge . clear ( ) ;
    }
  }
}

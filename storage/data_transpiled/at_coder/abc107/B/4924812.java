static final double [ ] [ ] getHoge ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < String >> hoge = new ArrayList < > ( ) ;
  List < String > huga = new ArrayList < > ( ) ;
  List < String > hago = new ArrayList < > ( ) ;
  int h = 0 ;
  int w = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    hoge . add ( new LinkedList < > ( ) ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( hoge . get ( i ) . indexOf ( "#" ) != 0 ) ) {
      h ++ ;
      huga . add ( hoge . get ( i ) ) ;
    }
  }
  hoge = new ArrayList < > ( huga ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    if ( ( hoge . get ( i ) . indexOf ( "#" ) != 0 ) ) {
      w ++ ;
      hago . add ( hoge . get ( i ) ) ;
    }
  }
  hago = new ArrayList < > ( hago ) ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    for ( int j = 0 ;
    j < w ;
    j ++ ) {
      System . out . print ( hago . get ( i ) [ j ] + " " ) ;
    }
    System . out . println ( "" ) ;
  }
  return hoge ;
}

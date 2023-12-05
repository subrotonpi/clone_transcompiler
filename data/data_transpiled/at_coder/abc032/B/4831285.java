public static void hoge ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < String > huga = new ArrayList < String > ( ) ;
  if ( ( hoge . size ( ) < n ) && ( hoge . length ( ) < n ) ) {
    System . out . println ( 0 ) ;
  }
  else {
    for ( int i = 0 ;
    i < hoge . size ( ) - n + 1 ;
    i ++ ) {
      huga . add ( hoge . substring ( i , n + i ) ) ;
    }
  }
  HashSet < String > huge = new HashSet < String > ( huga ) ;
  huge . addAll ( huga ) ;
  System . out . println ( huge . size ( ) ) ;
}

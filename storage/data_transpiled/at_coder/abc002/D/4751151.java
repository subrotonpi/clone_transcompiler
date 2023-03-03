public static void fun1 ( ArrayList < ArrayList < Integer >> x ) {
  for ( int th = 0 ;
  th < n ;
  th ++ ) {
    for ( int item = 0 ;
    item < x . size ( ) ;
    item ++ ) {
      boolean d = true ;
      if ( alist . get ( item ) [ th ] == 0 ) {
        d = false ;
        break ;
      }
    }
    if ( d ) {
      x . add ( th ) ;
    }
  }
  factionlist . put ( x . get ( 0 ) , x ) ;
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int m = Integer . parseInt ( input . readLine ( ) ) ;
  ArrayList < ArrayList < Integer >> alist = new ArrayList < ArrayList < Integer >> ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    alist . add ( new ArrayList < Integer > ( ) ) ;
  }
  for ( ArrayList < Integer > partSublist : factionlist ) {
    fun1 ( partSublist ) ;
  }
  int max = factionlist . size ( ) ;
  System . out . println ( max ) ;
}

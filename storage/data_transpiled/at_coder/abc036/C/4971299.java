public static int [ ] getDistance ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  HashMap < Integer , Integer > map = new HashMap < Integer , Integer > ( ) ;
  ArrayList < Integer > a = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int temp = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( ! map . containsKey ( temp ) ) {
      map . put ( temp , 1 ) ;
    }
    a . add ( temp ) ;
  }
  ArrayList < Integer > list = new ArrayList < Integer > ( Collections . list ( map . keySet ( ) ) ) ;
  HashMap < Integer , Integer > table = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < list . size ( ) ;
  i ++ ) {
    table . put ( list . get ( i ) , i ) ;
  }
  for ( int val : a ) {
    System . out . println ( table . get ( val ) ) ;
  }
  return table . get ( ) ;
}

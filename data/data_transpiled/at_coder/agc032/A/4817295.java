public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  LinkedList < Integer > arr = new LinkedList < Integer > ( ) ;
  for ( int idx1 = 1 ;
  idx1 <= N ;
  idx1 ++ ) {
    arr . add ( Integer . parseInt ( input ) ) ;
  }
  ArrayList < Integer > ans = new ArrayList < Integer > ( ) ;
  for ( int idx1 = 1 ;
  idx1 <= N ;
  idx1 ++ ) {
    for ( int idx2 = arr . size ( ) ;
    idx2 > 0 ;
    idx2 -- ) {
      if ( arr . get ( idx2 - 1 ) == idx2 ) {
        Integer tmp = arr . remove ( idx2 - 1 ) ;
        ans . add ( tmp ) ;
        break ;
      }
      else if ( idx2 == 1 ) {
        System . out . println ( - 1 ) ;
        exit ( ) ;
      }
    }
  }
  for ( int idx = 0 ;
  idx <= N ;
  idx ++ ) {
    Integer tmp = ans . remove ( ans . size ( ) - 1 ) ;
    System . out . println ( tmp ) ;
  }
}

public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  List < LinkedList < Integer >> lis = new ArrayList < LinkedList < Integer >> ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) lis . add ( new LinkedList < Integer > ( ) ) ;
  int anlis [ ] = new int [ M ] ;
  for ( int i = 0 ;
  i < anlis . length ;
  i ++ ) anlis [ i ] = i ;
  List < Integer > liSort = new ArrayList < Integer > ( lis ) ;
  Collections . sort ( liSort , new Comparator < Integer > ( ) {
    public int compare ( Integer o1 , Integer o2 ) {
      return ( o1 . intValue ( ) > o2 . intValue ( ) ? 1 : 0 ) ;
    }
  }
  ) ;
  int flag = liSort . get ( 0 ) . intValue ( ) ;
  int i = 1 ;
  for ( Integer x : liSort ) {
    if ( x . intValue ( ) != flag ) {
      flag = x . intValue ( ) ;
      i = 1 ;
    }
    x . intValue ( ) = "0" + i ;
    i ++ ;
  }
  for ( LinkedList < Integer > list : lis ) {
    System . out . println ( "0" + ( 6 - list . get ( 0 ) . intValue ( ) ) + " " + list . get ( 0 ) + " " + list . get ( 1 ) + " " + "\n" ) ;
  }
}

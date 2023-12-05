public static void print ( String s ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < String > list = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    list . add ( input . nextLine ( ) . substring ( 0 , input . length ( ) - 1 ) ) ;
  }
  Collections . sort ( list ) ;
  for ( String s : list ) {
    System . out . println ( s . substring ( 0 , s . length ( ) - 1 ) ) ;
  }
}

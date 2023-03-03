public static void input ( ) {
  String S = input . nextLine ( ) ;
  String T = input . nextLine ( ) ;
  HashMap < String , String > list1 = new HashMap < String , String > ( ) ;
  HashMap < String , String > list2 = new HashMap < String , String > ( ) ;
  boolean flag = true ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( list1 . keySet ( ) . contains ( S [ i ] ) ) {
      if ( list1 . get ( S [ i ] ) . equals ( T [ i ] ) ) {
        flag = false ;
      }
    }
    if ( list2 . keySet ( ) . contains ( T [ i ] ) ) {
      if ( list2 . get ( T [ i ] ) . equals ( S [ i ] ) ) {
        flag = false ;
      }
    }
    list1 . put ( S [ i ] , T [ i ] ) ;
    list2 . put ( T [ i ] , S [ i ] ) ;
  }
  if ( flag ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}

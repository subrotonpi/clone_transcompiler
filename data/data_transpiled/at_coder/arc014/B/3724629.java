public static void main ( String input ) {
  N = Integer . parseInt ( input ) ;
  N -- ;
  String S = input ;
  ArrayList < String > recoder = new ArrayList < String > ( ) ;
  recoder . add ( S ) ;
  boolean flag = true ;
  String S_tail = S . substring ( S . length ( ) - 1 ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    S = input . substring ( 0 , S . length ( ) - 1 ) ;
    String S_head = S . substring ( 0 , S . length ( ) - 1 ) ;
    if ( S_tail != S_head || recoder . contains ( S ) && flag ) {
      if ( i % 2 != 0 ) {
        System . out . println ( "LOSE" ) ;
      }
      else {
        System . out . println ( "WIN" ) ;
      }
      flag = false ;
      break ;
    }
    else {
      S_tail = S . substring ( S . length ( ) - 1 , S . length ( ) - 1 ) ;
      recoder . add ( S ) ;
    }
  }
  if ( flag == true ) {
    System . out . println ( "DRAW" ) ;
  }
}

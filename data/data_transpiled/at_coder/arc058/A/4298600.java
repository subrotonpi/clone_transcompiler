public static int N = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > D = Collections . list ( input . nextLine ( ) . split ( " " ) ) ;
  for ( int i = N ;
  i < 100000 ;
  i ++ ) {
    boolean ans = true ;
    for ( int j = 0 ;
    j < Integer . toString ( i ) . length ( ) ;
    j ++ ) {
      if ( ( D . contains ( Integer . toString ( j ) ) ) ) {
        ans = false ;
        break ;
      }
    }
    if ( ( ans ) && ( i != N ) ) {
      System . out . println ( i ) ;
      exit ( ) ;
    }
  }
  return N ;
}

public static void numArray ( ) {
  int gap = 1000 ;
  for ( int i = 0 ;
  i <= numArray . length - 2 ;
  i ++ ) {
    if ( Math . abs ( 753 - Integer . parseInt ( numArray . substring ( i , i + 3 ) ) ) < gap ) {
      gap = Math . abs ( 753 - Integer . parseInt ( numArray . substring ( i , i + 3 ) ) ) ;
    }
  }
  System . out . println ( gap ) ;
}

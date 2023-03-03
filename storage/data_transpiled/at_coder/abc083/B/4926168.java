public static int [ ] listNAB ( ) {
  String listNAB [ ] = input . nextLine ( ) . split ( " " ) ;
  int listNABint [ ] = new int [ 3 ] ;
  for ( String s : listNAB ) {
    listNABint [ 0 ] = Integer . parseInt ( s ) ;
  }
  /* place sum */
  String y = String . valueOf ( listNAB ) ;
  int counter = 0 ;
  for ( int i = 0 ;
  i < y . length ( ) ;
  i ++ ) {
    counter += Integer . parseInt ( y . charAt ( i ) ) ;
  }
  int sumcounter = 0 ;
  for ( int i = 0 ;
  i < listNABint [ 0 ] ;
  i ++ ) {
    if ( listNABint [ 1 ] <= listNABint [ i ] & listNABint [ 2 ] ) {
      sumcounter += listNABint [ i ] + 1 ;
    }
  }
  System . out . println ( sumcounter ) ;
  return new int [ ] {
  }
  ;
}

public static int N = Integer . parseInt ( input ) {
  String [ ] list_an = input . split ( " " ) ;
  int [ ] list_an_int = new int [ N ] ;
  for ( String s : list_an ) {
    list_an_int [ s . length ( ) ] = Integer . parseInt ( s ) ;
  }
  Arrays . sort ( list_an_int ) ;
  Arrays . reverse ( list_an_int ) ;
  int Alice_counter = 0 ;
  int Bob_counter = 0 ;
  int counter = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( counter % 2 == 0 ) Alice_counter += list_an_int [ i ] ;
    else Bob_counter += list_an_int [ i ] ;
    counter ++ ;
  }
  return Alice_counter - Bob_counter ;
}

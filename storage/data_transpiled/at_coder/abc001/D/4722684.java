public static int N = Integer . parseInt ( input ) {
  int [ ] Rain = new int [ 60 * 24 + 2 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) Rain [ i ] = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) Rain [ i ] = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String s = input . nextLine ( ) ;
    String e = input . nextLine ( ) ;
    int sh = Integer . parseInt ( s . substring ( 0 , 2 ) ) * 60 ;
    int sm = Integer . parseInt ( s . substring ( 2 ) ) ;
    int S = ( ( sh + sm ) / 5 ) * 5 ;
    int eh = Integer . parseInt ( e . substring ( 0 , 2 ) ) * 60 ;
    int em = Integer . parseInt ( e . substring ( 2 ) ) ;
    int E = ( ( eh + em + 4 ) / 5 ) * 5 ;
    Rain [ S ] ++ ;
    Rain [ E ] -- ;
  }
  int [ ] Rainsum = new int [ N ] ;
  Rainsum [ 0 ] = Rain [ 0 ] ;
  for ( int i = 1 ;
  i < Rain . length ;
  i ++ ) Rainsum [ i ] = Rainsum [ i - 1 ] + Rain [ i ] ;
  int Flag = 0 ;
  String out = "" ;
  for ( int i = 0 ;
  i < Rainsum . length ;
  i ++ ) {
    if ( Flag == 0 && Rainsum [ i ] >= 1 ) {
      Flag = 1 ;
      if ( i / 60 >= 10 ) out += Integer . toString ( i / 60 ) ;
      else if ( i / 60 >= 1 ) out += "0" + Integer . toString ( i / 60 ) ;
      else if ( i / 60 == 0 ) out += "00" ;
      if ( i % 60 >= 10 ) out += Integer . toString ( i % 60 ) ;
      else if ( i % 60 >= 1 ) out += "0" + Integer . toString ( i % 60 ) ;
      else if ( i % 60 == 0 ) out += "00" ;
      out += "-" ;
    }
    else if ( Flag == 1 && Rainsum [ i ] == 0 ) {
      Flag = 0 ;
      if ( i / 60 >= 10 ) out += Integer . toString ( i / 60 ) ;
      else if ( i / 60 >= 1 ) out += "0" + Integer . toString ( i / 60 ) ;
      else if (
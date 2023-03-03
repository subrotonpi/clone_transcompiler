public static int N = Integer . parseInt ( input ) {
  String w = input . nextLine ( ) ;
  String numbers = "" ;
  for ( int i = 0 ;
  i < w . length ( ) ;
  i ++ ) {
    switch ( w . charAt ( i ) ) {
      case 'b' : case 'c' : case 'B' : case 'C' : numbers += "1" ;
      break ;
      case 'd' : case 'w' : case 'D' : case 'W' : numbers += "2" ;
      break ;
      case 't' : case 'j' : case 'T' : case 'J' : numbers += "3" ;
      break ;
      case 'f' : case 'q' : case 'F' : case 'Q' : numbers += "4" ;
      break ;
      case 'l' : case 'v' : case 'L' : case 'V' : numbers += "5" ;
      break ;
      case 's' : case 'x' : case 'S' : case 'X' : numbers += "6" ;
      break ;
      case 'p' : case 'm' : case 'P' : case 'M' : numbers += "7" ;
      break ;
      case 'h' : case 'k' : case 'H' : case 'K' : numbers += "8" ;
      break ;
      case 'n' : case 'g' : case 'N' : case 'G' : numbers += "9" ;
      break ;
      case 'z' : case 'r' : case 'Z' : case 'R' : numbers += "0" ;
      break ;
      case ' ' : int end = numbers . length ( ) ;
      int spaces = 0 ;
      for ( int j = 0 ;
      j < end ;
      j ++ ) {
        if ( numbers . charAt ( end - 1 - j ) == ' ' ) spaces ++ ;
        else break ;
      }
      System . out . println ( numbers . substring ( 0 , spaces ) ) ;
      int i = 0 ;
      for ( int j = 0 ;
      j < end ;
      j ++ ) {
        if ( numbers . charAt ( end - 1 - j ) == ' ' ) spaces ++ ;
        else break ;
      }
    }
  }
  int end = numbers . length ( ) ;
  int spaces = 0 ;
  for ( int j = 0 ;
  j < end ;
  j ++ ) {
    if ( numbers . charAt ( j ) == ' ' ) spaces ++ ;
    else break ;
  }
  System . out . println ( numbers . substring ( 0 , end - spaces ) ) ;
  return end ;
}

public static void print ( String l ) {
  l = input . nextLine ( ) ;
  int ca = 0 ;
  int cb = 0 ;
  int cc = 0 ;
  int cd = 0 ;
  int ce = 0 ;
  int cf = 0 ;
  for ( int i = 0 ;
  i < l . length ( ) ;
  i ++ ) {
    switch ( l . charAt ( i ) ) {
      case 'A' : ca ++ ;
      break ;
      case 'B' : cb ++ ;
      case 'C' : cc ++ ;
      break ;
      case 'D' : cd ++ ;
      case 'E' : ce ++ ;
      case 'F' : cf ++ ;
      break ;
    }
  }
}

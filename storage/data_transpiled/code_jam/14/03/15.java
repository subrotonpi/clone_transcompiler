public static String mines ( int r , int c , int m ) throws IOException {
  if ( r == 1 ) {
    if ( m >= c ) {
      return "Impossible\n" ;
    }
    else {
      return "c" + "." + "." + "*" + "\n" + "*" + "\n" + "c" + "\n" ;
    }
  }
  else if ( c == 1 ) {
    if ( m >= r ) {
      return "Impossible\n" ;
    }
    else {
      return "c\n" + ".\n" + "." + "*" + "\n" + "c" + "\n" + "r" + "\n" + "c" + "\n" + "r" + "\n" + "c" + "\n" + "r" + "\n" + "r" + "\n" + "c" + "\n" + "r" + "\n" + "r" + "\n" + "c" + "\n" + "r" + "\n" + "r" + "\n" + "r" + "\n" + "c" + "\n" + "r" + "\n" + "r" + "\n" + "r" + "\n" + "c" + "\n" + "r" + "\n" + "r" + "\n" + "r" + "\n" + "c" + "\n" + "r" + "\n" + "r" + "\n" + "r" + "\n" + "c" + "\n" + "r" + "\n" + "r" + "\n" + "r" + "\n" + "r" + "\n" + "c" + "\n" + "r" + "\n" + "r" + "\n" + "r" + "\n" + "r" + "\n" + "c" + "\n" + "r" + "\n" + "r" + "\n" + "r" + "\n" + "r" + "\n" + "r" + "\n" + "r" + "\n" + "c" + "\n" + "r" + "\n" + "r" + "\n" + "r" + "\n" + "c" + "
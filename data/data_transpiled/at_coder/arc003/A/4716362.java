public static void print ( int n ) {
  String list = input . next ( ) ;
  int gpa = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    switch ( list . charAt ( i ) ) {
      case 'A' : gpa += 4 ;
      break ;
      case 'B' : gpa += 3 ;
      break ;
      case 'C' : gpa += 2 ;
      break ;
      case 'D' : gpa += 1 ;
      break ;
    }
  }
  System . out . println ( gpa / n ) ;
}

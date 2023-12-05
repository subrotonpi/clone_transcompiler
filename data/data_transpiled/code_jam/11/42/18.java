@ Test ( description = "B-small" ) public static boolean isValid ( int [ ] [ ] data , int size , int top , int left ) throws IOException {
  int balance = 0 ;
  int weight = size - 1 ;
  for ( int r : xrange ( top , top + size ) ) {
    int row = 0 ;
    for ( int c : xrange ( left , left + size ) ) row += data [ r ] [ c ] ;
    if ( r == top || r == top + size - 1 ) row -= data [ r ] [ left ] + data [ r ] [ left + size - 1 ] ;
    balance += row * weight ;
    weight -= 2 ;
  }
  if ( balance != 0 ) return false ;
  weight = size - 1 ;
  for ( int c : xrange ( left , left + size ) ) {
    int col = 0 ;
    for ( int r : xrange ( top , top + size ) ) col += data [ r ] [ c ] ;
    if ( c == left || c == left + size - 1 ) col -= data [ top ] [ c ] + data [ top + size - 1 ] [ c ] ;
    balance += col * weight ;
    weight -= 2 ;
  }
  if ( balance != 0 ) return false ;
  return true ;
}

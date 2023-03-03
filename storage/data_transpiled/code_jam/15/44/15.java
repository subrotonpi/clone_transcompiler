@ Sys public static long solve ( Map < Pair < Long , Long > , Long > table , int c , boolean lastWas3 , int rowsLeft , int i3 , int i4 , int i6 ) {
  if ( rowsLeft == 0 ) {
    long result = i3 * i4 * i6 ;
    if ( i6 > 1 ) result /= 6 ;
    else if ( i4 > 1 ) result /= 4 ;
    else if ( i3 > 1 ) result /= 3 ;
    return result ;
  }
  Long result = table . get ( new Pair < Long , Long > ( lastWas3 , rowsLeft , i3 , i4 , i6 ) ) ;
  if ( result != null ) {
    return result ;
  }
  result = 0 ;
  if ( lastWas3 ) {
    if ( rowsLeft >= 1 ) result += solve ( table , c , ! lastWas3 , rowsLeft - 1 , i3 , i4 , i6 ) ;
    if ( rowsLeft >= 2 && c % 3 == 0 ) result += solve ( table , c , ! lastWas3 , rowsLeft - 2 , i3 * 3 , i4 , i6 ) ;
    if ( rowsLeft >= 2 && c % 6 == 0 ) result += solve ( table , c , ! lastWas3 , rowsLeft - 2 , i3 , i4 , i6 * 6 ) ;
    if ( rowsLeft >= 3 && c % 4 == 0 ) result += solve ( table , c , ! lastWas3 , rowsLeft - 3 , i3 , i4 * 4 , i6 ) ;
  }
  else {
    if ( rowsLeft >= 2 ) result += solve ( table , c , ! lastWas3 , rowsLeft - 2 , i3 , i4 , i6 ) ;
  }
  result %= 1000000007 ;
  table . put ( new Pair < Long , Long > ( lastWas3 , rowsLeft , i3 , i4 , i6 ) , result ) ;
  return result ;
}

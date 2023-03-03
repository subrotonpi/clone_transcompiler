public static int n ( ) {
  n = input ( ) ;
  return ( 'Yes' if ( int . parseInt ( n ) % eval ( '+' . join ( list ( n ) ) ) == 0 ) else 'No' ) ;
}

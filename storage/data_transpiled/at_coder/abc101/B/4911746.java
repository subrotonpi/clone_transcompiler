public static int N ( ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  n = list ( Integer . parseInt ( String . valueOf ( N ) ) ) ;
  return print ( N % sum ( n ) == 0 ? 'Yes' : 'No' ) ;
}

public static void print ( int n , int m ) {
  int l = Integer . parseInt ( input . nextLine ( ) ) ;
  int i = Math . abs ( m - n ) / 10 ;
  int c = 0 ;
  if ( 0 <= i && i <= 3 ) c = i ;
  else if ( 4 <= i && i <= 7 ) c = 1 + Math . abs ( i - 5 ) ;
  else c = 10 - i + 1 ;
  System . out . println ( l + c ) ;
}

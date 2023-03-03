public static int input ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = a * b ;
  if ( a % 3 == 0 || b % 3 == 0 ) ans = 0 ;
  if ( a > 2 ) ans = Math . min ( ans , a ) ;
  if ( b > 2 ) ans = Math . min ( ans , b ) ;
  for ( int i = 1 ;
  i < a ;
  i ++ ) {
    int m = Math . max ( Math . abs ( b * i - b / 2 * ( a - i ) ) , Math . abs ( b / 2 * ( a - i ) - ( - ( - b / 2 ) * ( a - i ) ) ) ) ;
    ans = Math . min ( m , ans ) ;
  }
  for ( int i = 1 ;
  i < b ;
  i ++ ) {
    int m = Math . max ( Math . abs ( a * i - a / 2 * ( b - i ) ) , Math . abs ( a / 2 * ( b - i ) - ( - ( - a / 2 ) * ( b - i ) ) ) ) ;
    ans = Math . min ( m , ans ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}

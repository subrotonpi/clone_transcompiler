@ VisibleForTesting static void fractions ( ) {
  int a = Integer . parseInt ( input ( ) ) , b = Integer . parseInt ( input ( ) ) ;
  int n = Integer . parseInt ( input ( ) ) ;
  int ans = a * b / gcd ( a , b ) ;
  int i = 1 ;
  while ( ans * i < n ) {
    i ++ ;
  }
  System . out . println ( ans * i ) ;
}

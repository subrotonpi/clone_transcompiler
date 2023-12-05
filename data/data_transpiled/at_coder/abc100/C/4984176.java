static public int countDiv2 ( @ Self int n ) {
  int sum = 0 ;
  while ( n % 2 == 0 ) {
    sum ++ ;
    n /= 2 ;
  }
  return sum ;
}

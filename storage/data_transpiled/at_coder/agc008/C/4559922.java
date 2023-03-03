public static int i , int o , int t , int j , int l , int s , int z ;
int a = 0 ;
int b = 0 ;
if ( i > 0 && j > 0 && l > 0 ) {
  a += 3 ;
  for ( int k = i - 1 ;
  k <= j ;
  k += l - 1 ) {
    if ( k % 2 == 1 ) {
      a += k - 1 ;
    }
    else {
      a += k ;
    }
  }
}

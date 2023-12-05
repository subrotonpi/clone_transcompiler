public static int N ( ) {
  int [ ] A = Integer . parseInt ( input ( ) ) ;
  int tmpxor = 0 ;
  int tmpadd = 0 ;
  int ans = 0 ;
  int minindex = 0 ;
  int maxindex = 0 ;
  for ( int e = 0 ;
  e < A . length ;
  e ++ ) {
    int i = A [ e ] ;
    tmpadd += i ;
    tmpxor ^= i ;
    maxindex = e ;
    if ( tmpxor != tmpadd ) {
      while ( tmpxor != tmpadd && minindex < e ) {
        tmpxor ^= A [ minindex ] ;
        tmpadd -= A [ minindex ] ;
        minindex ++ ;
      }
    }
    ans += maxindex - minindex + 1 ;
  }
  return ans ;
}

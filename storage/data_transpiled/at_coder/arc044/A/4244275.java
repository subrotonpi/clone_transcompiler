public static String aPrime ( int N ) {
  if ( N == 1 ) {
    return "Not Prime" ;
  }
  boolean isPrime = true ;
  for ( int k = 2 ;
  k <= ( int ) ( N * 0.5 ) ;
  k ++ ) {
    if ( N % k == 0 ) {
      isPrime = false ;
      break ;
    }
  }
  String ans ;
  if ( isPrime ) {
    ans = "Prime" ;
  }
  else {
    String nStr = Integer . toString ( N ) ;
    boolean cond [ ] = {
      N % 10 != 0 , 2 , 4 , 5 , 6 , 8 }
      ;
      ans = Arrays . binarySearch ( nStr , nStr ) ;
    }
    return ans ;
  }
  
@ VisibleForTesting static int [ ] [ ] counts ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  String S = input ( ) ;
  String s1 = S . substring ( 0 , N ) , s2 = S . substring ( N - 1 , S . length ( ) - 1 ) ;
  return counts ( s1 ) ;
}

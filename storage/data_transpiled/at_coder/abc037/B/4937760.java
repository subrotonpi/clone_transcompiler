public static void main ( String input , int n , int q ) {
  int [ ] Ans = new int [ n ] ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int l = Integer . parseInt ( input . substring ( 0 , i ) ) ;
    int r = Integer . parseInt ( input . substring ( i + 1 , i + 1 ) ) ;
    int t = Integer . parseInt ( input . substring ( i + 1 , i + 1 ) ) ;
    for ( int j = 0 ;
    j < r - l + 1 ;
    j ++ ) Ans [ l + j - 1 ] = t ;
  }
  for ( int a : Ans ) {
    System . out . println ( a ) ;
  }
}

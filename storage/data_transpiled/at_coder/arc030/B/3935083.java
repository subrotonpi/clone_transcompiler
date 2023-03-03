, n = Integer . MAX_VALUE , x = Integer . MIN_VALUE ) ;
x -= 1 ;
h = Collections . reverseOrder ( ) ;
int [ ] [ ] tree = new int [ n ] [ n ] ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  int a = Integer . parseInt ( input . readLine ( ) ) ;
  int b = Integer . parseInt ( input . readLine ( ) ) ;
  a -- ;
  b -- ;
  tree [ a ] [ b ] = b ;
  tree [ b ] [ a ] = a ;
}
int ans = 0 ;
{
  int prev = 0 ;
  boolean ors = false ;
  for ( int t : tree [ s ] ) {
    if ( t == prev ) continue ;
    int res = dfs ( s , t ) ;
    ans += res * 2 ;
    ors |= res ;
  }
  return ors | h [ s ] ;
}
}

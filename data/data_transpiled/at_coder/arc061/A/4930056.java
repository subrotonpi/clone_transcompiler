input ;
int lenS = s . length ( ) ;
int ans = 0 ;
/* dfs(x, lenX, i) */
if ( i < lenX ) {
  /* dfs(x, lenX, i) */
  x = x . substring ( 0 , i + 1 ) + "+" + x . substring ( i + 1 ) ;
  /* dfs(x, lenX+1, i) */
  ans += Integer . parseInt ( x ) ;
}

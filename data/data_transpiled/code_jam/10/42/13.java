static final int solve ( int m , int cost , int num ) {
  final Map < Integer , Integer > mem = null ;
  int ret ;
  int i ;
  int m = 0 ;
  int m = 0 ;
  int cost = cost ;
  int num = 0 ;
  if ( m < 0 ) {
    cost = 0 ;
    m = 0 ;
    cost = 0 ;
    left = null ;
    right = null ;
    parent = null ;
  }
  else {
    if ( mem . containsKey ( ( node = mem . get ( ( node = num ) ) ) ) ) {
      return mem . get ( ( node = mem . get ( ( node = num ) ) ) ) ;
    }
    else {
      if ( mem . containsKey ( ( node = mem . get ( ( node = num ) ) ) ) ) {
        return mem . get ( ( node = mem . get ( ( node = num ) ) ) ) ;
      }
      ret = num ;
    }
  }
  int A = node . cost + solve ( node . left , x + 1 , ll - 1 ) + solve ( node . right , x + 1 , ll - 1 ) ;
  if ( node . m - x <= ll - 1 ) {
    int B = solve ( node . left , x , ll - 1 ) + solve ( node . right , x , ll - 1 ) ;
    ret = Math . min ( A , B ) ;
  }
  else {
    ret = A ;
  }
  mem . put ( ( node = mem . get ( ( num ) ) ) , ret ) ;
  return ret ;
}

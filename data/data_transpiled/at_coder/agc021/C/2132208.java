public static String solve ( int n , int m , int a , int b ) {
  int cell = n * m ;
  int need = 2 * ( a + b ) ;
  if ( cell < need ) {
    return "NO" ;
  }
  String d = ".<>^v" ;
  int [ ] [ ] f = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    f [ i ] [ j ] = 3 ;
    f [ i + 1 ] [ j ] = 4 ;
  }
  return "YES\n" + StringUtils . join ( map ( d , r -> r , m ) , "\n" ) ;
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  m = Integer . parseInt ( input . nextLine ( ) ) ;
  a = Integer . parseInt ( input . nextLine ( ) ) ;
  b = Integer . parseInt ( input . nextLine ( ) ) ;
  System . out . println ( solve ( n , m , a , b ) ) ;
  if ( a > 0 ) {
    f [ i ] [ j ] = 1 ;
    f [ i ] [ j + 1 ] = 2 ;
    a -- ;
  }
  else {
    break ;
  }
  if ( m > 0 ) {
    for ( int i = 0 ;
    i < n - 1 ;
    i += 2 ) {
      if ( b > 0 ) {
        f [ i ] [ j ] = 3 ;
        f [ i + 1 ] [ j ] = 4 ;
        b -- ;
      }
      else {
        break ;
      }
    }
  }
  int sqa = a / 2 ;
  int sqb = b / 2 ;
  int sq = sqa + sqb ;
  boolean ra = a & 1 , rb = b & 1 ;
  int sqc = ( n / 2 ) * ( m / 2 ) ;
  if ( sq > sqc ) {
    return "NO" ;
  }
  if ( sq == sqc && ( ra || rb ) ) {
    return "NO" ;
  }
  if ( sq + 1 == sqc && ( ra && rb ) ) {
    if ( n & 1 && m & 1 ) {
      f [ i - 3 ] [ j ] = f [ i - 1 ] [ j ] = 1 ;
      f [ i - 3 ] [ j ] = f [ i + 1 ] [ j ] = 2 ;
      sqa -- ;
    }
    else {
      break ;
    }
  }
  int i = 0 , j = 0 ;
  for ( i = 0 ;
  i < n - 1 ;
  i += 2 ) {
    for
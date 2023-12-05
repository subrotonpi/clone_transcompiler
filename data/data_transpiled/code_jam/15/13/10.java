static final Scanner input = new Scanner ( System . in ) {
  @ Override public int [ ] next ( ) {
    return new int [ 3 ] ;
  }
}
;
System . in = new BufferedReader ( new FileReader ( "a.in" ) ) ;
System . out = new PrintWriter ( new FileWriter ( "a.out" ) ) ;
int [ ] ans = new int [ 3 ] ;
int n = 0 ;
{
  int [ ] getline = new int [ 3 ] ;
  for ( String c : input . nextLine ( ) . split ( " " ) ) {
    getline [ 0 ] = Integer . parseInt ( c ) ;
  }
  int [ ] same = new int [ 3 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int t = 0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      int v = q [ i ] ;
      if ( v > u . x * u . x + v > u . y * u . y >= 0 ) {
        t ++ ;
      }
    }
  }
  {
    int ma = 0 ;
    Arrays . sort ( q ) ;
    double pi = 3.14159265359 ;
    double eps = 0.0000000001 ;
    double [ ] p = q . clone ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      p [ i ] = q [ i ] + 2 * pi ;
    }
    int j = 0 ;
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      while ( j + 1 < p . length && p [ j + 1 ] - p [ i ] < pi + eps ) {
        j ++ ;
      }
      if ( j == p . length ) {
        return 0 ;
      }
      ma = Math . max ( ma , j - i + 1 ) ;
    }
    return max ( 0 , n - 1 - ma ) ;
  }
}
;
/*solve the answer */
int T = 0 ;
int n = 0 ;
double pi = 3.14159265359 ;
Arrays . fill ( ans , 0 ) ;
double [ ] p = new double [ n ] ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  p [ i ] = getline ;
}
if ( n <= 3 ) {
  return ans ;
}
for ( int i = 0 ;
i < n ;
i ++ ) {
  q = new int [ n ] ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    if ( i != j ) {
      double x = p [ j
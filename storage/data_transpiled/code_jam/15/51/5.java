static final int solve ( int n , int d , int S0 , int As , int Cs , int Rs , int M0 , int Am , int Cm , int Rm ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  System . setSecurityManager ( new RMISecurityManager ( ) ) ;
  /* solve the number of possible solutions */
  int [ ] [ ] employees = new int [ n ] [ n ] ;
  int [ ] managers = new int [ n ] ;
  int [ ] salaries = new int [ n ] ;
  employees [ 0 ] = new int [ n ] ;
  managers [ 0 ] = null ;
  salaries [ 0 ] = S0 ;
  int S = S0 ;
  int M = M0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    S = ( S * As + Cs ) % Rs ;
    M = ( M * Am + Cm ) % Rm ;
    employees [ i ] = new int [ n ] ;
    managers [ i ] = M % i ;
    employees [ i ] [ 0 ] = i ;
    salaries [ i ] = S ;
  }
  /* best solutions */
  List < Integer > bySalary = new ArrayList < Integer > ( ) ;
  Collections . sort ( bySalary ) ;
  int lowCost = 0 ;
  for ( int i = 0 ;
  i < bySalary . size ( ) ;
  i ++ ) {
    int j = i + 1 ;
    while ( j < bySalary . size ( ) && salaries . get ( bySalary . get ( j ) ) - salaries . get ( bySalary . get ( i ) ) <= d ) {
      j ++ ;
    }
    Set < Integer > removed = new HashSet < Integer > ( ) ;
    for ( int k = 0 ;
    k < i ;
    k ++ ) {
      /* add to removed */
    }
    for ( int k = j ;
    k < bySalary . size ( ) ;
    k ++ ) {
      /* add to removed */
      if ( lowCost == 0 || removed . size ( ) < lowCost ) {
        lowCost = removed . size ( ) ;
      }
      if ( j == bySalary . size ( ) ) {
        break ;
      }
    }
    /* add to removed */
    for ( int e : employees [ m ] ) {
      /* add to removed */
    }
  }
  int nCases = input ( ) ;
  for ( int i = 1 ;
  i <=
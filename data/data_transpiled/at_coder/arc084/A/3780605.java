public static int N ( ) {
  int [ ] a = new int [ N ] ;
  int [ ] b = new int [ N ] ;
  int [ ] c = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) b [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) c [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Integer > sortedA = new ArrayList < Integer > ( a ) ;
  ArrayList < Integer > sortedB = new ArrayList < Integer > ( b ) ;
  ArrayList < Integer > sortedC = new ArrayList < Integer > ( c ) ;
  Collections . sort ( sortedA ) ;
  Collections . sort ( sortedB ) ;
  Collections . sort ( sortedC ) ;
  int ans = 0 ;
  int beforeA = 0 ;
  int beforeC = 0 ;
  int countA = 0 ;
  int countCRest = 0 ;
  for ( int eachB : sortedB ) {
    for ( int ai = beforeA ;
    ai < sortedA . size ( ) ;
    ai ++ ) {
      if ( eachB > sortedA . get ( ai ) ) {
        countA ++ ;
        beforeA ++ ;
      }
      else {
        beforeA = ai ;
        break ;
      }
    }
    for ( int ci = beforeC ;
    ci < sortedC . size ( ) ;
    ci ++ ) {
      if ( sortedC . get ( ci ) <= eachB ) {
        countCRest ++ ;
        beforeC ++ ;
      }
      else {
        beforeC = ci ;
        break ;
      }
    }
    ans += countA * ( sortedC . size ( ) - countCRest ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}

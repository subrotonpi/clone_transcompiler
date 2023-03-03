public static int N = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  /* Get the nums of the array */
  ArrayList < Integer > ar = new ArrayList < Integer > ( ar ) ;
  Collections . sort ( ar ) ;
  int tmp = 0 ;
  for ( int a : ar ) {
    tmp += wa / a ;
    wa %= a ;
  }
  /* Get the list of integers */
  ArrayList < Integer > nines = new ArrayList < Integer > ( ) ;
  tmp = 9 ;
  while ( tmp <= N ) {
    nines . add ( tmp ) ;
    tmp *= 9 ;
  }
  ArrayList < Integer > sixes = new ArrayList < Integer > ( ) ;
  tmp = 6 ;
  while ( tmp <= N ) {
    sixes . add ( tmp ) ;
    tmp *= 6 ;
  }
  int res = N ;
  for ( int t = 0 ;
  t <= N ;
  t ++ ) {
    int hoge = getNum ( t , sixes ) + getNum ( N - t , nines ) ;
    res = Math . min ( res , hoge ) ;
  }
  System . out . println ( res ) ;
  return res ;
}

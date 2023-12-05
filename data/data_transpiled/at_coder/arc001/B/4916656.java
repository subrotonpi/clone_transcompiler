public static int n = Integer . parseInt ( input ) {
  int [ ] c = new int [ n ] ;
  for ( int i = 0 ;
  i < c . length ;
  i ++ ) c [ i ] = i ;
  int maxi = - 1 ;
  int mini = 200 ;
  for ( int i = 1 ;
  i <= 5 ;
  i ++ ) {
    int now = c [ i ] ;
    maxi = Math . max ( maxi , now ) ;
    mini = Math . min ( mini , now ) ;
  }
  System . out . println ( maxi + " " + mini ) ;
  return mini ;
}

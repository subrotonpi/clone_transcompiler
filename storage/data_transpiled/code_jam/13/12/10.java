public static int solve ( int start , int end , int regain , int maximum , int [ ] weights ) {
  if ( weights . length == 0 ) return 0 ;
  int high = Collections . max ( new ArrayList < Integer > ( weights ) , new Comparator < Integer > ( ) {
    public int compare ( Integer o1 , Integer o2 ) {
      int x = start + regain * high ;
      int y = end - regain * ( weights . length - high ) ;
      if ( x > maximum ) x = maximum ;
      if ( y < 0 ) y = 0 ;
      int left = solve ( start , x , regain , maximum , weights , 0 , high ) ;
      int right = solve ( y + regain , end , regain , maximum , weights , high + 1 ) ;
      return left + right + ( x - y ) * weights [ high ] ;
    }
  }
  ) ;
  int nCases = input . nextInt ( ) ;
  for ( int testCase = 1 ;
  testCase <= nCases ;
  testCase ++ ) {
    maximum = Integer . parseInt ( input . nextLine ( ) ) ;
    regain = Integer . parseInt ( input . nextLine ( ) ) ;
    n = input . nextInt ( ) ;
    weights = Integer . parseInt ( input . nextLine ( ) ) ;
    System . out . println ( "Case #" + testCase + ": " + solve ( maximum , 0 , regain , maximum , weights ) ) ;
  }
  return 0 ;
}

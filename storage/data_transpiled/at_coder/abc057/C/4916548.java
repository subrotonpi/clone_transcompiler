static final double [ ] getDigits ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Integer > pf_list = new ArrayList < > ( ) ;
  double min_digit = Double . MIN_VALUE ;
  for ( int i = 1 ;
  i <= ( int ) Math . sqrt ( n ) ;
  i ++ ) {
    if ( n % i == 0 ) {
      int a = Integer . toString ( ( int ) i ) . length ( ) ;
      int b = Integer . toString ( ( int ) ( n / i ) ) . length ( ) ;
      List < Integer > tmpList = new ArrayList < > ( ) ;
      tmpList . add ( a ) ;
      if ( min_digit > Collections . max ( tmpList ) ) {
        min_digit = Collections . max ( tmpList ) ;
      }
    }
  }
  return pf_list . toArray ( ) ;
}

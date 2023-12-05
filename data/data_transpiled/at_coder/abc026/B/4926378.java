@ edu . umd . cs . findbugs . annotations . SuppressWarnings ( value = "NP" , justification = "A number of values is used to calculate the number of values in the array." ) public static double N_Heavy ( @ edu . umd . cs . findbugs . annotations . SuppressWarnings ( value = "NP" , justification = "A number of values is used to calculate the number of values in the array." ) int N , @ edu . umd . cs . findbugs . annotations . SuppressWarnings ( value = "NP" , justification = "A number of values is used to calculate the number of values in the array." ) int [ ] R ) {
  Arrays . sort ( R , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return - o1 . compareTo ( o2 ) ;
    }
  }
  ) ;
  double S = 0 ;
  for ( int i = 0 ;
  i < R . length ;
  i ++ ) {
    if ( i % 2 == 0 ) {
      S += R [ i ] * R [ i ] ;
    }
    else {
      S -= R [ i ] * R [ i ] ;
    }
  }
  return S * PI ;
}

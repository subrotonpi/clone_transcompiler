public static String merge ( int N , @ NonNull List < City > cities ) {
  int maxPeople = 0 ;
  String city = "atcoder" ;
  int total = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String c = cities . get ( i ) . getCountry ( ) ;
    int p = cities . get ( i ) . getCountry ( ) ;
    if ( maxPeople < p ) {
      maxPeople = p ;
      city = c ;
    }
    total += p ;
  }
  return maxPeople > total / 2 ? city : "atcoder" ;
}

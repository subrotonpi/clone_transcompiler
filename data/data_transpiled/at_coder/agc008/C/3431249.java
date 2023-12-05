public static void print ( int Ai , int Ao , int At , int Aj , int Al , int As , int Az ) {
  int ans = Ao + 2 * ( Ai / 2 + Aj / 2 + Al / 2 ) ;
  if ( Ai > 0 && Aj > 0 && Al > 0 ) {
    ans = Math . max ( ans , Ao + 2 * ( ( Ai - 1 ) / 2 + ( Aj - 1 ) / 2 + ( Al - 1 ) / 2 ) + 3 ) ;
  }
  System . out . println ( ans ) ;
}

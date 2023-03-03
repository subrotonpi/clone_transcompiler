public static int takAndHotels ( @ IntRange ( from = 0 , to = 100 ) int N , @ IntRange ( from = 0 , to = 100 ) int K , @ IntRange ( from = 0 , to = 100 ) int X , @ IntRange ( from = 0 , to = 100 ) int Y ) {
  return Math . min ( N , K ) * X + Math . max ( 0 , N - K ) * Y ;
}

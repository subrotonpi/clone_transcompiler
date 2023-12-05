public static int INF = 1000000000 ;
int count = 0 ;
int health = hd ;
do {
  count ++ ;
  if ( num_debuf > 0 ) {
    if ( health <= ak - d ) {
      health = hd ;
    }
    else {
      num_debuf -- ;
      ak -= d ;
      if ( ak < 0 ) ak = 0 ;
    }
  }
  else if ( num_buff > 0 ) {
    if ( health <= ak ) {
      health = hd ;
    }
    else {
      num_buff -- ;
      ad += b ;
    }
  }
  else if ( health <= ak && ad < hk ) {
    health = hd ;
  }
  else {
    hk -= ad ;
  }
  if ( hk <= 0 ) return count ;
  health -= ak ;
  if ( health <= 0 ) return INF ;
  if ( count >= num_buff + num_debuf + 202 ) return INF ;
}
while ( count < 100 ) ;
{
  int hd = Integer . parseInt ( input . nextLine ( ) ) ;
  int ad = Integer . parseInt ( input . nextLine ( ) ) ;
  int hk = Integer . parseInt ( input . nextLine ( ) ) ;
  int ak = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int d = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = INF ;
  for ( int x = 0 ;
  x <= 101 ;
  x ++ ) for ( int y = 0 ;
  y <= 101 ;
  y ++ ) ans = Math . min ( ans , check ( hd , ad , hk , ak , b , d , x , y ) ) ;
  if ( ans == INF ) ans = "IMPOSSIBLE" ;
  System . out . print ( "Case #" + testNum + ": " + ans + "\n" ) ;
}
for ( int i = 1 ;
i <= Integer . MAX_VALUE ;
i ++ ) {
  solve ( i ) ;
}
return 0 ;
}

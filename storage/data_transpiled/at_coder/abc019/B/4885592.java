public static void hoge ( Scanner scanner ) {
  char mae = ' ' ;
  int kazu = 0 ;
  int flag = 0 ;
  for ( int i = 0 ;
  i < hoge . length ;
  i ++ ) {
    char moji = hoge [ i ] ;
    if ( ( moji == mae ) && ( flag == 0 ) ) {
      kazu ++ ;
    }
    else {
      System . out . print ( kazu ) ;
    }
    System . out . print ( moji ) ;
    kazu = 1 ;
  }
  mae = hoge [ i ] ;
}

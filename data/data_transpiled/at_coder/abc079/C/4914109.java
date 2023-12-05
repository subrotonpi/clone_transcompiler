public static void input ( String abcd ) {
  int a = Integer . parseInt ( abcd . substring ( 0 , 1 ) ) ;
  int b = Integer . parseInt ( abcd . substring ( 1 , 2 ) ) ;
  int c = Integer . parseInt ( abcd . substring ( 2 , 3 ) ) ;
  int d = Integer . parseInt ( abcd . substring ( 3 , 4 ) ) ;
  if ( a + b + c + d == 7 ) {
    System . out . println ( a + "+" + b + "+" + c + "+" + "+d+" = 7 "+" ▁ ");}elseif(a+b+c-d==7){System.out.println(a+" + "+b+" + "+c+" - "+d+" = 7 "+" ▁ ");}elseif(a+b-c+d==7){System.out.println(a+" + "+b+" - "+c+" + "+" + d + "=7" + " " ) ;
  }
  else if ( a + b - c - d == 7 ) {
    System . out . println ( a + "+" + b + "-" + c + "-" + d + "=7" + " " ) ;
  }
  else if ( a - b + c + d == 7 ) {
    System . out . println ( a + "-" + b + "+" + c + "+" + "+d+" = 7 "+" ▁ ");}elseif(a-b+c-d==7){System.out.println(a+" - "+b+" - "+c+" + "+" + d + "=7" + " " ) ;
  }
  else if ( a - b - c - d == 7 ) {
    System . out . println ( a + "-" + b + "-" + c + "+" + "+d+" = 7 "+" ▁ ");}elseif(a-b+c-d==7){System.out.println(a+" - "+b+" - "+c+" + "+" + d + "=7" + " " ) ;
  }
  else {
    System . out . println ( a + "-" + b + "-" + c +
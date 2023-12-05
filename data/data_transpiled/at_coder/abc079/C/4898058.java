public static void print ( int num ) {
  int a = num / 1000 ;
  int b = num % 1000 / 100 ;
  int c = num % 100 / 10 ;
  int d = num % 10 ;
  if ( a + b + c + d == 7 ) {
    print ( a + "+" + b + "+" + c + "+" + "+d+" = ",7," ");}elseif(a+b+c-d==7){print(a+" + "+b+" + "+c+" - "+d+" = ",7," ");}elseif(a+b-c+d==7){print(a+" + "+b+" + "+c+" - "+d+" = ",7," ");}elseif(a+b-c-d==7){print(a+" + "+b+" - "+c+" - "+d+" = ",7," ");}elseif(a-b+c+d==7){print(a+" - "+b+" + "+c+" + "+d+" = ",7," ");}elseif(a-b+c-d==7){print(a+" - "+b+" + "+c+" - "+d+" = ",7," ");}elseif(a-b-c+d==7){print(a+" - "+b+" - "+c+" - "+d+" = ",7," ");}else{print(a+" - "+b+" - "+c+" - "+d+" = ",7," " ) ; } }
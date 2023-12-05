public static int t = Integer . parseInt ( input ) {
  int t = input . nextInt ( ) ;
  /* assert(s.length() % 2) == 0;
  int k = s.length() / 2;
  Stack<Character> stack = new Stack<>();
  int score = 0;
  for (int i = 0; i < s.length(); i++) {
  if ((stack.isEmpty() || s.charAt(i) != stack.peek()) && k>0) {
  k--;
  stack.push(s.charAt(i));
  }
  else {
  char e = stack.pop();
  if (e == s.charAt(i)) {
  score += 10;
  }
  }
  }*/
  return score ;
}

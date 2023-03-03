def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.dp = [ ]
    def go ( self ) :
        sc = _main.raw_input ( )
        s = sc.strip ( )
        count = 0
        char = '-'
        ans = ""
        for i in range ( 0 , len ( s ) ) :
            if i == 0 :
                char = s [ i ]
                count += 1
            elif i == len ( s ) :
                ans = ans + str ( char ) + str ( count )
            elif char == s [ i ] :
                count += 1
            else :
                ans = ans + str ( char ) + str ( count )
                count = 1
                char = s [ i ]
        print ( ans )

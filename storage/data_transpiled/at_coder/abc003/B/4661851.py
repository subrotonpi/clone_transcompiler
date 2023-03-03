def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
    def __init__ ( self ) :
        self.N = 0
    def main ( self ) :
        sc = _main ( )
        s = sc.split ( )
        s2 = sc.split ( )
        ans = "You can win"
        chenge = [ 'a' , 't' , 'c' , 'o' , 'd' , 'e' , 'r' ]
        for i in range ( len ( s ) ) :
            flag = False
            if s [ i ] == '@' :
                for j in range ( 7 ) :
                    if s2 [ i ] == chenge [ j ] or s2 [ i ] == '@' : flag = True
                if flag == False :
                    ans = "You will lose"
        elif s2 [ i ] == '@' :
            if s [ i ].lower ( ) == s2 [ i ].lower ( ) == False :
                ans = "You will lose"
    for i in range ( len ( s2 ) ) :
        flag = False
        if s2 [ i ] == '@' :
            for j in range ( 7 ) :
                if s2 [ i ] == chenge [ j ] or s2 [ i ] == '@' : flag = True
            if flag == False :
                ans = "You will lose"
    print ( ans )

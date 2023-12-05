def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.readline ( )
        t = sc.readline ( )
        for i in range ( len ( s ) ) :
            tmpt = t [ i ]
            tmps = s [ i ]
            if tmpt != tmps :
                if tmpt == '@' and ( tmps == 'a' or tmps == 't' or tmps == 'c' or tmps == 'o' or tmps == 'd' or tmps == 'e' or tmps == 'r' ) :
                    pass
                elif tmps == '@' and ( tmpt == 'a' or tmpt == 't' or tmpt == 'c' or tmpt == 'o' or tmpt == 'd' or tmpt == 'e' or tmpt == 'r' ) :
                    pass
                else :
                    print ( 'You will lose' )
                    return
        print ( 'You can win' )

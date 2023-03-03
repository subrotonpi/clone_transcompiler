def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.read ( )
        a = [ sc.read ( ) for i in range ( N ) ]
        button = 0
        count = 1
        while a [ button ] != 2 :
            button = a [ button ] - 1
            count += 1
            if count > N :
                break
        print ( count if count < N else - 1 )

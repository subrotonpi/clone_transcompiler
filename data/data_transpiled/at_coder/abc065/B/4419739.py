def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = int ( sc.readline ( ) )
        a = [ int ( i ) for i in sc.readline ( ).split ( ) ]
        count = 0
        n = 0
        c = False
        for i in range ( N ) :
            if n + 1 == 2 :
                c = True
                break
            n = a [ n ] - 1
            count += 1
        if c :
            print ( count )
        else :
            print ( - 1 )

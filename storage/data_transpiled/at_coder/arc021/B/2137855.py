def import sys
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        L = sc.getmaxyx ( )
        a = [ sc.choice ( args ) for i in range ( L ) ]
        b = [ sc.choice ( args ) for i in range ( L ) ]
        xor = b [ 0 ] ^ b [ 1 ]
        for i in range ( 2 , L - 1 ) :
            xor = xor ^ b [ i ]
        if L == 2 and b [ 0 ] != b [ 1 ] :
            print ( - 1 )
        elif L != 2 and b [ L - 1 ] != xor :
            print ( - 1 )
        else :
            a [ 0 ] = 0
            print ( a [ 0 ] )
            for i in range ( 1 , L ) :
                a [ i ] = a [ i - 1 ] ^ b [ i - 1 ]
                print ( a [ i ] )

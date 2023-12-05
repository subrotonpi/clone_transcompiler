def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        po = [ 0 ] * ( n + 1 )
        po [ sc.readline ( ).strip ( ) ] += 1
        m = sc.readline ( ).strip ( )
        for i in range ( m ) :
            po [ sc.readline ( ).strip ( ) ] += 1
        b = True
        for i in range ( n + 1 ) :
            if po [ i ] > 1 :
                b = False
                break
        print ( 'YES' if b else 'NO' )

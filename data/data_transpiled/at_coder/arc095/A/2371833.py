def import import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        import sys
        sys.stdout.write ( '\n' )
    def __call__ ( self , * args ) :
        import sys
        n = sys.argv.index ( 'n' )
        a = [ ]
        for i in range ( n ) :
            a.append ( sys.stdin.read ( ) )
        b = [ x for x in a if x <= mid ]
        b.sort ( )
        mid = b [ n // 2 - 1 ]
        mid1 = b [ n // 2 ]
        for i in range ( n ) :
            if a [ i ] <= mid :
                print ( mid1 )
            else :
                print ( mid )

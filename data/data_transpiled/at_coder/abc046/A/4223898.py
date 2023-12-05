def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        bucket = [ True ] * 105
        for i in range ( 3 ) :
            bucket [ sc.read ( ) ] = True
        count = 0
        for i in bucket :
            if i :
                count += 1
        print ( count )

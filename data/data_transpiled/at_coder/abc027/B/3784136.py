def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        line = sys.stdin.readline ( ).split ( )
        arr = [ ]
        total = 0
        for i in range ( n ) :
            arr.append ( int ( line [ i ] ) )
            total += arr [ i ]
        if total % n != 0 :
            print ( - 1 )
            return
        bridges = 0
        avg = total / n
        current_total = current_size = 0
        for i in range ( n ) :
            if ( current_total + arr [ i ] ) == avg * ( current_size + 1 ) :
                current_total = 0
                current_size = 0
            else :
                current_total += arr [ i ]
                current_size += 1
                bridges += 1
        print ( bridges )

def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
    map = { 'b' : '1' , 'c' : '1' , 'd' : '2' , 'w' : '2' , 't' : '3' , 'j' : '3' , 'f' : '4' , 'q' : '4' , 'l' : '5' , 'v' : '5' , 's' : '6' , 'x' : '6' , 'p' : '7' , 'm' : '7' , 'h' : '8' , 'k' : '8' , 'n' : '9' , 'g' : '9' , 'z' : '0' , 'r' : '0' }
    N = len ( sys.stdin.readline ( ).strip ( ).split ( ) )
    result = [ ]
    w = [ ]
    for i in range ( N ) :
        w.append ( sys.stdin.readline ( ).lower ( ).split ( ) )
    for i in range ( len ( w ) ) :
        w = [ ]
        for c in w [ i ] :
            num = map.get ( c , None )
            if num is not None :
                w [ i ] = num
        if w :
            result.append ( ' '.join ( w ) )
    print ( ' '.join ( result ) )

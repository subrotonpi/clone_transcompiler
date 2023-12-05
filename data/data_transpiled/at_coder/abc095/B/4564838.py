def main ( ) :
    import sys
    import random
    import string
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.ans , self.s = string.split ( string.strip ( ) )
        def __call__ ( self , x ) :
            return string.strip ( x )
    n = int ( sys.stdin.readline ( ) )
    x = int ( sys.stdin.readline ( ) )
    a = [ ]
    for i in range ( n ) :
        a.append ( int ( sys.stdin.readline ( ) ) )
        x -= a [ i ]
    a.sort ( )
    ans = n
    for _ in range ( n ) :
        x -= a [ 0 ]
        if x < 0 :
            break
        ans += 1
    print ( ans )

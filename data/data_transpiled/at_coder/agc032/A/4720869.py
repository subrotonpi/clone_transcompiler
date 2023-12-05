def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
    def main ( self ) :
        return sys.stdin.read ( )
    def main ( self ) :
        return sys.stdin.read ( )
    n = int ( n )
    a = [ ]
    for i in range ( n ) :
        a.append ( i )
    def main ( self ) :
        b = [ ]
        for i in range ( n ) :
            b.append ( a [ n - i - 1 ] )
    ans = [ ]
    canans = True
    for i in range ( n ) :
        for j in range ( len ( b ) ) :
            if b [ j ] == len ( b ) - j :
                ans.append ( b [ j ] )
                del b [ j ]
                break
            elif j == len ( b ) - 1 :
                i = n
                print ( '-1' )
                canans = False
    if canans :
        for i in range ( n ) :
            print ( ans [ n - i - 1 ] )

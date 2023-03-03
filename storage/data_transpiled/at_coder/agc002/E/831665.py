def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.read ( )
        a = [ sc.read ( ) for i in range ( N ) ]
        if self.firstWin ( N , a ) : print ( "First" )
        else : print ( "Second" )
    def firstWin ( N , a ) :
        a.sort ( )
        for i in range ( N ) :
            if N - i <= a [ i ] :
                win = ( a [ i ] - ( N - i ) ) % 2 == 1
                sameSize = 0
                for j in range ( i - 1 , 0 , a [ j ] ) :
                    sameSize += 1
                win |= sameSize % 2 == 1
                return win
        return False

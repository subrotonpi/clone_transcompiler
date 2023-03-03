def import _solve
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n , self.k = sys.stdin.readline ( ).split ( '' )
        self.s = sys.stdin.readline ( ).split ( '' )
        self.c = s.split ( '' )
        self.c = [ ]
        self.c = [ ]
        self.c = [ ]
        self.ans = ''
        for i in range ( self.n ) :
            for j in range ( self.n ) :
                if self.c [ j ] == '\0' :
                    continue
                if self.count ( ans , self.c , self.c [ j ] ) <= k :
                    self.ans += self.c [ j ]
                    self.c.append ( '\0' )
                    break
        print ( self.ans )
    def count ( self , ans , c , ch ) :
        diff = 0
        for i in range ( len ( ans ) ) :
            diff += 0 if s [ i ] == ans [ i ] else 1
        if ch != self.s [ len ( ans ) ] :
            diff += 1
        a = [ 0 ] * 26
        for b in c :
            if b == '\0' :
                continue
            a [ b - 'a' ] += 1
        a [ ch - 'a' ] -= 1
        for i in range ( len ( ans ) + 1 , len ( s ) ) :
            idx = s [ i ] - 'a'
            if a [ idx ] > 0 :
                a [ idx ] -= 1
            else :
                diff += 1
        return diff
return Main

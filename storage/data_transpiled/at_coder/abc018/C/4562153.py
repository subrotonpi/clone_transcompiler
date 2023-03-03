def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.ans = 0
        self.n , self.m , self.k = self.sc.n , self.m , self.k
        po = [ ]
        for s in self.sc.split ( '' , 1 ) :
            for i in range ( self.m ) :
                po.append ( ( s [ i ] == 'o' ) )
        self.oo = [ ]
        for i in range ( self.n ) :
            for j in range ( self.m ) :
                min , max = 0 , 0
                inp = self.i
                while inp >= 0 and po [ inp ] [ j ] :
                    inp -= 1
                    min += 1
                inp = self.i
                while inp < self.n and po [ inp ] [ j ] :
                    inp += 1
                    max += 1
                self.oo.append ( min )
        for i in range ( self.k - 1 , self.n - self.k + 1 ) :
            for j in range ( self.k - 1 , self.m - self.k + 1 ) :
                d = True
                for a in range ( self.k ) :
                    d = d and ( oo [ i ] [ j - a ] >= self.k - a ) and ( oo [ i ] [ j + a ] >= self.k - a )
                if d :
                    self.ans += 1
        print ( self.ans )

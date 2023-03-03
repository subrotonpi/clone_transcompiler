def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.ts = int ( sys.stdin.readline ( ).strip ( ) )
        for ti in range ( 1 , ts + 1 ) :
            self.n = int ( sys.stdin.readline ( ).strip ( ) )
    def run ( self ) :
        self.ts = int ( sys.stdin.readline ( ).strip ( ) )
        for ti in range ( 1 , ts + 1 ) :
            self.n = int ( sys.stdin.readline ( ).strip ( ) )
            self.ok = True
            parts = None
            count = None
            for l , line in enumerate ( self.split ( ) ) :
                if self.parts is None :
                    self.parts = line
                    self.count = [ ]
                elif len ( line ) != len ( self.parts ) :
                    self.ok = False
                else :
                    for part in self.parts :
                        if part [ 0 ] != line [ 0 ] :
                            self.ok = False
                            break
                if self.ok :
                    for part in self.parts :
                        self.count.append ( len ( part ) )
            ans = 0
            if self.ok :
                for part in self.parts :
                    ans += _cost ( part )
            print ( 'Case #%d: %s\n' % ( ti , self.ans if self.ok else 'Fegla Won' ) )
    def split ( self , line ) :
        res = [ ]
        current = [ ]
        prev = self.line [ 0 ]
        for c in line :
            if c != prev :
                res.append ( ''.join ( current ) )
                current = [ ]
                prev = c
            current.append ( c )
        res.append ( ''.join ( current ) )
        return res
    def cost ( self , arr ) :
        m , s = median ( arr ) , 0
        for i in arr :
            s += abs ( i - m )
        return s
    def median ( self ) :
        arr = self.arr [ 0 ]
        return arr

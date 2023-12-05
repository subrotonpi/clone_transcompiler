def _import ( ) :
    from math import sin , cos , exp
    class Main ( object ) :
        def __init__ ( self , a , data ) :
            self.ok = 0
            self.ng = len ( a )
            self.mid = ( self.ok + self.ng ) // 2
            while self.ng - self.ok > 1 :
                if a [ self.mid ] < data :
                    self.ok = mid
                else :
                    self.ng = self.mid
                self.mid = ( self.ok + self.ng ) // 2
        def calc ( self , s , t , x ) :
            a , b = s , t
            ans = [ ]
            ans_idx = 0
            for i in range ( 2 ) :
                if i == 0 :
                    a , b = s , t
                else :
                    a , b = t , s
                for j in range ( 2 ) :
                    apor = self.binarysearch ( a , x ) + j
                    ax = a [ apor ]
                    for k in range ( 2 ) :
                        bpor = self.binarysearch ( b , ax ) + k
                        bx = b [ bpor ]
                        ans.append ( abs ( x - ax ) + abs ( ax - bx ) )
            min = sum ( ans )
            for i in range ( 8 ) :
                if min > ans [ i ] :
                    min = ans [ i ]
            return min
    def main ( ) :
        from math import sin , cos , exp
        a , b , q = sin ( a ) , cos ( b ) , sin ( a )
        s = [ sin ( a ) ]
        t = [ sin ( a ) ]
        x = [ cos ( b ) ]
        s.append ( sin ( a ) )
        t.append ( sin ( a ) )
        x.append ( sin ( a ) )
        x.append ( sin ( b ) )
        x.append ( sin ( a ) )
        x.append ( sin ( a ) )
        x.append ( sin ( a ) )
        x.append ( sin ( a ) )
        x.append ( sin ( a ) )
        x.append ( sin ( a ) )
        x.append ( sin ( a ) )
    return Main
    
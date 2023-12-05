def _import ( ) : return open ( NAME + '.in' , 'w' )
class A :
    def __init__ ( self , f ) :
        self.f = f
        self.f = f
        self.SUBMIT = True
        self.NAME = 'A-large'
    def main2 ( self ) :
        n = self.f.tell ( )
        w = 1 << n
        r = self.f.tell ( )
        p = self.f.tell ( )
        s = self.f.tell ( )
        for i in range ( n , 1 , - 1 ) :
            a23 = p - r
            a2 = ( a23 + s )
            if a2 % 2 != 0 :
                self.f.write ( 'IMPOSSIBLE' )
                return
            a2 /= 2
            a1 = p - a2
            a3 = r - a1
            if a2 < 0 or a1 < 0 or a3 < 0 :
                self.f.write ( 'IMPOSSIBLE' )
                return
            p = a1
            s = a2
            r = a3
        arr = [ ]
        if p == 1 : arr.append ( 0 )
        if r == 1 : arr.append ( 1 )
        if s == 1 : arr.append ( 2 )
        self.f.write ( construct ( arr [ 0 ] , n ) )
    def xx ( self ) :
        if self.left == 0 :
            return [ xx ( self ) ]
        a1 = self.construct ( self , self.left - 1 )
        a2 = self.construct ( ( self.left + 1 ) % 3 , self.left - 1 )
        first = True
        for i in range ( len ( a1 ) ) :
            if a1 [ i ] != a2 [ i ] :
                first = a1 [ i ] < a2 [ i ]
                break
        if first :
            ret = a1 [ 0 : 1 << left ] + a2 [ 0 : 1 << left ] + a1 [ 1 : ]
            return ret
        else :
            ret = a1 [ 0 : 1 << left ] + a2 [ 0 : 1 << left ] + a1 [ 1 : ]
            return ret

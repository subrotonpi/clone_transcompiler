def import _main
class Main ( object ) :
    def __init__ ( self , d , idx ) :
        self.d = d
        self.idx = idx
    def __init__ ( self , d , idx ) :
        self.d = d
        self.idx = idx
    def main ( self ) :
        sc = _main ( )
        R , C , N = sc.regs [ 0 ]
        lst = [ ]
        for i in range ( N ) :
            x1 , y1 = sc.regs [ 1 ]
            x2 , y2 = sc.regs [ 2 ]
            if self.is_on_edge ( x1 , y1 ) and self.is_on_edge ( x2 , y2 ) :
                lst.append ( ( _main ( self , convert ( x1 , y1 ) , i ) , _main ( self , convert ( x2 , y2 ) , i ) ) )
        lst.sort ( key = lambda t1 : t1.d - t2.d )
        stack = list ( )
        for t in lst :
            if not stack [ - 1 ] and stack [ - 1 ].idx == t.idx :
                stack.pop ( )
            else :
                stack.append ( t )
        print ( 'YES' if stack else 'NO' )
        sc.close ( )
    def is_on_edge ( self , x , y ) :
        return x in [ R , C ]
    def convert ( x , y ) :
        if x == 0 : return y
        elif y == C : return C + x
        elif x == R : return C + R + ( C - y )
        else : return C + R + C + ( R - x )

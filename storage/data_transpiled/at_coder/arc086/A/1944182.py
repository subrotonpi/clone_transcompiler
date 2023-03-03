def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.id , self.val = self.id , self.val
    def __lt__ ( self , o ) :
        return cmp ( self.val , o.val )
    def main ( self ) :
        sc = _main ( )
        N , K = sc.regs [ 0 ]
        arr = [ 0 ] * 200001
        seen = set ( )
        for i in range ( 1 , N + 1 ) :
            n = sc.regs [ i ]
            arr [ n ] += 1
            seen.add ( n )
        queue = [ ]
        for i in range ( 1 , N + 1 ) :
            if arr [ i ] != 0 :
                queue.append ( ( i , arr [ i ] ) )
        count = 0
        while len ( seen ) > K :
            count += queue [ - 1 ].val
            seen.discard ( queue.pop ( ).id )
        print ( count )

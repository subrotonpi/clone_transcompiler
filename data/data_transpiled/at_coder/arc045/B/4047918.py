def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            n , m = sc.regs [ 0 ]
            a , b = [ ] , [ ]
            ssm = SegSumMin ( n )
            for i in range ( m ) :
                v = sc.regs [ i ] - 1
                arr [ ( i >> k ) ] += v
                if v == 0 : break
            lazy [ ( i >> k ) * 2 ] += v
            lazy [ ( i >> k ) * 2 + 1 ] += v
    stack = [ ]
    size = 0
    for i in range ( m ) :
        min = ssm.min ( a [ i ] , b [ i ] )
        if min > 1 : stack.append ( i )
    print ( size )
    for i in range ( size ) :
        print ( stack [ i + 1 ] )
    class SegSumMin ( object ) :
        def __init__ ( self , n ) :
            self.n = ( n == 1 )
            self.size = self.n * 2
            self.arr = [ ]
            self.lazy = [ ]
            for i in range ( self.n + n ) :
                self.arr.append ( int ( i ) / 10 )
        def add ( self , left , right , v ) :
            self.left += n
            self.right += n
            lc , rc = self.left , self.right
            self.propagate ( left )
            self.propagate ( right )
            for left in self.left :
                if left & 1 :
                    self.lazy [ left ] += v
                if right & 1 :
                    self.lazy [ right ] += v
            self.pop_up ( lc )
            self.pop_up ( rc )
        def pop_up ( self ) :
            for i in self.left :
                self.arr [ i >> 1 ] = min ( self.arr [ i ] + self.lazy [ i ] , self.arr [ i ] )
    return Main

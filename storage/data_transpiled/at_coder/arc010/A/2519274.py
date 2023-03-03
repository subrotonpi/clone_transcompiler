def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.N , self.M , self.A , self.B = sys.stdin.read ( ).split ( '\n' )
    sc = Main ( )
    N , M , A , B = sc.regs [ 0 ]
    c = [ ]
    for i in range ( M ) :
        c.append ( sc.regs [ i ] )
    for i in range ( M ) :
        if N <= A :
            N += B
        N = N - c [ i ]
        if N < 0 :
            print ( i + 1 )
            return
    print ( 'complete' )

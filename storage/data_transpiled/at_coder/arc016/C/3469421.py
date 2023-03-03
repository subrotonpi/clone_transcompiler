def import import _sys , get_bit , set_bit , set_bit , * args , ** kwargs ) :
    import sys
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = 0
            self.m = 0
            self.memo = np.zeros ( 1024 * 4 )
            self.I = np.zeros ( ( 100 , 100 ) )
            self.P = np.zeros ( ( 100 , 100 ) )
            self.cost = np.zeros ( ( 10 , 10 ) )
            self.C = np.zeros ( ( 10 , 10 ) )
        def Scanner ( ) :
            sc = _sys.stdin
            self.n = sc.n
            self.m = sc.m
            for i in range ( self.m ) :
                self.C [ i ] = sc.randint ( 0 , 100 )
                self.cost [ i ] = sc.randint ( 0 , 100 )
                for j in range ( self.C [ i ] ) :
                    self.I [ i ] [ j ] = sc.randint ( 0 , 100 ) - 1
                    self.P [ i ] [ j ] = sc.randint ( 0 , 100 )
    memo [ ( 1 << n ) - 1 ] = 0
    for s in range ( ( 1 << n ) - 1 , - 1 , - 1 ) :
        for i in range ( self.m ) :
            sum = self.cost [ i ]
            k = 0
            for j in range ( self.C [ i ] ) :
                if not get_bit ( s , I [ i ] [ j ] ) :
                    sum += self.memo [ set_bit ( s , I [ i ] [ j ] ) ] * self.P [ i ] [ j ] / 100.0
                else :
                    k += self.P [ i ] [ j ]
            memo [ s ] = min ( memo [ s ] , sum * 100.0 / ( 100 - k ) )
    print ( memo [ 0 ] )
    def getbit ( num , i ) :
        return ( ( num & ( 1 << i ) ) != 0 )
    def setbit ( num , i ) :
        return num | ( 1 << i )

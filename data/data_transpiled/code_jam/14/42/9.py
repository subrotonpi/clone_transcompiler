def test_solve ( ) :
    import sys
    from random import randint
    from time import sleep
    class B ( object ) :
        def solve ( self ) :
            t = randint ( 0 , 100000 )
            for current_test in range ( t ) :
                n = randint ( 0 , 100000 )
                a = [ randint ( 0 , 10000 ) for _ in range ( n ) ]
                self.out.write ( "Case #%d: %s\n" % ( current_test + 1 , solve ( a ) ) )
    def solve ( self ) :
        n = len ( self )
        before = [ 0 for _ in range ( n ) ]
        after = [ 0 for _ in range ( n ) ]
        for i in range ( n ) :
            for j in range ( i ) :
                if self.a [ j ] > self.a [ i ] :
                    before [ i ] += 1
            for j in range ( i + 1 , n ) :
                if self.a [ j ] > self.a [ i ] :
                    after [ i ] += 1
        ans = 0
        for i in range ( n ) :
            ans += min ( before [ i ] , after [ i ] )
        return ans
    def main ( self ) :
        filename = "b.in"
        input = sys.stdin
        output = sys.stdout
        if os.path.exists ( filename ) and os.access ( filename , os.R_OK ) :
            input = open ( filename , "r" )
            output = sys.stdout
        f = input.readlines ( )
        f.close ( )
        solve ( )
        f.close ( )
    def readline ( self ) :
        while not self.eof :
            line = f.readline ( )
            if not line :
                return
            line = line.rstrip ( )
            if line :
                return line
        return None
    def readline ( self ) :
        return self.__next__ ( )
    def write ( self , line ) :
        return line

def _import ( ) :
    import os
    import sys
    import os
    import sys
    import os
    import math
    import scanner
    class C :
        def __init__ ( self ) :
            self.n = 0
            self.low = 0
            self.high = 1
            self.lowB = 0
            self.highB = 0
            self.a = [ ]
            self.sol = 0
        def check ( self.d ) :
            for i in range ( self.n ) :
                if ( self.d % self.a [ i ] != 0 ) :
                    return False
                if ( self.d >= self.low ) :
                    return True
                else :
                    return False
        self.d += 1
    if not os.path.exists ( 'C-large.in' ) :
        return
    try :
        input = open ( 'C-large.in' , 'r' )
        output = open ( 'C-large.out' , 'w' )
        test_number = int ( input.readline ( ) )
        scanner = Scanner ( input )
        for t in range ( 1 , test_number + 1 ) :
            print ( t , test_number )
            n , low , lowB = scanner.next ( )
            high , highB = scanner.next ( )
            a = [ ]
            for i in range ( self.n ) :
                a.append ( scanner.next ( ) )
            found = False
            lcm = 0
            for i in range ( 1 , n ) :
                gcd = lcm.gcd ( [ int ( i ) for i in a ] )
                lcm = lcm * gcd ( [ int ( i ) for i in a ] ) / gcd
                if lcm > highB :
                    break
            print ( lcm )
            if lcm <= highB :
                sum = lcm
                tmp = lcm
                while sum <= high :
                    if ( sum >= low ) :
                        sol = sum
                        break
    except Exception as ex :
        print ( ex )
    return

def main ( * orange ) :
    import sys
    import random
    import sys
    import sys
    import pyarrow.core.hiker as hiker
    input = open ( "input.txt" , "r" )
    num_cases = input.read ( )
    for n in range ( num_cases ) :
        N = input.read ( )
        hikers = [ ]
        for i in range ( N ) :
            D , H , M = random.randint ( 1 , N )
            for j in range ( H ) :
                hikers.append ( hiker ( D , M + j ) )
        min_encounters = float ( "inf" )
        num_hikers = len ( hikers )
        num_encounters = 0
        num_passed = 0
        for i in range ( 3 * num_hikers ) :
            next = hikers.pop ( )
            if next.passed :
                num_encounters += 1
            else :
                num_passed += 1
            next.passed = True
            next.cross += 360.* next.M
            hikers.append ( next )
            if num_encounters + num_hikers - num_passed < min_encounters :
                min_encounters = num_encounters + num_hikers - num_passed
        print ( "Case #%d: " % ( n + 1 ) )
        print ( min_encounters )
    class Hiker ( object ) :
        D = int ( input.read ( ) )
        M = int ( input.read ( ) )
        cross = ( 360.- D ) * M
        passed = False
        def __init__ ( self , D , M ) :
            self.D = D
            self.M = M
            self.cross = ( 360.- D ) * M
            self.passed = False
        def __lt__ ( self , other ) :
            if self.cross > other.cross :
                return 1
            elif self.cross < other.cross :
                return - 1
            elif self.passed and not self.passed :
                return - 1
            elif not self.passed and other.passed :
                return 1
            return 0

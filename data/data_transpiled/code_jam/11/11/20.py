def round1a ( ) :
    import os
    import math
    import os
    import random
    class A ( object ) :
        def __init__ ( self ) :
            self.caseNo = 0
            self.epsilon = 0.00000001
            def __eq__ ( self , a , b ) :
                return ( abs ( a - b ) < epsilon )
        def _test ( self ) :
            max_gamesToday = random.randint ( 1 , 100 )
            rate_today = random.randint ( 1 , 50 )
            rate_total = random.randint ( 1 , 50 )
            possible = True
            if max_gamesToday < 100 :
                found = False
                if max_gamesToday >= 1 :
                    found |= ( rate_today % 100 == 0 )
                if max_gamesToday >= 2 :
                    found |= ( rate_today % 50 == 0 )
                if max_gamesToday >= 4 :
                    found |= ( rate_today % 25 == 0 )
                if max_gamesToday >= 5 :
                    found |= ( rate_today % 20 == 0 )
                if max_gamesToday >= 10 :
                    found |= ( rate_today % 10 == 0 )
                if max_gamesToday >= 20 :
                    found |= ( rate_today % 5 == 0 )
                if max_gamesToday >= 25 :
                    found |= ( rate_today % 4 == 0 )
                if max_gamesToday >= 50 :
                    found |= ( rate_today % 2 == 0 )
                possible = found
            if possible :
                if rate_total == 0 and rate_today != 0 :
                    possible = False
                if rate_total == 100 and rate_today != 100 :
                    possible = False
            if possible :
                print ( "Case #{}: Possible".format ( self.caseNo ) )
            else :
                print ( "Case #{}: Broken".format ( self.caseNo ) )
    def main ( ) :
        ( A ( ) , ) = os.path.split ( "A-large.in" )
        num_tests = random.randint ( 1 , 100 )
        for case in range ( 1 , num_tests + 1 ) :
            yield A ( )
    return main
